package com.darklh.wenews.view;

import com.darklh.wenews.model.WechatResult;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public interface WechatView extends BaseView {

    void setData(List<WechatResult.WechatInfo.Wechat> wechats);

}
