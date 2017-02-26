package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.LiveStockInOut;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LiveStockInOutMapper extends Mapper<LiveStockInOut> {

    LiveStockInOut selectOneByReportId(@Param("reportId") String reportId);

    List<LiveStockInOut> selectByReportIds(@Param("ids") List<String> reportIds);

    LiveStockInOut selectSumByReportIds(@Param("ids") List<String> reportIds);
}
