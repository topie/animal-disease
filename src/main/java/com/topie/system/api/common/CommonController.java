package com.topie.system.api.common;

import com.topie.common.utils.Result;
import com.topie.database.core.system.model.Attachment;
import com.topie.system.service.IAttachmentService;
import com.topie.common.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by chenguojun on 8/31/16.
 * 通用上传api
 */
@Controller
@RequestMapping("/api/common")
public class CommonController {

    private final static Integer IMAGE = 0;

    private final static Integer FILE = 1;

    @Autowired
    private IAttachmentService iAttachmentService;

    @RequestMapping(value = "/uploadFile", method = { RequestMethod.POST })
    @ResponseBody
    public Result uploadFile(HttpServletRequest request,
            @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        try {
            if (file == null || file.isEmpty()) {
                return ResponseUtil.error("请选择文件。");
            }
            //文件夹名
            String dirName = "file";
            // 最大文件大小
            long maxSize = 20000000;

            // 定义允许上传的文件扩展名
            HashMap<String, String> extMap = new HashMap<String, String>();
            extMap.put(dirName,
                    "doc,docx,xls,xlsx,ppt,pptx,txt,zip,rar,gz,bz2,gif,jpg,jpeg,png,bmp,swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");

            Attachment attachment = iAttachmentService
                    .uploadFileAttachment(request, file, dirName, maxSize, extMap, FILE);
            return ResponseUtil.success(attachment);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.error("上传失败。");
        }
    }

    @RequestMapping(value = "/uploadImage", method = { RequestMethod.POST })
    @ResponseBody
    public Result uploadImage(HttpServletRequest request,
            @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        try {
            if (file == null || file.isEmpty()) {
                return ResponseUtil.error("请选择文件。");
            }
            //文件夹名
            String dirName = "image";
            // 最大文件大小
            long maxSize = 10000000;

            // 定义允许上传的文件扩展名
            HashMap<String, String> extMap = new HashMap<String, String>();
            extMap.put(dirName, "gif,jpg,jpeg,png,bmp");

            Attachment attachment = iAttachmentService
                    .uploadFileAttachment(request, file, dirName, maxSize, extMap, IMAGE);
            return ResponseUtil.success(attachment);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.error("上传失败。");
        }
    }

    @RequestMapping(value = "/uploadFiles", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadFiles(HttpServletRequest request,
            @RequestParam(value = "files[]", required = false) MultipartFile[] files) throws Exception {
        if (files.length > 0) {
            for (MultipartFile file : files) {
                //文件夹名
                String dirName = "file";
                // 最大文件大小
                long maxSize = 20000000;

                // 定义允许上传的文件扩展名
                HashMap<String, String> extMap = new HashMap<String, String>();
                extMap.put(dirName,
                        "doc,docx,xls,xlsx,ppt,pptx,txt,zip,rar,gz,bz2,gif,jpg,jpeg,png,bmp,swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");

                return iAttachmentService
                        .uploadFileAttachment(request, file, dirName, maxSize, extMap, FILE);
            }
        }
        return false;
    }

    @RequestMapping(value = "/attachment", method = RequestMethod.POST)
    @ResponseBody
    public Result attachment(@RequestParam("attachmentId") Integer attachmentId) throws Exception {
        if (attachmentId != null) {
            Attachment attachment = iAttachmentService.selectByKey(attachmentId);
            if (attachment != null) {
                return ResponseUtil.success(attachment);
            }
        }
        return ResponseUtil.error("附件id不存在。");
    }

}
