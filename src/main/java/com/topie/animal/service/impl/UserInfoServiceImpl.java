package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.UserInfoConfig;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.dao.UserInfoMapper;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.security.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Service
public class UserInfoServiceImpl extends BaseService<UserInfo> implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserService userService;

    @Override
    public PageInfo<UserInfo> selectByPage(UserInfo userInfo, int pageNum, int pageSize) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(userInfo.getLoginName()))
            criteria.andLike("loginName", '%' + userInfo.getLoginName() + '%');
        if (StringUtils.isNotEmpty(userInfo.getRealName()))
            criteria.andLike("realName", '%' + userInfo.getRealName() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public String selectOrgIdByLoginName(String currentLoginName) {
        return userInfoMapper.selectOrgIdByLoginName(currentLoginName);
    }

    @Override
    public OrgInfo selectOrgInfoByLoginName(String currentLoginName) {
        return userInfoMapper.selectOrgInfoByLoginName(currentLoginName);
    }

    @Override
    public int updateByConfig(UserInfoConfig userInfoConfig) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPlatformId(userInfoConfig.getPlatformId());
        userInfo.setLoginName(userInfoConfig.getLoginName());
        userInfo.setPassword(userInfoConfig.getPassword());
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
        userService.updatePassword(userInfoConfig.getPlatformId(), userInfoConfig.getPassword());
        if (CollectionUtils.isNotEmpty(userInfoConfig.getRoles())) {
            userService.deleteUserAllRoles(userInfoConfig.getPlatformId());
            for (Integer roleId : userInfoConfig.getRoles()) {
                userService.insertUserRole(userInfoConfig.getPlatformId(), roleId);
            }
        }
        return 1;
    }
}
