package com.topie;

import com.topie.common.tools.encrypt.SimpleCrypto;
import org.junit.Test;

/**
 * Created by chenguojun on 2017/2/22.
 */
public class AppTest {

    @Test
    public void monthFirstDay() throws Exception {
        String ticket = SimpleCrypto.decrypt("zcpt@123456", "734EAC728A067D466C69DA8111A2D292");
        System.out.println(ticket);
    }
}
