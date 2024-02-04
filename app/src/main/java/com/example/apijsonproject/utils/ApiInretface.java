package com.example.apijsonproject.utils;

import com.example.apijsonproject.models.DeezerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInretface {

    @GET("/search?")
    Call<DeezerResponse> getTrackByName(@Header("X-RapidAPI-Key") String apikey,
                                        @Header("X-RapidAPI-Host") String host,
                                        @Query("q") String q);
}
