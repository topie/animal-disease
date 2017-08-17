package com.topie;

import com.topie.common.tools.encrypt.SimpleCrypto;
import org.junit.Test;

/**
 * Created by chenguojun on 2017/2/22.
 */
public class AppTest {

    @Test
    public void monthFirstDay() throws Exception {
        System.out.println(SimpleCrypto.encrypt("zcpt@123456",
                "CF2017576C4BA979B65114BB6A869267D9B3F2AC40699808490B3E0EF97E60946511C056D0E7547CD92376BE794C02A9"));
    }
}
