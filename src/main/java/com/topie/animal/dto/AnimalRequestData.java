package com.topie.animal.dto;

import java.util.Map;

public class AnimalRequestData {

    private String report_id;

    private String template_id;

    private Integer report_type;

    private String report_user_id;

    private String report_time;

    private String status;

    private String begin_time;

    private Map report_data;

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public Integer getReport_type() {
        return report_type;
    }

    public void setReport_type(Integer report_type) {
        this.report_type = report_type;
    }

    public String getReport_user_id() {
        return report_user_id;
    }

    public void setReport_user_id(String report_user_id) {
        this.report_user_id = report_user_id;
    }

    public String getReport_time() {
        return report_time;
    }

    public void setReport_time(String report_time) {
        this.report_time = report_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    public Map getReport_data() {
        return report_data;
    }

    public void setReport_data(Map report_data) {
        this.report_data = report_data;
    }
}
