package com.topie.database.core.animal.dao;

import com.topie.database.core.animal.model.News;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface NewsMapper extends Mapper<News> {

    int updateToIncreaseCount(@Param("newId") String id);
}
