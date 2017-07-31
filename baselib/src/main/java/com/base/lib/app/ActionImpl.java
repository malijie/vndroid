package com.base.lib.app;

import android.text.TextUtils;

import com.base.lib.api.Api;
import com.base.lib.api.ApiImpl;
import com.base.lib.entity.WelfareInfo;

import java.util.List;

/**
 * Created by malijie on 2017/7/31.
 */

public class ActionImpl implements AppAction{
    private Api api = null;

    public ActionImpl(){
        api = new ApiImpl();
    }

    @Override
    public void listWelfareInfo(String groupId, String itemId, ActionCallback<List<WelfareInfo>> callback) {
        if(TextUtils.isEmpty(groupId) || TextUtils.isEmpty(itemId)){

        }
    }
}
