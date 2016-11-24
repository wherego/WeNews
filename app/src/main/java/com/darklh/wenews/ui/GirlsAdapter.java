package com.darklh.wenews.ui;

import android.content.Context;
import android.widget.ImageView;

import com.darklh.wenews.R;
import com.darklh.wenews.model.Constant;
import com.darklh.wenews.model.GirlsResult;
import com.squareup.picasso.Picasso;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public class GirlsAdapter extends BaseAdapter<GirlsResult.Girl> {

    private Context mContext;

    public GirlsAdapter(Context context, int layoutId, List<GirlsResult.Girl> datas) {
        super(context, layoutId, datas);
        mContext = context;
    }

    @Override
    protected void convert(ViewHolder holder, GirlsResult.Girl girl, int position) {
        ImageView imageView = holder.getView(R.id.iv_img);
        Picasso.with(mContext).load(Constant.API_SERVER_IMAGE_URL + girl.img).into(imageView);
    }
}
