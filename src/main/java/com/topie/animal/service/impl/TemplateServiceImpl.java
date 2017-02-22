package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.service.ITemplateService;
import com.topie.common.service.impl.BaseService;
import com.topie.common.utils.Option;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animal.dao.TemplateMapper;
import com.topie.database.core.animal.model.Template;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Service
public class TemplateServiceImpl extends BaseService<Template> implements ITemplateService {

    @Autowired
    private TemplateMapper templateMapper;

    @Override
    public PageInfo<Template> selectByPage(Template template, int pageNum, int pageSize) {
        Example example = new Example(Template.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(template.getTemplateName()))
            criteria.andLike("templateName", '%' + template.getTemplateName() + '%');
        if (template.getReportType() != null && template.getReportType()>0) criteria.andEqualTo("reportType", template.getReportType());
        PageHelper.startPage(pageNum, pageSize);
        List<Template> list = templateMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public List<TreeNode> selectTreeNodes(Template template) {
        return templateMapper.selectTreeNodes(template);
    }

    @Override
    public List<Option> selectOptions(Template template) {
        return templateMapper.selectOptions(template);
    }

    @Override
    public List<String> selectIdsByReportType(Integer reportType) {
        return templateMapper.selectIdsByReportType(reportType);
    }
}
