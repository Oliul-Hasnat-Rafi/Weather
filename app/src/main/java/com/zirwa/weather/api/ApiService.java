package com.zirwa.weather.api;

import com.zirwa.weather.Model.Response;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {

    @GET("chittagong?unitGroup=metric&key=KPYZPHJ73BAF76SHQVZVM38TK&contentType=json")
    Call<Response> weatherResponse();

}
