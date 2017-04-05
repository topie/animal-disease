package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Poultrydensity;
import com.topie.database.core.template.model.Smallruminantsvaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SmallruminantsvaccineMapper extends Mapper<Smallruminantsvaccine> {
    List<Smallruminantsvaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}