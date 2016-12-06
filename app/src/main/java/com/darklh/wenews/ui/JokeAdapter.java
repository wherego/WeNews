package com.darklh.wenews.ui;

import android.content.Context;

import com.darklh.framework.adapter.recyclerview.ViewHolder;
import com.darklh.wenews.R;
import com.darklh.wenews.model.Joke;

import java.util.List;

/**
 * Created by darklh on 2016/11/25.
 */

public class JokeAdapter extends BaseAdapter<Joke> {
    public JokeAdapter(Context context, List<Joke> datas) {
        super(context, datas);
    }

    @Override
    protected void convert(ViewHolder holder, Joke joke, int position) {
        holder.setText(R.id.tv_content, joke.content);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.item_joke;
    }
}
