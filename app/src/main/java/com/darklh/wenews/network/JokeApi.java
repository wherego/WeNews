package com.darklh.wenews.network;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by darklh on 2016/11/25.
 */

public interface JokeApi {

    @GET("text/page/{page}")
    Observable<String> getJokes(@Path("page") int page);
}
