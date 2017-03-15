package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IOtherConfigService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.model.OtherConfig;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/3/15.
 */
@Service
public class OtherConfigServiceImpl extends BaseService<OtherConfig> implements IOtherConfigService {

    @Override
    public PageInfo<OtherConfig> selectByPage(OtherConfig otherConfig, int pageNum, int pageSize) {
        Example example = new Example(OtherConfig.class);
        Example.Criteria criteria = example.createCriteria();
        if (otherConfig.getType() != null) criteria.andEqualTo("type", otherConfig.getType());
        PageHelper.startPage(pageNum, pageSize);
        List<OtherConfig> list = getMapper().selectByExample(example);
        return new PageInfo<>(list);
    }
}
