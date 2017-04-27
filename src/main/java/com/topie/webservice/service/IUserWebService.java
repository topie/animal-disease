package com.topie.webservice.service;

import com.topie.database.core.animal.model.UserInfo;

/**
 * Created by chenguojun on 2017/4/21.
 */
public interface IUserWebService {

    UserInfo echoUser(UserInfo userInfo);

    String echoString(String echoString);

    String SynchronizedInfo(String jsonString);

}
