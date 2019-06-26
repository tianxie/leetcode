package me.txie.leetcode.generator;

import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class SourceCodeGenerator {

    private static final String JAVA_SRC = "src/main/java";
    private static final String TEST_SRC = "src/test/java";
    private static final String SPOCK_SRC = "src/test/groovy";

    private static final String JAVA_EXT = "java";
    private static final String GROOVY_EXT = "groovy";

    public static void main(String[] args) throws IOException, URISyntaxException {

        Problem dataModel = createDataModel();

        List<Template> templates = TemplateFinder.getTemplates();

        mergeDataModelWithTemplates(dataModel, templates);

    }

    private static void mergeDataModelWithTemplates(Problem dataModel, List<Template> templates) {
        String projectRoot = System.getProperty("user.dir");
        String packageName = dataModel.getPackageName();
        String packagePath = packageName.replaceAll("\\.", "/");
        String problemName = dataModel.getProblemName();

        Map<Path, Template> templateMap = templates.stream().collect(
            toMap(template -> buildSourcePath(projectRoot, packagePath, problemName, template.getName()),
                Function.identity())
        );

        for (Path path : templateMap.keySet()) {
            Path parent = path.getParent();
            try {
                if (!Files.exists(parent)) {
                    Files.createDirectories(parent);
                }
            } catch (IOException e) {
                System.err.println(e);
                continue;
            }

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                Template template = templateMap.get(path);
                template.process(dataModel, writer);
            } catch (IOException | TemplateException e) {
                System.err.println(e);
            }
        }
    }

    private static Path buildSourcePath(String projectRoot, String packagePath,
                                        String problemName, String templateName) {
        if (templateName.contains("/")) {
            templateName = templateName.substring(templateName.lastIndexOf("/") + 1);
        }

        String fileName = templateName.substring(0, templateName.indexOf("."));
        if (fileName.endsWith("Test")) {
            return Paths.get(projectRoot, TEST_SRC, packagePath, problemName, fileName + "." + JAVA_EXT);
        } else if (fileName.endsWith("Spec")) {
            return Paths.get(projectRoot, SPOCK_SRC, packagePath, problemName, fileName + "." + GROOVY_EXT);
        } else {
            return Paths.get(projectRoot, JAVA_SRC, packagePath, problemName, fileName + "." + JAVA_EXT);
        }
    }

    private static Problem createDataModel() {
        Problem problem = new Problem();
        problem.setPackageName("test");
        problem.setProblemName("hello");
        problem.setProblemSignature("void f(int a)");
        problem.setUtilPackage("util");
        return problem;
    }


}