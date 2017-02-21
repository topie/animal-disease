package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IOrgInfoService;
import com.topie.common.utils.*;
import com.topie.database.core.animal.model.OrgInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animal/orgInfo")
public class OrgInfoController {

    @Autowired
    private IOrgInfoService iOrgInfoService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(OrgInfo orgInfo,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<OrgInfo> pageInfo = iOrgInfoService.selectByPage(orgInfo, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(OrgInfo orgInfo) {
        orgInfo.setOrgId(UUIDUtil.getUUID());
        int result = iOrgInfoService.saveNotNull(orgInfo);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(OrgInfo orgInfo) {
        iOrgInfoService.updateNotNull(orgInfo);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        OrgInfo orgInfo = iOrgInfoService.selectByKey(id);
        return ResponseUtil.success(orgInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        iOrgInfoService.delete(id);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/treeNodes", method = RequestMethod.POST)
    @ResponseBody
    public List<TreeNode> treeNodes(OrgInfo orgInfo) {
        return iOrgInfoService.selectTreeNodes(orgInfo);
    }
}
