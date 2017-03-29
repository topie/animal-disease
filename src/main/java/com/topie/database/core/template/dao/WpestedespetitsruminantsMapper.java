package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Wpestedespetitsruminants;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface WpestedespetitsruminantsMapper extends Mapper<Wpestedespetitsruminants> {
    Wpestedespetitsruminants selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Wpestedespetitsruminants> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}