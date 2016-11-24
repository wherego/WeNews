package com.darklh.wenews.view;

import android.content.Context;

/**
 * Created by darklh on 2016/11/23.
 */

public interface BaseView {

    void showProgress();

    void dismissProgress();

    void showToast(String s);

    Context getContext();

}
