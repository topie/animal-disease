package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.BrucellosisVaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrucellosisVaccineMapper extends Mapper<BrucellosisVaccine> {
    List<BrucellosisVaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}