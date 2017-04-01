package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Blueeardisease;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface BlueeardiseaseMapper extends Mapper<Blueeardisease> {

    Blueeardisease selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Blueeardisease> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}