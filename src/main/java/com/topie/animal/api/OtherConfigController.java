package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IOtherConfigService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animal.model.OtherConfig;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/3/15.
 */
@Controller
@RequestMapping("/api/animal/otherConfig")
public class OtherConfigController {

    @Autowired
    private IOtherConfigService iOtherConfigService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(OtherConfig otherConfig,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<OtherConfig> pageInfo = iOtherConfigService.selectByPage(otherConfig, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(OtherConfig otherConfig) {
        int result = iOtherConfigService.saveNotNull(otherConfig);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(OtherConfig otherConfig) {
        iOtherConfigService.updateNotNull(otherConfig);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") Integer id) {
        OtherConfig otherConfig = iOtherConfigService.selectByKey(id);
        return ResponseUtil.success(otherConfig);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") Integer id) {
        iOtherConfigService.delete(id);
        return ResponseUtil.success();
    }
}
