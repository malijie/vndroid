package com.test.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.base.lib.entity.WelfareInfo;

import java.util.List;

/**
 * Created by malijie on 2017/8/1.
 */

public class GridViewAdapter extends BaseAdapter{
    private List<WelfareInfo> mWelfareInfos = null;
    public GridViewAdapter(List<WelfareInfo> welfareInfos){
        mWelfareInfos = welfareInfos;
    }


    @Override
    public int getCount() {
        return mWelfareInfos.size();
    }

    @Override
    public Object getItem(int position) {
        return mWelfareInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
