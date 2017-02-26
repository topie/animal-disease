package com.topie.database.core.animal.dao;

import com.topie.database.core.animal.model.WeekConfig;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WeekConfigMapper extends Mapper<WeekConfig> {

    String selectWeekDtoByYearAndType(@Param("year") Integer year, @Param("type") Integer type);
}
