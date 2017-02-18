package com.topie.animald.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.ReportFill;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IReportFillService extends IService<ReportFill> {

    PageInfo<ReportFill> selectByPage(ReportFill userInfo, int pageNum, int pageSize);

    List<TreeNode> selectTreeNodes(ReportFill reportFill);

    PageInfo<ReportFill> selectNormalFillByPage(ReportFill reportFill, int pageNum, int pageSize);

    String getNormalFillHtml(HttpServletRequest request, ReportFill reportFill, Integer userId);

    int insertOrUpdateNormalFill(String data, ReportFill reportFill, Integer userId);
}
