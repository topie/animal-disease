package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.WeekDto;
import com.topie.animal.service.IWeekConfigService;
import com.topie.animal.util.BeginTimeUtil;
import com.topie.common.service.impl.BaseService;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.dao.WeekConfigMapper;
import com.topie.database.core.animal.model.WeekConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class WeekConfigServiceImpl extends BaseService<WeekConfig> implements IWeekConfigService {

    @Autowired
    private WeekConfigMapper weekConfigMapper;

    @Override
    public PageInfo<WeekConfig> selectByPage(WeekConfig weekConfig, int pageNum, int pageSize) {
        Example example = new Example(WeekConfig.class);
        Example.Criteria criteria = example.createCriteria();
        if (weekConfig.getType() != null) criteria.andEqualTo("type", weekConfig.getType());
        if (weekConfig.getYear() != null) criteria.andEqualTo("year", weekConfig.getYear());
        PageHelper.startPage(pageNum, pageSize);
        List<WeekConfig> list = weekConfigMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public List<WeekDto> getDays(Date begin) {
        int year = DateUtil.getYear(begin);
        int month = DateUtil.getMonth(begin) + 1;
        int type = month < 9 ? 0 : 1;
        return getDays(year, type);
    }

    @Override
    public List<WeekDto> getDays(int year, int type) {
        String text = weekConfigMapper.selectWeekDtoByYearAndType(year, type);
        return BeginTimeUtil.getWeekDtoListByTime(text);
    }

}
