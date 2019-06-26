package me.txie.leetcode.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TemplateFinder {

    private static final String TEMPLATES_DIR = "/templates";

    public static List<Template> getTemplates() throws URISyntaxException, IOException {
        Configuration cfg = createConfigInstance();
        List<String> templateNames = getTemplateNames();
        return templateNames.stream()
            .map(wrapper(cfg::getTemplate))
            .collect(Collectors.toList());
    }

    private static <T, R, E extends Exception>
    Function<T, R> wrapper(FunctionWithException<T, R, E> f) {
        return arg -> {
            try {
                return f.apply(arg);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static List<String> getTemplateNames() throws URISyntaxException, IOException {
        URL resource = TemplateFinder.class.getResource(TEMPLATES_DIR);
        Path path = Paths.get(resource.toURI());

        List<String> fileNames = new ArrayList<>();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            for (Path file : ds) {
                fileNames.add(file.getFileName().toString());
            }
        }
        return fileNames;
    }

    private static Configuration createConfigInstance() {
        // Create your Configuration instance, and specify if up to what FreeMarker
        // version (here 2.3.28) do you want to apply the fixes that are not 100%
        // backward-compatible. See the Configuration JavaDoc for details.
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);

        // Specify the source where the template files come from:
        cfg.setClassForTemplateLoading(SourceCodeGenerator.class, TEMPLATES_DIR);

        // Set the preferred charset template files are stored in. UTF-8 is
        // a good choice in most applications:
        cfg.setDefaultEncoding("UTF-8");

        // Sets how errors will appear.
        // During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        // Don't log exceptions inside FreeMarker that it will thrown at you anyway:
        cfg.setLogTemplateExceptions(false);

        // Wrap unchecked exceptions thrown during template processing into TemplateException-s.
        cfg.setWrapUncheckedExceptions(true);

        return cfg;
    }
}
