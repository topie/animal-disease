package com.topie.animal.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/21.
 */
public enum ReportType {
    MONTH(7, "月度免疫"), SEASON(3, "物资储备"), WEEK(4, "春秋防周报"), HALF_YEAR(12, "应急管理"), HALF_YEAR(2, "应急管理");

    /**
     * 编码
     */
    private Integer code;

    /**
     * 名称
     */
    private String name;

    ReportType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String getName(Integer code) {
        for (TaskStatus orderSourceType : TaskStatus.values()) {
            if (code.intValue() == orderSourceType.getCode().intValue()) {
                return orderSourceType.getName();
            }
        }
        return null;
    }

    public static Integer getCode(String name) {
        for (TaskStatus orderSourceType : TaskStatus.values()) {
            if (name.equals(orderSourceType.getName())) {
                return orderSourceType.getCode();
            }
        }
        return null;
    }

    public static List<Object> getCodeList() {
        List<Object> list = new ArrayList<>();
        for (TaskStatus orderSourceType : TaskStatus.values()) {
            list.add(orderSourceType.getCode());
        }
        return list;
    }

    public static List<String> getNameList() {
        List<String> list = new ArrayList<>();
        for (TaskStatus orderSourceType : TaskStatus.values()) {
            list.add(orderSourceType.getName());
        }
        return list;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
