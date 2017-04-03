package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Footandmouthvaccine;
import com.topie.database.core.template.model.Kingfisher;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface KingfisherMapper extends Mapper<Kingfisher> {
    List<Kingfisher> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}