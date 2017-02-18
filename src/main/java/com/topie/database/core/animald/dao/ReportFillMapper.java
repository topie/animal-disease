package com.topie.database.core.animald.dao;

import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.ReportFill;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportFillMapper extends Mapper<ReportFill> {

    List<TreeNode> selectTreeNodes(ReportFill reportFill);

}
