package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.common.utils.Option;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animal.model.Template;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/21.
 */
public interface ITemplateService extends IService<Template> {

    PageInfo<Template> selectByPage(Template template, int pageNum, int pageSize);

    List<TreeNode> selectTreeNodes(Template template);

    List<Option> selectOptions(Template template);

    List<String> selectIdsByReportType(Integer reportType);
}
