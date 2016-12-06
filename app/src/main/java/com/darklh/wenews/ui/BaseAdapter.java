package com.darklh.wenews.ui;

import android.content.Context;

import com.darklh.framework.adapter.recyclerview.CommonAdapter;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public abstract class BaseAdapter<T> extends CommonAdapter<T> {

    public BaseAdapter(Context context, List<T> datas) {
        super(context, datas);
    }

    public void setData(List<T> data) {
        mDatas = data;
    }
}
