package com.topie.animal.handler;

import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;

import java.util.Date;

/**
 * Created by chenguojun on 2017/2/21.
 */
public class PeriodBuilder {

    public static String buildMonth(Date beginTime) {
        return DateUtil.DateToString(beginTime, DateStyle.YYYY_MM_CN);
    }
}
