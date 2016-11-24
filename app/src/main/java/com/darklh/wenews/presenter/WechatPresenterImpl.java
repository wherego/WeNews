package com.darklh.wenews.presenter;

import com.darklh.wenews.model.WechatResult;
import com.darklh.wenews.network.ApiManager;
import com.darklh.wenews.view.WechatView;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by darklh on 2016/11/23.
 */

public class WechatPresenterImpl extends BasePresenterImpl {

    private WechatView mView;

    public WechatPresenterImpl(WechatView view) {
        mView = view;
    }

    public void loadData(int page) {
        Subscription subscription = retrofitExecute(ApiManager.getInstence().getJuheApi().getWechat(page), new Subscriber<WechatResult>() {
            @Override
            public void onCompleted() {
                mView.dismissProgress();
            }

            @Override
            public void onError(Throwable e) {
                mView.dismissProgress();
                mView.showToast("加载失败");
            }

            @Override
            public void onNext(WechatResult result) {
                mView.dismissProgress();
                if (result.error_code == 0) {
                    mView.setData(result.result.list);
                } else {
                    mView.showToast("加载失败");
                }
            }
        });
        addSubscription(subscription);
    }
}
