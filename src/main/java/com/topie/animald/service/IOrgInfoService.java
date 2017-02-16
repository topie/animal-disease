package com.topie.animald.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.model.OrgInfo;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IOrgInfoService extends IService<OrgInfo> {

    PageInfo<OrgInfo> selectByPage(OrgInfo userInfo, int pageNum, int pageSize);
}
