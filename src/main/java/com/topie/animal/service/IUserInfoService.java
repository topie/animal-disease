package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.UserInfoConfig;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by chenguojun on 2017/2/21.
 */
public interface IUserInfoService extends IService<UserInfo> {

    PageInfo<UserInfo> selectByPage(UserInfo userInfo, int pageNum, int pageSize);

    String selectOrgIdByLoginName(String currentLoginName);

    OrgInfo selectOrgInfoByLoginName(String currentLoginName);

    int updateByConfig(UserInfoConfig userInfoConfig);

    UserInfo selectByOrgId(String regionCode);

    UserInfo selectByPlatformId(Integer platformId);

    void insertOrUpdatePlatformUser(UserInfo userInfo);

    UserInfo selectByTokenCode(String ticket);
}
