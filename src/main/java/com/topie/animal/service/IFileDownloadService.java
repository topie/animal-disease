package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.template.model.FileDownload;

/**
 * Created by chenguojun on 2017/2/27.
 */
public interface IFileDownloadService extends IService<FileDownload> {

    PageInfo<FileDownload> selectByPage(FileDownload fileDownload, int pageNum, int pageSize);

}
