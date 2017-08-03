package com.base.lib.app;

import com.base.lib.entity.WelfareInfo;
import com.base.lib.http.RequestParams;

import java.util.List;
import java.util.Map;

/**
 * Created by malijie on 2017/7/31.
 */

public interface AppAction {
    void listWelfareInfo(RequestParams requestParams, ActionCallback<List<WelfareInfo>> callback);
}
