package com.darklh.wenews.ui;

import android.content.Context;
import android.widget.ImageView;

import com.darklh.framework.adapter.recyclerview.ViewHolder;
import com.darklh.wenews.R;
import com.darklh.wenews.model.Constant;
import com.darklh.wenews.model.GirlsResult;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public class GirlsAdapter extends BaseAdapter<GirlsResult.Girl> {

    private Context mContext;

    public GirlsAdapter(Context context, List<GirlsResult.Girl> datas) {
        super(context, datas);
        mContext = context;
    }

    @Override
    protected void convert(ViewHolder holder, GirlsResult.Girl girl, int position) {
        ImageView imageView = holder.getView(R.id.iv_img);
        Picasso.with(mContext).load(Constant.API_SERVER_IMAGE_URL + girl.img).into(imageView);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.item_girls;
    }
}
