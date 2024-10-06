package com.gladson.weatherapp.data.model

data class City(
    val id: Int,
    val name: String,
    val coord: Coordinates,
    val country: String,
    val population: Int,
    val timezone: Long,
    val sunrise: Long,
    val sunset: Long
)
