package com.topie.common.tools.alioss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by chenguojun on 2016/12/28.
 */
@Component
public class OssUtil {

    //阿里云API的内或外网域名
    @Value("${endpoint}")
    private String ENDPOINT;

    //阿里云API的密钥Access Key ID
    @Value("${accessKeyId}")
    private String ACCESS_KEY_ID;

    //阿里云API的密钥Access Key Secret
    @Value("${accessKeySecret}")
    private String ACCESS_KEY_SECRET;

    @Value("${bucketName}")
    private String BUCKET_NAME;

    private OSSClient client = null;

    @PostConstruct
    public void init() {
        this.client = new OSSClient(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        Assert.notNull(this.client);
    }

    @PreDestroy
    public void destroy() {
    }

    public InputStream getInputStream(String folder, String fileName) {
        OSSObject ossObj = this.client.getObject(BUCKET_NAME, folder + fileName);
        return ossObj.getObjectContent();
    }

    public String upload(MultipartFile file, String folder) {
        String newFileName = "";
        try {
            InputStream is = file.getInputStream();
            String fileName = file.getOriginalFilename();
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            newFileName = df.format(new Date()) + "_" + new Random().nextInt(1000) + "_" + fileName;
            Long fileSize = file.getSize();
            //创建上传Object的Metadata
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(is.available());
            metadata.setCacheControl("no-cache");
            metadata.setHeader("Pragma", "no-cache");
            metadata.setContentEncoding("utf-8");
            metadata.setContentType(file.getContentType());
            metadata.setContentDisposition("filename/filesize=" + newFileName + "/" + fileSize + "Byte.");
            this.client.putObject(BUCKET_NAME, folder + newFileName, is, metadata);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFileName;
    }

    public String upload(String path, String folder) {
        String newFileName = "";
        try {
            File file = new File(path);
            InputStream is = new FileInputStream(file);
            String fileName = file.getName();
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            newFileName = df.format(new Date()) + "_" + new Random().nextInt(1000) + "_" + fileName;
            Long fileSize = file.length();
            //创建上传Object的Metadata
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(is.available());
            metadata.setCacheControl("no-cache");
            metadata.setHeader("Pragma", "no-cache");
            metadata.setContentEncoding("utf-8");
            metadata.setContentType(getContentType(fileName));
            metadata.setContentDisposition("filename/filesize=" + newFileName + "/" + fileSize + "Byte.");
            //上传文件
            this.client.putObject(BUCKET_NAME, folder + newFileName, is, metadata);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newFileName;
    }

    private String getContentType(String fileName) {
        String fileExtension = fileName.substring(fileName.lastIndexOf("."));
        if ("bmp".equalsIgnoreCase(fileExtension)) return "image/bmp";
        if ("gif".equalsIgnoreCase(fileExtension)) return "image/gif";
        if ("jpeg".equalsIgnoreCase(fileExtension) || "jpg".equalsIgnoreCase(fileExtension) || "png"
                .equalsIgnoreCase(fileExtension)) return "image/jpeg";
        if ("html".equalsIgnoreCase(fileExtension)) return "text/html";
        if ("txt".equalsIgnoreCase(fileExtension)) return "text/plain";
        if ("vsd".equalsIgnoreCase(fileExtension)) return "application/vnd.visio";
        if ("ppt".equalsIgnoreCase(fileExtension) || "pptx".equalsIgnoreCase(fileExtension))
            return "application/vnd.ms-powerpoint";
        if ("doc".equalsIgnoreCase(fileExtension) || "docx".equalsIgnoreCase(fileExtension))
            return "application/msword";
        if ("xml".equalsIgnoreCase(fileExtension)) return "text/xml";
        return "text/html";
    }
}
