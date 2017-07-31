package com.base.lib.entity;

/**
 * Created by malijie on 2017/7/31.
 */

public class ApiResponse<T> {

    private String errorCode;
    private T errorData;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getErrorData() {
        return errorData;
    }

    public void setErrorData(T errorData) {
        this.errorData = errorData;
    }
}
