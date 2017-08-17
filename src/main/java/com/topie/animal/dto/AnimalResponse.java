package com.topie.animal.dto;

import com.topie.common.utils.EncryptHelper;

public class AnimalResponse {

    private String ClientId = "DWYBFK";

    private String Version = "1.0.0";

    private String RequestId;

    private Integer TimeStamp;

    private String Mac;

    private Integer ErrorCode;

    private String ErrorMessage;

    public AnimalResponse() {
    }

    public AnimalResponse(String requestId, Integer errorCode, String errorMessage) {
        if (requestId == null) requestId = "";
        RequestId = requestId;
        TimeStamp = Math.toIntExact((System.currentTimeMillis() / 1000));
        Mac = EncryptHelper.md5(ClientId + "QH_Big_Data" + requestId + TimeStamp);
        ErrorCode = errorCode;
        ErrorMessage = errorMessage;
    }

    public String getMac() {
        return Mac;
    }

    public void setMac(String mac) {
        Mac = mac;
    }

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

    public Integer getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Integer timeStamp) {
        TimeStamp = timeStamp;
    }

    public Integer getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(Integer errorCode) {
        ErrorCode = errorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
