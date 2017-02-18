package com.topie.animald.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.NormalFill;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface INormalFillService extends IService<NormalFill> {

    PageInfo<NormalFill> selectByPage(NormalFill userInfo, int pageNum, int pageSize);

    List<TreeNode> selectTreeNodes(NormalFill normalFill);

    PageInfo<NormalFill> selectNormalFillByPage(NormalFill normalFill, int pageNum, int pageSize);

    String getNormalFillHtml(HttpServletRequest request, NormalFill normalFill, Integer userId);

    int insertOrUpdateNormalFill(String data, NormalFill normalFill, Integer userId);

    PageInfo<NormalFill> selectSummaryByPage(NormalFill normalFill, int pageNum, int pageSize);

    String getSummaryHtml(HttpServletRequest request, NormalFill normalFill);
}
