package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IWeekConfigService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.dao.WeekConfigMapper;
import com.topie.database.core.animal.model.WeekConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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

}
