package com.topie.database.core.animal.dao;

import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserInfoMapper extends Mapper<UserInfo> {

    String selectOrgIdByLoginName(@Param("loginName") String currentLoginName);

    OrgInfo selectOrgInfoByLoginName(@Param("loginName") String currentLoginName);
}
