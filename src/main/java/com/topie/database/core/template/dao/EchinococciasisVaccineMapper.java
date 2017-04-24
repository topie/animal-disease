package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.EchinococciasisVaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EchinococciasisVaccineMapper extends Mapper<EchinococciasisVaccine> {
    List<EchinococciasisVaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}