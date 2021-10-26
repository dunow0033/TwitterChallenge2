package com.example.twitterchallenge2.data.network;


import com.example.twitterchallenge2.model.WeatherConditions;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {
    @GET("current.json")
    Single<WeatherConditions> getTodaysWeather();

    @GET("/future_{n}.json")
    Single<WeatherConditions> getFutureWeatherForDay(@Path("n") int day);
}
