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
import com.darklh.wenews.model.GirlsResult;
import com.darklh.wenews.presenter.GirlsPresenterImpl;
import com.darklh.wenews.util.LoadingUtil;
import com.darklh.wenews.view.GirlsView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by darklh on 2016/11/23.
 */

public class GirlsFragment extends BaseFragment implements GirlsView, PullLoadMoreRecyclerView.PullLoadMoreListener {
    @BindView(R2.id.pull_load_recyclerview)
    PullLoadMoreRecyclerView mRecyclerView;

    private GirlsAdapter mAdapter;
    private GirlsPresenterImpl mPresenter;
    private List<GirlsResult.Girl> mGirls = new ArrayList<>();
    private int page = new Random().nextInt(45);
    private int rows = 20;

    public static GirlsFragment newInstance() {

        Bundle args = new Bundle();

        GirlsFragment fragment = new GirlsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girls, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = new GirlsAdapter(getActivity(), mGirls);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setStaggeredGridLayout(2);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setOnPullLoadMoreListener(this);
        mPresenter = new GirlsPresenterImpl(this);
        showProgress();
        mPresenter.loadData(page, rows);
    }

    @Override
    public void setData(List<GirlsResult.Girl> girls) {
        mGirls.addAll(girls);
        mAdapter.setData(mGirls);
        mAdapter.notifyDataSetChanged();
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
    public void onRefresh() {
        mGirls.clear();
        page = new Random().nextInt(45);
        mPresenter.loadData(page, rows);
    }

    @Override
    public void onLoadMore() {
        page = new Random().nextInt(45);
        mPresenter.loadData(page, rows);
    }
}
