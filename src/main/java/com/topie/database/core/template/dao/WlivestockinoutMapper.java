package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.Disinfectiondrugs;
import com.topie.database.core.template.model.Wlivestockinout;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WlivestockinoutMapper extends Mapper<Wlivestockinout> {

    Wlivestockinout selectSumByReportIds(@Param("ids") List<String> reportIds);
    Wlivestockinout selectLivestockInOutByRegionCode(@Param("regionCode") String regionCode,@Param("beginTime") String beginTime);
    List<Wlivestockinout> selectLivestockInOutByDate(@Param("beginTime") String beginTime);

    List<Wlivestockinout> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}
