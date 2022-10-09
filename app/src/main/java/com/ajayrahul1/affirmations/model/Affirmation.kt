package com.ajayrahul1.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceID : Int,
    @DrawableRes val imageResourceID : Int)