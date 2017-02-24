package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.WeekConfig;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IWeekConfigService extends IService<WeekConfig> {

    PageInfo<WeekConfig> selectByPage(WeekConfig weekConfig, int pageNum, int pageSize);

}
