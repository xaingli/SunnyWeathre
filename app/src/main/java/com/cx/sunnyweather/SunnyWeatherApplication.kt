package com.cx.sunnyweather

import android.app.Application
import android.content.Context

/**
 * Created by cx on 2020/8/18
 * Describe:
 */
class SunnyWeatherApplication: Application() {

    companion object{
        lateinit var context: Context
        const val TOKEN = "IHPtLI4FSbdhDOFZ"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}