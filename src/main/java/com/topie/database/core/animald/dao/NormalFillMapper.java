package com.topie.database.core.animald.dao;

import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.NormalFill;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NormalFillMapper extends Mapper<NormalFill> {

    List<TreeNode> selectTreeNodes(NormalFill normalFill);

}
