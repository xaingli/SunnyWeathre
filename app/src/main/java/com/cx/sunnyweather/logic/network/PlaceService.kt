package com.cx.sunnyweather.logic.network

import com.cx.sunnyweather.SunnyWeatherApplication
import com.cx.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by cx on 2020/8/18
 * Describe:
 */

interface PlaceService{

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String) : Call<PlaceResponse>
}