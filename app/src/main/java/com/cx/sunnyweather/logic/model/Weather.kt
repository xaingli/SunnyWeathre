package com.cx.sunnyweather.logic.model

/**
 * Created by cx on 2020/8/19
 * Describe:
 */
data class Weather(val realtime: RealtimeResponse.Realtime,val daily: DailyResponse.Daily)