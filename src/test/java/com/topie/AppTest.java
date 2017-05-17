package com.topie;

import com.topie.common.utils.date.DateUtil;
import net.sf.json.JSONObject;
import org.junit.Test;

/**
 * Created by chenguojun on 2017/2/22.
 */
public class AppTest {

    @Test
    public void monthFirstDay() throws Exception {
        JSONObject jsonObject = JSONObject.fromObject("{name:1}");
        System.out.println(jsonObject.get("name"));
        //System.out.println(DateUtil.getCurrentMonthFirstDay());
    }
}
