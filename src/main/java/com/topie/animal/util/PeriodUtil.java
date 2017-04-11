package com.topie.animal.util;

import com.google.common.collect.Lists;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
public class PeriodUtil {

    public static String buildMonth(Date beginTime) {
        return DateUtil.DateToString(beginTime, DateStyle.YYYY_MM_CN);
    }

    public static String buildSeason(Date beginTime) {
        String year = DateUtil.DateToString(beginTime, DateStyle.YYYY_CN);
        int month = DateUtil.getMonth(beginTime) + 1;
        switch (month) {
            case 1:
                year += "第一季度";
                break;
            case 4:
                year += "第二季度";
                break;
            case 7:
                year += "第三季度";
                break;
            case 10:
                year += "第四季度";
            default:
                break;

        }
        return year;
    }

    public static String buildHalfYear(Date beginTime) {
        String year = DateUtil.DateToString(beginTime, DateStyle.YYYY_CN);
        int month = DateUtil.getMonth(beginTime) + 1;
        switch (month) {
            case 3:
                year += "春防";
                break;
            case 9:
                year += "秋防";
            default:
                break;

        }
        return year;
    }

    public static String build(Integer reportType, Date beginTime, Map<String, String> weekMap) {
        switch (reportType) {
            case 2:
                return buildWeek(beginTime, weekMap);
            case 3:
                return buildMonth(beginTime);
            case 4:
                return buildSeason(beginTime);
            case 7:
                return buildHalfYear(beginTime);
            default:
                return "-";
        }
    }

    public static String buildWeek(Date beginTime, Map<String, String> weekMap) {
        int year = DateUtil.getYear(beginTime);
        int month = DateUtil.getMonth(beginTime) + 1;
        String key = year + "#" + (month < 9 ? "0" : "1");
        if (weekMap.get(key) == null) return "-";
        String[] arr = weekMap.get(key).split(";");
        String[] periods = StringUtils.split(arr[0], ",");
        List<String> periodList = Lists.newArrayList(periods);
        String[] times = StringUtils.split(arr[1], ",");
        List<String> timeList = new ArrayList<>();
        for (String time : times) {
            time = DateUtil.StringToString(time, DateStyle.YYYY_MM_DD);
            timeList.add(time);
        }
        if (periodList.size() != timeList.size()) return "-";
        String time = DateUtil.DateToString(beginTime, DateStyle.YYYY_MM_DD);
        String period = "-";
        if (timeList.indexOf(time) >= 0) period = periodList.get(timeList.indexOf(time));
        return DateUtil.getYear(beginTime) + " " + period;
    }
}
