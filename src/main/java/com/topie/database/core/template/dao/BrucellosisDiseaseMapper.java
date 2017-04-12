package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.BrucellosisDisease;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface BrucellosisDiseaseMapper extends Mapper<BrucellosisDisease> {

    BrucellosisDisease selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<BrucellosisDisease> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}