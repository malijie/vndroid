package com.base.lib.app;

import com.base.lib.entity.WelfareInfo;

import java.util.List;

/**
 * Created by malijie on 2017/7/31.
 */

public interface AppAction {
    void listWelfareInfo(String groupId, String itemId, ActionCallback<List<WelfareInfo>> callback);
}
