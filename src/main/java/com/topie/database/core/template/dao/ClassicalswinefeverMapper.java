package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Classicalswinefever;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

public interface ClassicalswinefeverMapper extends Mapper<Classicalswinefever> {

    Classicalswinefever selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);

}