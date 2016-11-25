package com.darklh.wenews.view;

import com.darklh.wenews.model.Joke;

import java.util.List;

/**
 * Created by darklh on 2016/11/25.
 */

public interface JokeView extends BaseView {

    void setData(List<Joke> jokes);
}
