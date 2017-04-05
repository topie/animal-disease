package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Classicalswinefevervaccine;
import com.topie.database.core.template.model.Footandmouthvaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FootandmouthvaccineMapper extends Mapper<Footandmouthvaccine> {
    List<Footandmouthvaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}