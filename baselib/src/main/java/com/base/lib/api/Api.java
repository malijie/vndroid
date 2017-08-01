package com.base.lib.api;

import com.base.lib.entity.ApiResponse;
import com.base.lib.entity.WelfareInfo;

import java.util.List;

/**
 * Created by malijie on 2017/7/31.
 */

public interface Api {
    ApiResponse<List<WelfareInfo>> getWelfareInfo(String groupId,String itemId);
}
