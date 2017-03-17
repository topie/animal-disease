package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.OtherConfig;

/**
 * Created by chenguojun on 2017/3/15.
 */
public interface IOtherConfigService extends IService<OtherConfig> {

    PageInfo<OtherConfig> selectByPage(OtherConfig otherConfig, int pageNum, int pageSize);

    OtherConfig selectByType(Integer type);
}
