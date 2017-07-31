package com.base.lib.app;

/**
 * Created by malijie on 2017/7/31.
 */

public interface ActionCallback<T> {
    T onSuccess(String errorCode);
    void onFailed(String errorMsg);
}
