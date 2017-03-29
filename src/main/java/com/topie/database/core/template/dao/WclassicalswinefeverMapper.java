package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Wclassicalswinefever;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface WclassicalswinefeverMapper extends Mapper<Wclassicalswinefever> {
    Wclassicalswinefever selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Wclassicalswinefever> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}