package com.caobin.retrofit_rxjava.http;

import com.caobin.retrofit_rxjava.http.entity.WeatherEntity;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by caobin on 2016/12/22.
 */
public interface WeatherService {
    //http://wthrcdn.etouch.cn/weather_mini
    @GET("weather_mini")
    Observable<WeatherEntity> getWeatherInfo(@Query("city") String city);
}
