package com.topie.system.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.system.model.Log;

/**
 * Created by chenguojun on 2017/3/5.
 */
public interface ILogService extends IService<Log> {

    int insertLog(String logInfo);

    PageInfo<Log> selectByPage(Log log, int pageNum, int pageSize);
}
