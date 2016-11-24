package com.darklh.wenews.network;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

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

}
