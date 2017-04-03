package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Newcastlevaccine;
import com.topie.database.core.template.model.Poultrydensity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PoultrydensityMapper extends Mapper<Poultrydensity> {
    List<Poultrydensity> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}