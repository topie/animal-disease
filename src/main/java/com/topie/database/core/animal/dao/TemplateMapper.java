package com.topie.database.core.animal.dao;

import com.topie.common.utils.Option;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animal.model.Template;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TemplateMapper extends Mapper<Template> {

    List<TreeNode> selectTreeNodes(Template template);

    List<Option> selectOptions(Template template);

    List<String> selectIdsByReportType(@Param("reportType") Integer reportType);
}
