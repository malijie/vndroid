package com.base.lib.app;

import android.os.AsyncTask;
import android.text.TextUtils;

import com.base.lib.R;
import com.base.lib.api.Api;
import com.base.lib.api.ApiImpl;
import com.base.lib.entity.ApiResponse;
import com.base.lib.entity.WelfareInfo;
import com.base.lib.http.RequestParams;
import com.base.lib.utils.ToastManager;
import com.base.lib.utils.Util;

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
    public void listWelfareInfo(final RequestParams requestParams, final ActionCallback<List<WelfareInfo>> callback) {
        if(!requestParams.isValidate()){
            ToastManager.showShortMsg("参数错误");
            return;
        }

        if(!Util.hasInternet()){
            callback.onFailed("当前无网络");
            return;
        }

        new AsyncTask<Void, Void, ApiResponse<List<WelfareInfo>>>() {

            @Override
            protected ApiResponse<List<WelfareInfo>> doInBackground(Void... params) {
                return api.getWelfareInfo(requestParams);
            }

            @Override
            protected void onPostExecute(ApiResponse<List<WelfareInfo>> listApiResponse) {
                if (!listApiResponse.hasError()) {
                    callback.onSuccess(listApiResponse.getResults());
                } else {
                    callback.onFailed("数据返回失败");
                }
            }
        }.execute();

    }
}
