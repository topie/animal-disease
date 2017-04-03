package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.LiveStockInOut;
import com.topie.database.core.template.model.Newcastle;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface LiveStockInOutMapper extends Mapper<LiveStockInOut> {

    LiveStockInOut selectOneByReportId(@Param("reportId") String reportId);

    List<LiveStockInOut> selectByReportIds(@Param("ids") List<String> reportIds);

    LiveStockInOut selectSumByReportIds(@Param("ids") List<String> reportIds);

    LiveStockInOut selectSumByReportCode(@Param("regionCode") String regionCode,@Param("beginTime")Date beginTime,@Param("endTime")Date endTime);

    List<LiveStockInOut> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);

}

