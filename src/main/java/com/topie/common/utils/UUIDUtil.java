package com.topie.common.utils;

import java.util.UUID;

/**
 * Created by chenguojun on 2017/2/21.
 */
public class UUIDUtil {

    public static String getUUID() {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }
}
