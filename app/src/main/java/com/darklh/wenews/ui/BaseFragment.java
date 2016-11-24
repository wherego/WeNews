package com.darklh.wenews.ui;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.darklh.wenews.util.LoadingUtil;

/**
 * Created by darklh on 2016/11/22.
 */

public class BaseFragment extends Fragment {

    public void showToast(String str) {
        Toast.makeText(getActivity(), str, Toast.LENGTH_SHORT).show();
    }

    public void showProgress() {
        LoadingUtil.show(getActivity());
    }

    public void dismissProgress() {
        LoadingUtil.dismiss();
    }
}
