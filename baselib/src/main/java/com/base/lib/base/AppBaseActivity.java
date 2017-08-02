package com.base.lib.base;

import com.base.lib.app.ActionCallback;
import com.base.lib.utils.Logger;
import com.base.lib.utils.ToastManager;

/**
 * Created by malijie on 2017/8/2.
 */

public abstract class AppBaseActivity extends BaseActivity {
    private static final String TAG = AppBaseActivity.class.getSimpleName();

    public abstract class RequestCallback<T> implements ActionCallback<T>{
        @Override
        public void onFailed(String errorMsg) {
            ToastManager.showNoNetwork();
        }

        @Override
        public void onSuccess(T data) {

        }
    }
}
