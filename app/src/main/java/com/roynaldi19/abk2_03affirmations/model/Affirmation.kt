package com.roynaldi19.abk2_03affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringId: Int,
    @DrawableRes val imageResourceId: Int
)