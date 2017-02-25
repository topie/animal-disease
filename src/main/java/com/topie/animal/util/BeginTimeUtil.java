package com.topie.animal.util;

import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;

import java.util.Date;

/**
 * Created by chenguojun on 2017/2/25.
 */
public class BeginTimeUtil {

    public static Date getCurrentSeasonBeginTime() {
        Date beginTime = DateUtil.getCurrentMonthFirstDay();
        int year = DateUtil.getYear(beginTime);
        int month = DateUtil.getMonth(beginTime) + 1;
        if (month >= 1 && month < 4) {
            month = 1;
        } else if (month >= 4 && month < 7) {
            month = 4;
        } else if (month >= 7 && month < 10) {
            month = 7;
        } else {
            month = 10;
        }
        String beginTimeStr = year + "-" + month + "-01";
        beginTime = DateUtil.StringToDate(beginTimeStr, DateStyle.YYYY_MM_DD);
        return beginTime;
    }
}
