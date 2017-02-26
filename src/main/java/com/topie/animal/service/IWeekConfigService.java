package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.WeekDto;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.WeekConfig;

import java.util.Date;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IWeekConfigService extends IService<WeekConfig> {

    PageInfo<WeekConfig> selectByPage(WeekConfig weekConfig, int pageNum, int pageSize);

    List<WeekDto> getDays(Date begin);

    List<WeekDto> getDays(int year, int type);
}
