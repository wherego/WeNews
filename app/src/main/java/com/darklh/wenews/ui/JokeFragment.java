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
import com.darklh.wenews.model.Joke;
import com.darklh.wenews.presenter.JokePresenterImpl;
import com.darklh.wenews.util.LoadingUtil;
import com.darklh.wenews.view.JokeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by darklh on 2016/11/25.
 */

public class JokeFragment extends BaseFragment implements JokeView, PullLoadMoreRecyclerView.PullLoadMoreListener {

    @BindView(R2.id.pull_load_recyclerview)
    PullLoadMoreRecyclerView mRecyclerView;

    JokeAdapter mAdapter;

    JokePresenterImpl mPresenter;

    List<Joke> mJokes = new ArrayList<>();

    private int page = 1;

    public static JokeFragment newInstance() {

        Bundle args = new Bundle();

        JokeFragment fragment = new JokeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = new JokeAdapter(getActivity(), mJokes);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLinearLayout();
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setOnPullLoadMoreListener(this);
        mPresenter = new JokePresenterImpl(this);
        showProgress();
        mPresenter.loadData(page);
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
    public void setData(List<Joke> jokes) {
        if (page == 1) {
            mJokes.clear();
        }
        mJokes.addAll(jokes);
        mAdapter.setData(mJokes);
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
}
