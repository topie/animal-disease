package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.LiveStockInOut;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface LiveStockInOutMapper extends Mapper<LiveStockInOut> {

    LiveStockInOut selectOneByReportId(@Param("reportId") String reportId);
}
