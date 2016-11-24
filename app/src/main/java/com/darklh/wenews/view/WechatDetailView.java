package com.darklh.wenews.view;

import com.darklh.wenews.model.NewsDetailResult;

/**
 * Created by darklh on 2016/11/23.
 */

public interface WechatDetailView extends BaseView {

    void setData(NewsDetailResult result);
}
