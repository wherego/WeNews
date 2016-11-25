package com.darklh.wenews.presenter;

import com.darklh.wenews.model.Joke;
import com.darklh.wenews.network.ApiManager;
import com.darklh.wenews.view.JokeView;
import com.orhanobut.logger.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by darklh on 2016/11/25.
 */

public class JokePresenterImpl extends BasePresenterImpl {

    private JokeView mView;

    public JokePresenterImpl(JokeView view) {
        mView = view;
    }

    public void loadData(int page) {
        Subscription subscription = retrofitExecute(ApiManager.getInstence().getJokeApi().getJokes(page), new Subscriber<String>() {
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
            public void onNext(String result) {
                mView.dismissProgress();
                List<Joke> jokes = new ArrayList<Joke>();
                Joke joke;
                Document doc = Jsoup.parse(result);
                Logger.i(doc.title());
                Elements list_items = doc.getElementsByClass("article block untagged mb15");
                for (int i = 0; i < list_items.size(); i++) {
                    joke = new Joke();
                    joke.content = list_items.get(i).getElementsByClass("content").text();
                    jokes.add(joke);
                }
                mView.setData(jokes);
            }
        });
        addSubscription(subscription);
    }

}
