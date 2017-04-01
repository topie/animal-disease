package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Newcastle;
import com.topie.database.core.template.model.Pestedespetitsruminants;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface NewcastleMapper extends Mapper<Newcastle> {
    Newcastle selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Newcastle> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}