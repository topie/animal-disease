package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Wfootandmouthdisease;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface WfootandmouthdiseaseMapper extends Mapper<Wfootandmouthdisease> {
    Wfootandmouthdisease selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Wfootandmouthdisease> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}