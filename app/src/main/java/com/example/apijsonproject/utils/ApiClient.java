package com.example.apijsonproject.utils;

import android.util.Log;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "https://deezerdevs-deezer.p.rapidapi.com";
    public static final String APY_KEY = "0e2ab71894mshdc79f98d5127b9cp19cdc3jsnc739053375aa";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
//        OkHttpClient client = new OkHttpClient.Builder()
//                .addInterceptor(new Interceptor() {
//                    @NonNull
//                    @Override
//                    public okhttp3.Response intercept(@NonNull Chain chain) throws IOException {
//                        Request original = chain.request();
//
//                        // Add your headers here
//                        Request.Builder requestBuilder = original.newBuilder()
//                                .header("X-RapidAPI-Key", "0e2ab71894mshdc79f98d5127b9cp19cdc3jsnc739053375aa")
//                                .header("X-RapidAPI-Host", "deezerdevs-deezer.p.rapidapi.com");
//                        Log.i("deezerId", "make requestBuilder");
//                        Request request = requestBuilder
//                                .url("https://deezerdevs-deezer.p.rapidapi.com/search?q=eminem")
//                                .get()
//                                .build();
//                        Log.i("deezerId", "make request");
//                        return chain.proceed(request);
//                    }
//                })
//                .build();
        Log.i("deezerId", "before retrofit");
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiClient.BASE_URL)
                 //   .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
