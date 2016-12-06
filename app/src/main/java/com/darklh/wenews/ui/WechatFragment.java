package com.darklh.wenews.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.darklh.framework.pullloadmore.PullLoadMoreRecyclerView;
import com.darklh.wenews.R;
import com.darklh.wenews.R2;
import com.darklh.wenews.model.WechatResult;
import com.darklh.wenews.presenter.WechatPresenterImpl;
import com.darklh.wenews.util.LoadingUtil;
import com.darklh.wenews.view.WechatView;
import com.darklh.wenews.widget.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by darklh on 2016/11/23.
 */

public class WechatFragment extends BaseFragment implements WechatView, PullLoadMoreRecyclerView.PullLoadMoreListener {

    @BindView(R2.id.pull_load_recyclerview)
    PullLoadMoreRecyclerView mRecyclerView;

    private WechatAdapter mAdapter;
    private WechatPresenterImpl mPresenter;
    private List<WechatResult.WechatInfo.Wechat> mWechats = new ArrayList<>();
    private int page = 1;

    public static WechatFragment newInstance() {

        Bundle args = new Bundle();

        WechatFragment fragment = new WechatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter = new WechatPresenterImpl(this);
        mAdapter = new WechatAdapter(getContext(), mWechats);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLinearLayout();
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL_LIST));
        mRecyclerView.setOnPullLoadMoreListener(this);
        showProgress();
        mPresenter.loadData(page);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null)
            mPresenter.onDestroy();
    }

    @Override
    public void onRefresh() {
        page = 1;
        mPresenter.loadData(page);
    }

    @Override
    public void onLoadMore() {
        page++;
        mPresenter.loadData(page);
    }

    @Override
    public void dismissProgress() {
        LoadingUtil.dismiss();
        mRecyclerView.setPullLoadMoreCompleted();
    }

    @Override
    public void showToast(String str) {
        if (mRecyclerView != null) {
            Snackbar.make(mRecyclerView, str, Snackbar.LENGTH_SHORT).setAction("刷新", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mRecyclerView.refresh();
                }
            }).show();
        }
    }

    @Override
    public void setData(List<WechatResult.WechatInfo.Wechat> wechats) {
        if (page == 1) {
            mWechats.clear();
        }
        mWechats.addAll(wechats);
        mAdapter.setData(mWechats);
        mAdapter.notifyDataSetChanged();
    }
}
