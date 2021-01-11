package com.cx.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.cx.sunnyweather.logic.WeatherRepository
import com.cx.sunnyweather.logic.model.PlaceResponse

/**
 * Created by cx on 2020/8/18
 * Describe:
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<PlaceResponse.Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) {
        query -> WeatherRepository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(place: PlaceResponse.Place) = WeatherRepository.savePlace(place)

    fun getSavedPlace() = WeatherRepository.getSavePlace()

    fun isPlaceSaved() = WeatherRepository.isPlaceSaved()

}