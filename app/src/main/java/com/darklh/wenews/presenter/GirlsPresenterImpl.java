package com.darklh.wenews.presenter;

import com.darklh.wenews.model.GirlsResult;
import com.darklh.wenews.network.ApiManager;
import com.darklh.wenews.view.GirlsView;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by darklh on 2016/11/23.
 */

public class GirlsPresenterImpl extends BasePresenterImpl {

    private GirlsView mView;

    public GirlsPresenterImpl(GirlsView view) {
        mView = view;
    }

    public void loadData(int page, int rows) {
        Subscription subscription = retrofitExecute(ApiManager.getInstence().getApi().getGirls(page, rows), new Subscriber<GirlsResult>() {
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
            public void onNext(GirlsResult girlsResult) {
                mView.dismissProgress();
                if (girlsResult.status) {
                    mView.setData(girlsResult.tngou);
                } else {
                    mView.showToast("加载失败");
                }
            }
        });
        addSubscription(subscription);
    }
}
