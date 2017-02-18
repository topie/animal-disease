package com.topie.animald.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IReFillService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animald.dao.ReFillMapper;
import com.topie.database.core.animald.model.ReFill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class ReFillServiceImpl extends BaseService<ReFill> implements IReFillService {

    @Autowired
    private ReFillMapper reFillMapper;

    @Override
    public PageInfo<ReFill> selectByPage(ReFill reFill, int pageNum, int pageSize) {
        Example example = new Example(ReFill.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("displayTitle", '%' + reFill.getDisplayTitle() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<ReFill> list = reFillMapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
