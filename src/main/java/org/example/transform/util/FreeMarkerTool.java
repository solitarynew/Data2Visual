package org.example.transform.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FreeMarkerTool {

    public static final FreeMarkerTool INSTANCE = new FreeMarkerTool();

    private final String TEMPLATE_PATH = "src/main/resources/template/";
    private final Configuration configuration = new Configuration(Configuration.VERSION_2_3_22);

    public FreeMarkerTool() {
        try {
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String render(String templateName, Object dataModel) {
        StringWriter result = new StringWriter();
        Writer out = new BufferedWriter(result);
        try {
            Template template = configuration.getTemplate(templateName);
            template.process(dataModel, out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result.toString();
    }

}
