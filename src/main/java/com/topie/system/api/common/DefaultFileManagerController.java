package com.topie.system.api.common;

import com.topie.common.utils.CompressUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.security.utils.SecurityUtil;
import com.topie.common.tools.filemanager.DefaultFileManagerTool;
import com.topie.common.tools.filemanager.FolderDto;
import com.topie.common.tools.filemanager.OssFileManagerTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cgj on 2015/12/8.
 */
@Controller
@RequestMapping("/api/fileManager")
public class DefaultFileManagerController {

    @Value("${upload.folder}")
    private String uploadFolder;

    @Autowired
    private DefaultFileManagerTool defaultFileManagerTool;

    @Autowired
    private OssFileManagerTool ossFileManagerTool;

    @RequestMapping("/folder")
    public
    @ResponseBody
    Object folder(HttpServletRequest request, @RequestParam(value = "path", defaultValue = "") String path) {
        String rootPath = request.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                .getCurrentUserName() + "/";
        File rootFolder = new File(rootPath);
        if (!rootFolder.exists()) {
            rootFolder.mkdirs();
        }
        // 文件保存目录URL
        String rootUrl = request.getContextPath() + "/" + uploadFolder + "/" + SecurityUtil.getCurrentUserName() + "/";
        FolderDto folderDto = defaultFileManagerTool.folder(rootPath, rootUrl, path);
        return ResponseUtil.success(folderDto);
    }

    @RequestMapping("/oss/folder")
    public
    @ResponseBody
    Object ossFolder(HttpServletRequest request, @RequestParam(value = "path", defaultValue = "") String path) {
        FolderDto folderDto = ossFileManagerTool.folder("", "", path);
        return ResponseUtil.success(folderDto);
    }

    @RequestMapping(value = "/createFolder", method = RequestMethod.POST)
    public
    @ResponseBody
    Object createFolder(HttpServletRequest httpServletRequest, @RequestParam(value = "dirPath") String dirPath) {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + dirPath;
        defaultFileManagerTool.createDir(wholeRealPath);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/rename", method = RequestMethod.POST)
    public
    @ResponseBody
    Object rename(HttpServletRequest httpServletRequest, @RequestParam(value = "folderPath") String folderPath,
            @RequestParam(value = "oldName") String oldName, @RequestParam(value = "newName") String newName) {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + folderPath;
        return defaultFileManagerTool.rename(wholeRealPath, oldName, newName);
    }

    @RequestMapping(value = "/deleteFolder", method = RequestMethod.POST)
    public
    @ResponseBody
    Object deleteFolder(HttpServletRequest httpServletRequest, @RequestParam(value = "dirPath") String dirPath) {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + dirPath;
        defaultFileManagerTool.removeDir(wholeRealPath);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/deleteFile", method = RequestMethod.POST)
    public
    @ResponseBody
    Object deleteFile(HttpServletRequest httpServletRequest, @RequestParam(value = "filePath") String filePath) {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + filePath;
        defaultFileManagerTool.removeFile(wholeRealPath);
        return ResponseUtil.success();
    }

    @RequestMapping("/download")
    public void downloadFile(HttpServletResponse response, HttpServletRequest httpServletRequest,
            @RequestParam(value = "folderPath") String folderPath, @RequestParam(value = "fileName") String fileName)
            throws UnsupportedEncodingException {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String filePath = rootPath + folderPath + "/" + fileName;
        defaultFileManagerTool.download(response, filePath, fileName);
    }

    @RequestMapping("/upload")
    public
    @ResponseBody
    Object singleUpload(@RequestParam(value = "file") MultipartFile multipartFile,
            @RequestParam(value = "folderPath") String folderPath, HttpServletRequest httpServletRequest)
            throws IOException {
        if (multipartFile == null || multipartFile.isEmpty()) {
            return ResponseUtil.error("请先上传附件");
        }
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + folderPath;
        defaultFileManagerTool.upload(multipartFile, wholeRealPath);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/zip", method = RequestMethod.POST)
    public
    @ResponseBody
    Object zip(HttpServletRequest httpServletRequest, @RequestParam(value = "folderPath") String folderPath,
            @RequestParam(value = "name") String name, @RequestParam(value = "zipName") String zipName) {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + folderPath;
        String[] fileOrFolderNames = name.split(",");
        String zipPath = wholeRealPath + "/" + zipName + ".zip";
        if (fileOrFolderNames.length == 1) {
            CompressUtil.compress(zipPath, wholeRealPath + "/" + name);
        } else {
            List<String> list = Arrays.asList(fileOrFolderNames);
            List<String> pathList = new ArrayList<>();
            for (String fileOrFolderName : list) {
                fileOrFolderName = wholeRealPath + "/" + fileOrFolderName;
                pathList.add(fileOrFolderName);
            }
            CompressUtil.compress(zipPath, pathList);
        }
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/unCompress", method = RequestMethod.POST)
    public
    @ResponseBody
    Object unCompress(HttpServletRequest httpServletRequest, @RequestParam(value = "folderPath") String folderPath,
            @RequestParam(value = "name") String name) throws Exception {
        String rootPath =
                httpServletRequest.getSession().getServletContext().getRealPath("/") + uploadFolder + "/" + SecurityUtil
                        .getCurrentUserName() + "/";
        String wholeRealPath = rootPath + folderPath;
        if (name.toLowerCase().endsWith(".rar")) {
            CompressUtil.unRarFile(wholeRealPath + "/" + name, wholeRealPath);
        } else if (name.toLowerCase().endsWith(".zip")) {
            CompressUtil.unZipFiles(wholeRealPath + "/" + name, wholeRealPath);
        } else {
            ResponseUtil.error("文件格式不正确！");
        }
        return ResponseUtil.success();
    }

}
