package com.topie.database.core.template.dao;

import com.topie.database.core.template.model.LivestockInOut;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface LivestockInOutMapper extends Mapper<LivestockInOut> {

    LivestockInOut selectOneByFillIdAndOrgId(@Param("fillId") Integer fillId, @Param("orgId") Integer orgId);

    int deleteByFillIdAndOrgId(@Param("fillId") Integer fillId, @Param("orgId") Integer orgId);

    List<LivestockInOut> selectByFillIdGroupByOrgId(@Param("fillId") Integer fillId);

    LivestockInOut selectSumByFillId(@Param("fillId") Integer fillId);
}
