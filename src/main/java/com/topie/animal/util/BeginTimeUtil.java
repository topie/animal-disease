package com.topie.animal.util;

import com.google.common.collect.Lists;
import com.topie.animal.dto.WeekDto;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static Date getCurrentHalfYearBeginTime() {
        Date beginTime = DateUtil.getCurrentMonthFirstDay();
        int year = DateUtil.getYear(beginTime);
        int month = DateUtil.getMonth(beginTime) + 1;
        if (month >= 3 && month < 9) {
            month = 3;
        } else {
            month = 9;
        }
        String beginTimeStr = year + "-" + month + "-01";
        beginTime = DateUtil.StringToDate(beginTimeStr, DateStyle.YYYY_MM_DD);
        return beginTime;
    }

    public static List<WeekDto> getWeekDtoListByTime(String text) {
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        String[] arr = text.split(";");
        String[] periods = StringUtils.split(arr[0], ",");
        List<String> periodList = Lists.newArrayList(periods);
        String[] times = StringUtils.split(arr[1], ",");
        List<String> timeList = Lists.newArrayList(times);
        if (periodList.size() != timeList.size()) return null;
        List<WeekDto> list = new ArrayList<>();
        for (int i = 0; i < periodList.size(); i++) {
            WeekDto weekDto = new WeekDto();
            weekDto.setPeriod(periodList.get(i));
            weekDto.setTime(timeList.get(i));
            list.add(weekDto);
        }
        return list;
    }
    public static Date getCurrentHalfYearBeginTime(Date beginTime) {
//        Date beginTime = DateUtil.getCurrentMonthFirstDay();
        int year = DateUtil.getYear(beginTime);
        int month = DateUtil.getMonth(beginTime) + 1;
        if (month >= 3 && month < 9) {
            month = 3;
        } else {
            month = 9;
        }
        String beginTimeStr = year + "-" + month + "-01";
        beginTime = DateUtil.StringToDate(beginTimeStr, DateStyle.YYYY_MM_DD);
        return beginTime;
    }
}
