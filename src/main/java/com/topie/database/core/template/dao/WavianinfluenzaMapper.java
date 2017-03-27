package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Wavianinfluenza;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;

public interface WavianinfluenzaMapper extends Mapper<Wavianinfluenza> {
    Wavianinfluenza selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
}