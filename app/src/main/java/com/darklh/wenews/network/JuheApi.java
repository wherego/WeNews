package com.darklh.wenews.network;

import com.darklh.wenews.model.WechatResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by darklh on 2016/11/24.
 */

public interface JuheApi {
    @GET("weixin/query?key=1da305901573d24007e2b07a0f266271")
    Observable<WechatResult> getWechat(@Query("pno") int pno);
}
