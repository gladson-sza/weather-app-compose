package com.gladson.weatherapp.data.model

import androidx.annotation.DrawableRes

data class AirQualityItem(
    @DrawableRes val icon: Int,
    val title: String,
    val value: String
)
