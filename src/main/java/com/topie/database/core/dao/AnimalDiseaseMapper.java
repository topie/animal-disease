package com.topie.database.core.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by chenguojun on 2017/2/14.
 */
public interface AnimalDiseaseMapper {

    Map selectLivestock(@Param("arg") Map argMap);

}
