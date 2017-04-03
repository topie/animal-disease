package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Emergencyvaccine;
import com.topie.database.core.template.model.Smallruminantsvaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmergencyvaccineMapper extends Mapper<Emergencyvaccine> {
    List<Emergencyvaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}