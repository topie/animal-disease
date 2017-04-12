package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Wblueeardisease;
import com.topie.database.core.template.model.Wbrucellosis;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface WbrucellosisMapper extends Mapper<Wbrucellosis> {
    Wbrucellosis selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Wbrucellosis> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}