package com.roynaldi19.gd1_02affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringId: Int,
    @DrawableRes val imageResourceId: Int
)