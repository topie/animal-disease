package com.topie.database.core.animald.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by chenguojun on 2017/2/14.
 */
public interface AnimalDiseaseMapper {

    Map selectReportData(@Param("tableName") String tableName, @Param("fillId") Integer fillId,
            @Param("orgId") Integer orgId);
}
