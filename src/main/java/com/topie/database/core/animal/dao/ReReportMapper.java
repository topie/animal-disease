package com.topie.database.core.animal.dao;

import com.topie.animal.dto.ReReportDto;
import com.topie.database.core.animal.model.ReReport;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReReportMapper extends Mapper<ReReport> {

    List<ReReportDto> selectByReReportDto(ReReportDto reReport);

    int updateToClose(@Param("id") String id);

}
