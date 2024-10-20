package com.gladson.weatherapp.data.model

data class OpenWeatherResponse (
    val cod: String?,
    val cnt: Int?,
    val list: List<WeatherData>?,
    val city: City?
)