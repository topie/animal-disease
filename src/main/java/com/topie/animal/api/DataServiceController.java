package com.topie.animal.api;

import com.alibaba.fastjson.JSONObject;
import com.topie.animal.dto.AnimalRequest;
import com.topie.animal.dto.AnimalResponse;
import com.topie.animal.service.IExcelService;
import com.topie.animal.service.IReportService;
import com.topie.common.utils.EncryptHelper;
import com.topie.common.utils.UUIDUtil;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/animalDiseaseDataService")
public class DataServiceController {

    private static final String secret = "QH_Big_Data";

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IExcelService iExcelService;

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public AnimalResponse service(@RequestBody @Valid AnimalRequest animalRequest, BindingResult result) {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("001", "2664786F-FD92-4838-B492-1617D21C4D73");
        requestMap.put("002", "2664786F-FD92-4838-B492-3617D21C4F73");
        requestMap.put("003", "2664786F-FD92-4838-B492-4617D21C4D73");
        requestMap.put("004", "2664786F-FD92-4838-B492-3617D21C4D73");
        requestMap.put("005", "2664786F-FD92-4838-B492-3617D21C4073");
        requestMap.put("006", "2664786F-FD92-4838-B492-3217D21C4D73");
        requestMap.put("007", "98F63333-F113-4755-97D9-035CE1C5884A");
        requestMap.put("008", "2664786F-FD92-4838-B412-3617D21C4D73");
        requestMap.put("009", "1c3ab13811ed4e6dbb0b4b26030fbf7e");
        requestMap.put("010", "b719631153994fe3a02fdd94c5410c1f");
        requestMap.put("011", "2664786F-FD92-4838-B492-4617D21C4D71");
        requestMap.put("012", "2664786F-FD92-4838-B492-3617D21C4F73");
        requestMap.put("013", "2664786F-FD92-4838-B492-4617D21C4D79");
        requestMap.put("014", "2664786F-FD92-4838-B492-4617D21C4D77");
        requestMap.put("015", "2664786F-FD92-4838-B492-4617D21C4D74");
        requestMap.put("016", "2664786F-FD92-4838-B492-4617D21C4C79");
        requestMap.put("017", "dd9f5a6ea6904954b9f9d1cdd97e0873");
        requestMap.put("018", "a65580ed972e468f93b9873c216224ba");
        requestMap.put("019", "40618046-3776-4402-95FB-FAD94619EBA3");
        requestMap.put("020", "40618046-3776-4402-95FB-FAD94612EBA1");
        requestMap.put("021", "40618046-3776-4402-95FB-FAD94611EBA1");
        requestMap.put("022", "40618046-3776-4402-95FB-FAD94629EBA1");
        requestMap.put("023", "40618046-3776-4402-95FB-FAD9461913A1");
        requestMap.put("024", "40618046-3776-4402-95FB-FAD94619E3A1");
        requestMap.put("025", "40618046-3776-4402-95FB-FAD94319EBA1");
        requestMap.put("026", "40618046-3776-4402-95FB-FAD94219E3A1");
        requestMap.put("027", "40618046-3776-4402-95FB-FAD94619EBA2");
        requestMap.put("028", "2664786F-FD92-4838-B492-4617D21C4D75");
        requestMap.put("029", "e7d1063ae4d84c0c91b820839a2b5a2d");
        requestMap.put("030", "43abda1d43404fdfa480f3eeec615876");
        requestMap.put("031", "2664786F-FD92-4838-B492-3617D2134D73");
        requestMap.put("032", "2664786F-FD92-4838-B492-3617D31C4D73");
        if (result.hasErrors()) {
            StringBuilder builder = new StringBuilder();
            for (ObjectError objectError : result.getAllErrors()) {
                builder.append(objectError.getDefaultMessage()).append(";");
            }
            return new AnimalResponse(animalRequest.getRequestId(), -1, "协议格式不正确"+builder.toString());
        }
        String fullMessage =
                animalRequest.getClientId() + secret + animalRequest.getRequestId() + animalRequest.getTimeStamp();
        String mac = EncryptHelper.md5(fullMessage);
        if (!animalRequest.getMac().equals(mac)) {
            return new AnimalResponse(animalRequest.getRequestId(), -104, "MAC校验失败");
        }
        Report report = new Report();
        String templateId = requestMap.get(animalRequest.getRequestId());
        report.setTemplateId(templateId);
        Integer reportType = animalRequest.getData().getReport_type();
        report.setReportType(reportType);
        report.setReportId(UUIDUtil.getUUID());
        report.setBeginTime(DateUtil.StringToDate(animalRequest.getData().getBegin_time()));
        report.setReportTime(new Date());
        report.setReportUserId(animalRequest.getData().getReport_user_id());
        report.setStatus(1);
        iReportService.saveNotNull(report);
        iExcelService
                .insertOrUpdateReportFill(JSONObject.toJSONString(animalRequest.getData().getReport_data()), report);
        report.setStatus(2);
        return new AnimalResponse(animalRequest.getRequestId(), 0, "成功");
    }
}
