package com.gladson.weatherapp.data.model

data class WeatherData(
    val dt: Int?,
    val main: Main,
    val weather: List<Weather>,
    val clouds: Clouds,
    val wind: Wind,
    val visibility: Int,
    val pop: Int
)
