package com.topie.database.core.template.dao;

        import com.topie.database.core.template.model.KingfisherNew;
        import org.apache.ibatis.annotations.Param;
        import tk.mybatis.mapper.common.Mapper;

        import java.util.List;

public interface KingfisherNewMapper extends Mapper<KingfisherNew> {
    List<KingfisherNew> selectAllByDate(@Param("beginTime") String beginTime,@Param("endTime")String endTime);
}