package com.darklh.wenews.network;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 *
 */
public class ApiManager {

    private static ApiManager apiManage;

    public static ApiManager getInstence() {
        if (apiManage == null) {
            synchronized (ApiManager.class) {
                if (apiManage == null) {
                    apiManage = new ApiManager();
                }
            }
        }
        return apiManage;
    }


    private static OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new LoggerIntercepter())
            .build();

    private Api mApi;

    private Object obj = new Object();

    public Api getApi() {
        if (mApi == null) {
            synchronized (obj) {
                if (mApi == null) {
                    mApi = new Retrofit.Builder()
                            .baseUrl("http://www.tngou.net/")
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build().create(Api.class);
                }
            }
        }
        return mApi;
    }

    private JuheApi mJuheApi;

    public JuheApi getJuheApi() {
        if (mJuheApi == null) {
            synchronized (obj) {
                if (mJuheApi == null) {
                    mJuheApi = new Retrofit.Builder()
                            .baseUrl("http://v.juhe.cn/")
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build().create(JuheApi.class);
                }
            }
        }
        return mJuheApi;
    }

    private JokeApi mJokeApi;

    public JokeApi getJokeApi() {
        if (mJokeApi == null) {
            synchronized (obj) {
                if (mJokeApi == null) {
                    mJokeApi = new Retrofit.Builder()
                            .baseUrl("http://www.qiushibaike.com/")
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .client(client)
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build().create(JokeApi.class);
                }
            }
        }
        return mJokeApi;
    }

}
