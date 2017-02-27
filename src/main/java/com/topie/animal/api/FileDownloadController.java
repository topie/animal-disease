package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IFileDownloadService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.template.model.FileDownload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animal/fileDownload")
public class FileDownloadController {

    @Autowired
    private IFileDownloadService iFileDownloadService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(FileDownload fileDownload,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<FileDownload> pageInfo = iFileDownloadService.selectByPage(fileDownload, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(FileDownload fileDownload) {
        fileDownload.setFileid(UUIDUtil.getUUID());
        int result = iFileDownloadService.saveNotNull(fileDownload);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(FileDownload fileDownload) {
        iFileDownloadService.updateNotNull(fileDownload);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        FileDownload fileDownload = iFileDownloadService.selectByKey(id);
        return ResponseUtil.success(fileDownload);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        iFileDownloadService.delete(id);
        return ResponseUtil.success();
    }

}
