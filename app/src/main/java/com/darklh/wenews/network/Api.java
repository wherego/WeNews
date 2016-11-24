package com.darklh.wenews.network;


import com.darklh.wenews.model.GirlsResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 *
 */
public interface Api {

    @GET("tnfs/api/list")
    Observable<GirlsResult> getGirls(@Query("page") int page, @Query("rows") int rows);
}
