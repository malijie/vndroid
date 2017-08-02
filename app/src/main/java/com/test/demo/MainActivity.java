package com.test.demo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.base.lib.app.ActionCallback;
import com.base.lib.base.AppBaseActivity;
import com.base.lib.entity.WelfareInfo;
import com.base.lib.utils.Logger;
import com.base.lib.utils.Util;

import java.util.List;

public class MainActivity extends AppBaseActivity {
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
            action.listWelfareInfo("10", "1", new AppBaseActivity.RequestCallback<List<WelfareInfo>>() {

                @Override
                public void onSuccess(List<WelfareInfo> data) {
                    mProgressDialog.dismiss();
                    Logger.mlj("data==" + data);
                }

            });
        }
    };
}
