package com.topie.animal.dto;

import org.hibernate.validator.constraints.NotBlank;

public class AnimalRequest {

    @NotBlank(message = "ClientId不能为空")
    private String ClientId;

    private String Version = "1.0.0";

    @NotBlank(message = "RequestId不能为空")
    private String RequestId;

    private AnimalRequestData Data;

    @NotBlank(message = "TimeStamp不能为空")
    private Integer TimeStamp;

    @NotBlank(message = "Mac不能为空")
    private String Mac;

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String clientId) {
        ClientId = clientId;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public AnimalRequestData getData() {
        return Data;
    }

    public void setData(AnimalRequestData data) {
        Data = data;
    }

    public Integer getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Integer timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getMac() {
        return Mac;
    }

    public void setMac(String mac) {
        Mac = mac;
    }
}
