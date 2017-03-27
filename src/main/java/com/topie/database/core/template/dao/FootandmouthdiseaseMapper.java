package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Footandmouthdisease;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

public interface FootandmouthdiseaseMapper extends Mapper<Footandmouthdisease> {
    Footandmouthdisease selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
}