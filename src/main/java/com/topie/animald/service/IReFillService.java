package com.topie.animald.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.animald.model.ReFill;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IReFillService extends IService<ReFill> {

    PageInfo<ReFill> selectByPage(ReFill userInfo, int pageNum, int pageSize);

}
