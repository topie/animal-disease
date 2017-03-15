package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.SpecFill;

/**
 * Created by chenguojun on 2017/3/14.
 */
public interface ISpecFillService extends IService<SpecFill> {

    PageInfo<SpecFill> selectByPage(SpecFill specFill, int pageNum, int pageSize);
}
