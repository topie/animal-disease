package com.topie.common.tools.filemanager;

import com.topie.common.exception.DefaultBusinessException;
import com.topie.common.utils.FileUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by chenguojun on 2017/1/14.
 */
@Component
public class DefaultFileManagerTool implements IFileManager {

    @Override
    public FolderDto folder(String root, String rootUrl, String dir) {
        if (!"".equals(dir) && !dir.endsWith("/")) {
            dir += "/";
        }
        String currentUrl = rootUrl + dir;
        String currentPath = root + dir;
        String currentDirPath = dir;
        String moveUpDirPath = "";
        if (!"".equals(dir)) {
            String str = currentDirPath.substring(0, currentDirPath.length() - 1);
            moveUpDirPath = str.lastIndexOf("/") >= 0 ? str.substring(0, str.lastIndexOf("/") + 1) : "";
        }
        // 不允许使用..移动到上一级目录
        if (dir.indexOf("..") >= 0) {
            throw new DefaultBusinessException("Access is not allowed.");
        }

        // 目录不存在或不是目录
        File currentPathFile = new File(currentPath);
        if (!currentPathFile.isDirectory()) {
            throw new DefaultBusinessException("Directory does not exist.");
        }
        // 遍历目录取的文件信息
        List<FileDto> fileList = new ArrayList<FileDto>();
        if (currentPathFile.listFiles() != null) {
            for (File file : currentPathFile.listFiles()) {
                FileDto fileDto = new FileDto();
                Hashtable<String, Object> hash = new Hashtable<String, Object>();
                String fileName = file.getName();
                if (file.isDirectory()) {
                    fileDto.setIsDirectory(true);
                    fileDto.setHashFile(file.listFiles() != null);
                    fileDto.setFileSize(0L);
                    fileDto.setType("");
                } else if (file.isFile()) {
                    String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                    fileDto.setIsDirectory(false);
                    fileDto.setHashFile(false);
                    fileDto.setFileSize(file.length());
                    fileDto.setType(fileExt);
                }
                fileDto.setName(fileName);
                fileDto.setPath(file.getPath());
                fileDto.setLastModified(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
                fileList.add(fileDto);
            }
        }
        Collections.sort(fileList);
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
        FileManagerUtil.mkDir(dir);
    }

    @Override
    public Map rename(String dir, String oldName, String newName) {
        return FileManagerUtil.renameFile(dir, oldName, newName);
    }

    @Override
    public void removeDir(String dir) {
        FileManagerUtil.delFolder(dir);
    }

    @Override
    public void removeFile(String filePath) {
        FileManagerUtil.delFile(filePath);
    }

    @Override
    public void download(HttpServletResponse response, String filePath, String fileName) {
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        try {
            response.setHeader("Content-Disposition",
                    "attachment;fileName=" + new String(fileName.getBytes("gbk"), "iso-8859-1"));
            File file = new File(filePath);
            InputStream inputStream = new FileInputStream(file);
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
    public void upload(MultipartFile multipartFile, String dir) throws IOException {
        FileUtil.saveFileFromInputStream(multipartFile.getInputStream(), dir, multipartFile.getOriginalFilename());
    }
}
