package com.topie.animald.api;

import com.github.pagehelper.PageInfo;
import com.topie.animald.service.INormalFillService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.NormalFill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animalDisease/normalFill")
public class NormalFillController {

    @Autowired
    private INormalFillService iNormalFillService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(NormalFill normalFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<NormalFill> pageInfo = iNormalFillService.selectByPage(normalFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(NormalFill normalFill) {
        int result = iNormalFillService.saveNotNull(normalFill);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(NormalFill normalFill) {
        iNormalFillService.updateNotNull(normalFill);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") Integer id) {
        NormalFill normalFill = iNormalFillService.selectByKey(id);
        return ResponseUtil.success(normalFill);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") Integer id) {
        iNormalFillService.delete(id);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/treeNodes", method = RequestMethod.POST)
    @ResponseBody
    public List<TreeNode> treeNodes(NormalFill normalFill) {
        return iNormalFillService.selectTreeNodes(normalFill);
    }
}
