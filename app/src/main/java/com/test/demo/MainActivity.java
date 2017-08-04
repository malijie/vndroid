package com.test.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.base.lib.base.AppBaseActivity;
import com.base.lib.entity.WelfareInfo;
import com.base.lib.http.DefaultThreadPool;
import com.base.lib.http.RequestParams;
import com.base.lib.utils.Logger;
import com.base.lib.utils.Util;

import java.util.List;

public class MainActivity extends AppBaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mButton = null;
    private GridView mGridView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.id_get_picture);
//        mGridView = (GridView) findViewById(R.id.id_gv);
        mButton.setOnClickListener(onClickGetPicture);

    }

    private View.OnClickListener onClickGetPicture = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mProgressDialog = Util.createProgressDialog(MainActivity.this,getResources().getString(R.string.loading_progress_tip));
            mProgressDialog.show();

            RequestParams params = new RequestParams();
            params.setParamsValue("groupId","10");
            params.setParamsValue("itemId","1");

            action.listWelfareInfo(params, new AppBaseActivity.RequestCallback<List<WelfareInfo>>() {

                @Override
                public void onSuccess(List<WelfareInfo> data) {
                    mProgressDialog.dismiss();
                    Logger.d(TAG,"data==" + data);
                }

            });

        }
    };

    @Override
    protected void onStop() {
        super.onStop();
        mThreadPool.shutDown();
    }
}
