package com.topie;

import com.topie.common.tools.encrypt.SimpleCrypto;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by chenguojun on 2017/2/22.
 */
public class AppTest {

    @Test
    public void monthFirstDay() throws Exception {
        String orgId = "1";
        if (StringUtils.isNotEmpty(orgId) && StringUtils.isNumeric(orgId)) {
            System.out.println(orgId);
        }
    }
}
