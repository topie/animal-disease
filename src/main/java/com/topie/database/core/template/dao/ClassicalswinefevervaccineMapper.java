package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Bluevaccine;
import com.topie.database.core.template.model.Classicalswinefevervaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ClassicalswinefevervaccineMapper extends Mapper<Classicalswinefevervaccine> {
    List<Classicalswinefevervaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}