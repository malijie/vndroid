package com.test;

import android.app.Application;
import android.content.Context;

import com.base.lib.control.CommonLibManager;
import com.base.lib.profile.Profile;

/**
 * Created by malijie on 2017/8/2.
 */

public class TestApplication extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);


    }

    @Override
    public void onCreate() {
        super.onCreate();
        CommonLibManager.init(getApplicationContext());
    }
}
