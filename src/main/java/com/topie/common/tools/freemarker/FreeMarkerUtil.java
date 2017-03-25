package com.topie.common.tools.freemarker;

import freemarker.template.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Locale;
import java.util.Map;

public class FreeMarkerUtil {

    /**
     * @param templatePath
     * @param templateName
     * @param params
     * @return
     */
    public static String getHtmlStringFromTemplate(String templatePath, String templateName, Map<?, ?> params) {
        Writer out = null;
        try {
            //初使化FreeMarker配置
            Configuration config = new Configuration();
            // 设置要解析的模板所在的目录，并加载模板文件
            config.setDirectoryForTemplateLoading(new File(templatePath));
            // 设置包装器，并将对象包装为数据模型
            config.setObjectWrapper(new DefaultObjectWrapper());
            config.setLocale(Locale.CHINA);
            config.setDefaultEncoding("utf-8");
            config.setClassicCompatible(true);//处理空值为空字符串
            config.setNumberFormat("0.00");
            // 获取模板,并设置编码方式，这个编码必须要与页面中的编码格式一致
            // 否则会出现乱码
            Template template = config.getTemplate(templateName, "UTF-8");
            template.setNumberFormat("0.00");
            out = new StringWriter(2048);
            template.process(params, out);
            return out.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        } finally {
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * templatePath模板文件存放路径,templateName 模板文件名称,filename 生成的文件名称
     *
     * @param templatePath
     * @param templateName
     * @param fileName
     * @param root
     */
    public static void analysisTemplate(String templatePath, String templateName, String fileName, Map<?, ?> root,
            HttpServletRequest request) {
        try {
            //初使化FreeMarker配置
            Configuration config = new Configuration();
            // 设置要解析的模板所在的目录，并加载模板文件
            config.setDirectoryForTemplateLoading(new File(templatePath));
            // 设置包装器，并将对象包装为数据模型
            config.setObjectWrapper(new DefaultObjectWrapper());
            // 获取模板,并设置编码方式，这个编码必须要与页面中的编码格式一致
            // 否则会出现乱码
            config = updateConfiguration(config, request);
            Template template = config.getTemplate(templateName, "UTF-8");
            template.setNumberFormat("0.00");
            // 合并数据模型与模板
            FileOutputStream fos = new FileOutputStream(fileName);
            Writer out = new OutputStreamWriter(fos, "UTF-8");
            template.process(root, out);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    protected static Configuration updateConfiguration(Configuration configuration, HttpServletRequest request)
            throws TemplateException {

        // 设置标签类型([]、<>),[]这种标记解析要快些
        configuration.setTagSyntax(Configuration.AUTO_DETECT_TAG_SYNTAX);

        // 设置允许属性为空
        configuration.setClassicCompatible(true);

        WebApplicationContext webApp = RequestContextUtils
                .getWebApplicationContext(request, request.getSession().getServletContext());
        // 获取实现TemplateDirectiveModel的bean
        Map<String, TemplateDirectiveModel> beans = webApp.getBeansOfType(TemplateDirectiveModel.class);

        for (String key : beans.keySet()) {
            Object obj = beans.get(key);
            if (obj != null && obj instanceof TemplateDirectiveModel) {
                configuration.setSharedVariable(key, obj);
            }
        }

        return configuration;
    }

}
