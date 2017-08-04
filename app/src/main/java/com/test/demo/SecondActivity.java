package com.test.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.base.lib.base.AppBaseActivity;
import com.base.lib.http.DefaultThreadPool;
import com.base.lib.utils.Logger;

/**
 * Created by malijie on 2017/8/3.
 */

public class SecondActivity extends AppBaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.mlj("SecondActivity onCreate");

        final DefaultThreadPool defaultThreadPool = DefaultThreadPool.getInstance();
        defaultThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                Logger.mlj("=======task 1===========");
            }
        });

        defaultThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                Logger.mlj("=======task 2===========");
            }
        });



        defaultThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                Logger.mlj("=======task 3===========");
            }
        });
        defaultThreadPool.shutDown();

        defaultThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                Logger.mlj("=======task 4===========");
            }
        });

        defaultThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                Logger.mlj("=======task 5===========");
            }
        });

    }
}
