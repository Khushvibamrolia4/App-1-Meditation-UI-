package com.khushvi.demo1

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val Colour: Color
)
