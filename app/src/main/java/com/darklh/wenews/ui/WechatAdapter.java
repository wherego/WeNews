package com.darklh.wenews.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.darklh.wenews.R;
import com.darklh.wenews.model.WechatResult;
import com.squareup.picasso.Picasso;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public class WechatAdapter extends BaseAdapter<WechatResult.WechatInfo.Wechat> {
    private Context mContext;

    public WechatAdapter(Context context, int layoutId, List<WechatResult.WechatInfo.Wechat> datas) {
        super(context, layoutId, datas);
        mContext = context;
    }

    @Override
    protected void convert(ViewHolder holder, final WechatResult.WechatInfo.Wechat wechat, int position) {
        ImageView imageView = holder.getView(R.id.iv_news_img);
        TextView desTv = holder.getView(R.id.tv_des);
        if (!TextUtils.isEmpty(wechat.firstImg)) {
            Picasso.with(mContext).load(wechat.firstImg).into(imageView);
        }
        desTv.setText(wechat.title);
        holder.setText(R.id.tv_source, String.format("来源：%s", wechat.source));
        holder.getConvertView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, WechatDetailActivity.class);
                intent.putExtra("wechat", wechat);
                mContext.startActivity(intent);
            }
        });
    }
}
