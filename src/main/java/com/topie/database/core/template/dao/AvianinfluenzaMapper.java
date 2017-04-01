package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Avianinfluenza;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface AvianinfluenzaMapper extends Mapper<Avianinfluenza> {

    Avianinfluenza selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime") Date beginTime,@Param("endTime")Date endTime);
    List<Avianinfluenza> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}