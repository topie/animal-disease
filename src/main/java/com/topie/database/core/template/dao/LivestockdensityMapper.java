package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Kingfisher;
import com.topie.database.core.template.model.Livestockdensity;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LivestockdensityMapper extends Mapper<Livestockdensity> {
    List<Livestockdensity> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}