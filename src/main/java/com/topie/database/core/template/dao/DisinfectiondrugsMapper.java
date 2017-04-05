package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Disinfectiondrugs;
import com.topie.database.core.template.model.Emergencyvaccine;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DisinfectiondrugsMapper extends Mapper<Disinfectiondrugs> {

    List<Disinfectiondrugs> selectByReportIds(@Param("ids") List<String> reportIds);

    List<Disinfectiondrugs> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}
