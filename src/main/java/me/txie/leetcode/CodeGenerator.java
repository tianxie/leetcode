package me.txie.leetcode;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {

    public static void main(String[] args) throws IOException, TemplateException {
        // Create your Configuration instance, and specify if up to what FreeMarker
        // version (here 2.3.28) do you want to apply the fixes that are not 100%
        // backward-compatible. See the Configuration JavaDoc for details.
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);

        // Specify the source where the template files come from:
        cfg.setClassForTemplateLoading(CodeGenerator.class, "/templates");

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

        Map root = new HashMap();
        root.put("packageName", "test");

        /* Get the template (uses cache internally) */
        Template temp = cfg.getTemplate("Solution.ftlh");

        /* Merge data-model with template */
        Writer out = new OutputStreamWriter(System.out);
        temp.process(root, out);
    }
}
