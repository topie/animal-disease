package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.service.ISpecFillService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.model.SpecFill;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/3/14.
 */
@Service
public class SpecFillServiceImpl extends BaseService<SpecFill> implements ISpecFillService {

    @Override
    public PageInfo<SpecFill> selectByPage(SpecFill specFill, int pageNum, int pageSize) {
        Example example = new Example(SpecFill.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(specFill.getOrgId())) criteria.andEqualTo("orgId", specFill.getOrgId());
        PageHelper.startPage(pageNum, pageSize);
        List<SpecFill> list = getMapper().selectByExample(example);
        return new PageInfo<>(list);
    }
}
