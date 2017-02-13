package com.topie.common.tools.filemanager;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.DeleteObjectsRequest;
import com.aliyun.oss.model.ListObjectsRequest;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.topie.common.exception.DefaultBusinessException;
import com.topie.common.tools.alioss.OssUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/1/14.
 */
@Component
public class OssFileManagerTool implements IFileManager {

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

    private final OssUtil ossUtil;

    private OSSClient client = null;

    @Autowired
    public OssFileManagerTool(OssUtil ossUtil) {
        this.ossUtil = ossUtil;
    }

    @PostConstruct
    public void init() {
        this.client = new OSSClient(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        Assert.notNull(this.client);
    }

    @PreDestroy
    public void destroy() {
        this.client.shutdown();
    }

    @Override
    public FolderDto folder(String root, String rootUrl, String dir) {
        String currentUrl = "";
        if (dir.startsWith("/")) dir = dir.substring(1, dir.length());
        String currentDirPath = StringUtils.isEmpty(dir) ? "" : (dir.endsWith("/") ? dir : dir + "/");
        String moveUpDirPath = "";
        String tmu = dir;
        if (tmu.endsWith("/")) tmu = dir.substring(0, dir.length() - 1);
        if (tmu.contains("/")) {
            moveUpDirPath = tmu.substring(0, tmu.lastIndexOf("/"));
        } else {
            moveUpDirPath = root;
        }
        ObjectListing objectListing = client.listObjects(new ListObjectsRequest(BUCKET_NAME).
                withMaxKeys(1000).withPrefix(dir));
        List<OSSObjectSummary> sums = objectListing.getObjectSummaries();
        List<FileDto> fileList = new ArrayList<>();
        String tmpDir = StringUtils.isEmpty(dir) ? "" : (dir + "/");
        for (OSSObjectSummary s : sums) {
            FileDto fileDto = new FileDto();
            String tmp = s.getKey().replace(dir, "");
            if (tmp.startsWith("/")) tmp = tmp.substring(1, tmp.length());
            String[] names = tmp.split("/");
            if (names.length > 1) {
                fileDto.setIsDirectory(true);
                fileDto.setPath(tmpDir + names[0]);
            } else {
                if (s.getSize() == 0) {
                    fileDto.setIsDirectory(true);
                } else {
                    fileDto.setIsDirectory(false);
                }
                fileDto.setPath(tmpDir + s.getKey());
            }
            if (StringUtils.isEmpty(names[0])) continue;
            fileDto.setName(names[0]);
            fileDto.setFileSize(s.getSize());
            fileDto.setHashFile(false);
            fileDto.setType(s.getETag());
            fileDto.setLastModified(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(s.getLastModified()));
            fileDto.setHashKey(names[0]);
            if (!fileList.contains(fileDto)) fileList.add(fileDto);
        }
        if (fileList.size() > 0) Collections.sort(fileList);
        FolderDto folderDto = new FolderDto();
        folderDto.setMoveUpDirPath(moveUpDirPath);
        folderDto.setCurrentDirPath(currentDirPath);
        folderDto.setCurrentUrl(currentUrl);
        folderDto.setTotal(fileList.size());
        folderDto.setFiles(fileList);
        return folderDto;
    }

    @Override
    public void createDir(String dir) {
        try {
            if (dir.startsWith("/")) dir = dir.substring(1, dir.length());
            client.putObject(BUCKET_NAME, dir + "/", new ByteArrayInputStream(new byte[0]));
        } catch (OSSException oe) {
            oe.printStackTrace();
        }
    }

    @Override
    public Map rename(String dir, String oldName, String newName) {
        return null;
    }

    @Override
    public void removeDir(String dir) {
        if (dir.startsWith("/")) dir = dir.substring(1, dir.length());
        if (dir.endsWith("/")) dir = dir.substring(0, dir.length() - 1);
        ObjectListing objectListing = client.listObjects(new ListObjectsRequest(BUCKET_NAME).
                withMaxKeys(1000).withPrefix(dir));
        List<OSSObjectSummary> sums = objectListing.getObjectSummaries();
        List<String> keys = new ArrayList<>();
        keys.add(dir);
        for (OSSObjectSummary sum : sums) {
            keys.add(sum.getKey());
        }
        client.deleteObjects(new DeleteObjectsRequest(BUCKET_NAME).withKeys(keys));
    }

    @Override
    public void removeFile(String filePath) {
        if (filePath.startsWith("/")) filePath = filePath.substring(1, filePath.length());
        client.deleteObject(BUCKET_NAME, filePath);
    }

    @Override
    public void download(HttpServletResponse response, String filePath, String fileName) {
        if (filePath.endsWith("/")) filePath = filePath.substring(0, filePath.length() - 1);
        if (fileName.startsWith("/")) fileName = fileName.substring(1, fileName.length());
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        try {
            response.setHeader("Content-Disposition",
                    "attachment;fileName=" + new String(fileName.getBytes("gbk"), "iso-8859-1"));
            InputStream inputStream = ossUtil.getInputStream(filePath + "/", fileName);
            OutputStream os = response.getOutputStream();
            byte[] b = new byte[1024];
            int length;
            while ((length = inputStream.read(b)) > 0) {
                os.write(b, 0, length);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DefaultBusinessException("Download fail.");
        }
    }

    @Override
    public void upload(MultipartFile multipartFile, String dir) {
        if (dir.endsWith("/")) dir = dir.substring(0, dir.length() - 1);
        ossUtil.upload(multipartFile, dir + "/");
    }
}
