package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Avianinfluenzavaccine;
import com.topie.database.core.template.model.Bluevaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface AvianinfluenzavaccineMapper extends Mapper<Avianinfluenzavaccine> {
    List<Avianinfluenzavaccine> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);

}