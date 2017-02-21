package com.topie.database.core.animal.dao;

import com.topie.animal.dto.ReportDto;
import com.topie.database.core.animal.model.Report;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ReportMapper extends Mapper<Report> {

    List<ReportDto> selectByPageByArg(Map argMap);
}
