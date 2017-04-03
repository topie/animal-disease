package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Vaccineorder;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface VaccineorderMapper extends Mapper<Vaccineorder> {
    Vaccineorder selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Vaccineorder> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}