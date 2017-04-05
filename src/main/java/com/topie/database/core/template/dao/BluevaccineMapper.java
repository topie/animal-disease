package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Bluevaccine;
import com.topie.database.core.template.model.LiveStockInOut;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BluevaccineMapper extends Mapper<Bluevaccine> {
    List<Bluevaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}