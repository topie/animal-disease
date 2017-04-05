package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Livestockdensity;
import com.topie.database.core.template.model.Newcastlevaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NewcastlevaccineMapper extends Mapper<Newcastlevaccine> {
    List<Newcastlevaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}