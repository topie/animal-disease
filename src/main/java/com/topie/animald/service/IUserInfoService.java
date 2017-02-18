package com.topie.animald.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.animald.model.UserInfo;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IUserInfoService extends IService<UserInfo> {

    PageInfo<UserInfo> selectByPage(UserInfo userInfo, int pageNum, int pageSize);
}
