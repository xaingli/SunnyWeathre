package com.cx.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Created by cx on 2020/8/19
 * Describe: 实时天气数据模型
 */
data class RealtimeResponse (val status : String, val result: Result){

    data class Result(val realtime : Realtime)

    data class Realtime(val skycon : String, val temperature: Float, @SerializedName("air_quality") val airQuality : AirQuality)

    data class AirQuality(val aqi :AQI)

    data class AQI(val chn: Float)

}