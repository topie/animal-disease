package com.topie.common.utils;

import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cgj on 2015/10/30.
 */
public class PageConvertUtil {

    public static Map grid(PageInfo<?> info) {
        Map map = new HashMap();
        map.put("total", info == null ? 0 : info.getTotal());
        map.put("data", info == null ? new ArrayList<>() : info.getList());
        return map;
    }
}
