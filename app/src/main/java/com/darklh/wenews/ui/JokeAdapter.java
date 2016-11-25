package com.darklh.wenews.ui;

import android.content.Context;

import com.darklh.wenews.R;
import com.darklh.wenews.model.Joke;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by darklh on 2016/11/25.
 */

public class JokeAdapter extends BaseAdapter<Joke> {
    public JokeAdapter(Context context, int layoutId, List<Joke> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, Joke joke, int position) {
        holder.setText(R.id.tv_content, joke.content);
    }
}
