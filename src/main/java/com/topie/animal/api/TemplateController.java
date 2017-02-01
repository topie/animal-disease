package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.ITemplateService;
import com.topie.common.utils.*;
import com.topie.database.core.animal.model.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/template")
public class TemplateController {

    @Autowired
    private ITemplateService iTemplateService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(Template template,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<Template> pageInfo = iTemplateService.selectByPage(template, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(Template template) {
        template.setTemplateId(UUIDUtil.getUUID());
        int result = iTemplateService.saveNotNull(template);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(Template template) {
        iTemplateService.updateNotNull(template);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        Template template = iTemplateService.selectByKey(id);
        return ResponseUtil.success(template);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        iTemplateService.delete(id);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/treeNodes", method = RequestMethod.POST)
    @ResponseBody
    public List<TreeNode> treeNodes(Template template) {
        return iTemplateService.selectTreeNodes(template);
    }

    @RequestMapping(value = "/options", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public List<Option> options(Template template) {
        return iTemplateService.selectOptions(template);
    }
}
