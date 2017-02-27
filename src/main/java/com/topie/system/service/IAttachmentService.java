package com.topie.system.service;

import com.topie.common.service.IService;
import com.topie.database.core.system.model.Attachment;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by chenguojun on 8/28/16.
 */
public interface IAttachmentService extends IService<Attachment> {

    Attachment uploadFileAttachment(HttpServletRequest request, MultipartFile file, String dirName, long maxSize,
            HashMap<String, String> extLimitMap,Integer suffix) throws IOException;
}
