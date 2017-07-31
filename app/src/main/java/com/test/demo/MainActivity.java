package com.test.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.base.lib.R;
import com.base.lib.app.ActionCallback;
import com.base.lib.entity.WelfareInfo;

import java.util.List;

public class MainActivity extends BaseActivity {
    private Button mButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.id_get_picture);
        mButton.setOnClickListener(onClickGetPicture);
    }

    private View.OnClickListener onClickGetPicture = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            action.getWelfareInfo("10", "1", new ActionCallback<List<WelfareInfo>>() {
                @Override
                public List<WelfareInfo> onSuccess(String errorCode) {

                    return null;
                }

                @Override
                public void onFailed(String errorMsg) {

                }
            });
        }
    };
}
