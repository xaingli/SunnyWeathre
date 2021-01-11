package com.cx.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.cx.sunnyweather.logic.WeatherRepository
import com.cx.sunnyweather.logic.model.PlaceResponse

/**
 * Created by cx on 2020/8/19
 * Describe:
 */
class WeatherViewModel : ViewModel(){

    private val locationLiveData = MutableLiveData<PlaceResponse.Location>()

    var locationLng = ""
    var locationLat = ""

    var placeName = ""

    // switchMap 方法会观察locationLiveData 这个对象，并在switchMap() 方法的转换函数中调用仓库层中定义的refreshWeather() 方法
    // 这样，仓库层返回的liveData对象，就可以转换成一个可供Activity观察的LiveData 对象
    val weatherLiveData = Transformations.switchMap(locationLiveData) {
        location -> WeatherRepository.refreshWeather(location.lng,location.lat)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = PlaceResponse.Location(lng, lat)
    }
}