package com.darklh.wenews.ui;

import android.content.Context;

import com.zhy.adapter.recyclerview.CommonAdapter;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public abstract class BaseAdapter<T> extends CommonAdapter<T> {

    public BaseAdapter(Context context, int layoutId, List<T> datas) {
        super(context, layoutId, datas);
    }

    public void setData(List<T> data) {
        mDatas = data;
    }
}
