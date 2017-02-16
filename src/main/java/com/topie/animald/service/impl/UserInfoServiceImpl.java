package com.topie.animald.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IUserInfoService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.dao.UserInfoMapper;
import com.topie.database.core.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class UserInfoServiceImpl extends BaseService<UserInfo> implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public PageInfo<UserInfo> selectByPage(UserInfo userInfo, int pageNum, int pageSize) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("realName", '%' + userInfo.getRealName() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
