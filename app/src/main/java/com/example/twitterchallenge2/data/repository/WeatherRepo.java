package com.example.twitterchallenge2.data.repository;


import com.example.twitterchallenge2.data.network.RetrofitInstance;
import com.example.twitterchallenge2.model.WeatherConditions;

import io.reactivex.Single;

public class WeatherRepo {
    private static WeatherRepo INSTANCE = null;

    private WeatherRepo() {

    }

    public static WeatherRepo getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new WeatherRepo();
        }
        return INSTANCE;
    }

    public Single<WeatherConditions> getTodaysWeather() {
        return RetrofitInstance.getINSTANCE().getTodaysWeather();
    }
    public Single<WeatherConditions> getWeatherForFutureDay(int i) {
        return RetrofitInstance.getINSTANCE().getFutureWeatherForDay(i);
    }
}
