package com.topie.animald.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IOrgInfoService;
import com.topie.common.service.impl.BaseService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.dao.OrgInfoMapper;
import com.topie.database.core.animald.model.OrgInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class OrgInfoServiceImpl extends BaseService<OrgInfo> implements IOrgInfoService {

    @Autowired
    private OrgInfoMapper orgInfoMapper;

    @Override
    public PageInfo<OrgInfo> selectByPage(OrgInfo orgInfo, int pageNum, int pageSize) {
        Example example = new Example(OrgInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("orgName", '%' + orgInfo.getOrgName() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<OrgInfo> list = orgInfoMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public List<TreeNode> selectTreeNodes(OrgInfo orgInfo) {
        return orgInfoMapper.selectTreeNodes(orgInfo);
    }
}
