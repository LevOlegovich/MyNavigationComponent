package com.example.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cat(
    var name: String = "",
    var age: Int = 0
) : Parcelable

