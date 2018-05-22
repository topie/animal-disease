package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.UserInfoConfig;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.dao.UserInfoMapper;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.system.model.User;
import com.topie.security.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
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
        if(StringUtils.isNotEmpty(userInfoConfig.getPassword())){
            userInfo.setPassword(userInfoConfig.getPassword());
            userService.updatePassword(userInfoConfig.getPlatformId(), userInfoConfig.getPassword());
        }else {
            userInfo.setPassword("123@abc");
            userService.updatePassword(userInfoConfig.getPlatformId(),"123@abc");
        }
        userInfoMapper.updateByPrimaryKeySelective(userInfo);

        if (CollectionUtils.isNotEmpty(userInfoConfig.getRoles())) {
            userService.deleteUserAllRoles(userInfoConfig.getPlatformId());
            for (Integer roleId : userInfoConfig.getRoles()) {
                userService.insertUserRole(userInfoConfig.getPlatformId(), roleId);
            }
        }
        return 1;
    }

    @Override
    public UserInfo selectByOrgId(String orgId) {
        return userInfoMapper.selectByOrgId(orgId);
    }

    @Override
    public UserInfo selectByPlatformId(Integer platformId) {
        return userInfoMapper.selectByPlatformId(platformId);
    }

    @Override
    public void insertPlatformUser(UserInfo userInfo) {
        User user = userService.selectByLoginName(userInfo.getLoginName());
        if (user == null) user = new User();
        user.setLoginName(userInfo.getLoginName());
        if(StringUtils.isNotEmpty(userInfo.getPassword())) {
            user.setPassword(userInfo.getPassword());
        }else{
            user.setPassword("123@abc");
            userInfo.setPassword("123@abc");
        }
        user.setDisplayName(userInfo.getRealName());
        user.setContactPhone(userInfo.getMobile());
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);
        List<Integer> roleIds = new ArrayList<>();
        if ("管理员".equals(userInfo.getRoleName())) {
            roleIds.add(1);
            user.setRoles(roleIds);
        } else if ("中央".equals(userInfo.getRoleName())) {
            roleIds.add(4);
            user.setRoles(roleIds);
        } else if ("省级".equals(userInfo.getRoleName())) {
            roleIds.add(3);
            user.setRoles(roleIds);
        }
        if (user.getId() != null) {
            userService.updateUser(user);
        } else {
            userService.insertUser(user);
        }
        userInfo.setPlatformId(user.getId());
        updateNotNull(userInfo);
    }

    @Override
    public UserInfo selectByTokenCode(String ticket) {
        UserInfo userInfo = new UserInfo();
        userInfo.setTokenCode(ticket);
        List<UserInfo> list = getMapper().select(userInfo);
        if (list.size() > 0) return list.get(0);
        return null;
    }

    @Override
    public void deleteByTicketCode(String ticketCode) {
        UserInfo userInfo = new UserInfo();
        userInfo.setTokenCode(ticketCode);
        UserInfo uu = getMapper().selectOne(userInfo);
        getMapper().delete(userInfo);
        userService.deleteUser(userInfo.getPlatformId());

    }

    @Override
    public int updatePlatformUser(UserInfo userInfo) {
        User user = userService.selectByLoginName(userInfo.getLoginName());
        if (user == null) user = new User();
        user.setLoginName(userInfo.getLoginName());
        user.setPassword(userInfo.getPassword());
        user.setDisplayName(userInfo.getRealName());
        user.setContactPhone(userInfo.getMobile());
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);
        List<Integer> roleIds = new ArrayList<>();
        if ("管理员".equals(userInfo.getRoleName())) {
            roleIds.add(1);
            user.setRoles(roleIds);
        } else if ("中央".equals(userInfo.getRoleName())) {
            roleIds.add(4);
            user.setRoles(roleIds);
        } else if ("省级".equals(userInfo.getRoleName())) {
            roleIds.add(3);
            user.setRoles(roleIds);
        }
        if (user.getId() != null) {
            userService.updateUser(user);
        } else {
            userService.insertUser(user);
        }
        userInfo.setPlatformId(user.getId());
        UserInfo uu = selectByPlatformId(user.getId());
        userInfo.setUserId(uu.getUserId());
        return updateNotNull(userInfo);
    }
}
