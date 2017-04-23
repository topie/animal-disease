package com.topie.webservice.service.impl;

import com.topie.database.core.animal.model.UserInfo;
import com.topie.webservice.service.IUserWebService;
import org.springframework.stereotype.Service;

/**
 * Created by chenguojun on 2017/4/21.
 */
@Service
public class UserWebServiceImpl implements IUserWebService {

    @Override
    public UserInfo echoUser(UserInfo userInfo) {
        System.out.println(userInfo.getLeaderName());
        return userInfo;
    }

    @Override
    public String echoString(String echoString) {
        System.out.println(echoString);
        return echoString;
    }
}
