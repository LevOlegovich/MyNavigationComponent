package com.example.navigation

import androidx.lifecycle.ViewModel

class BlankFragment1ViewModel : BaseViewModel() {

    fun toNextFragment(cat: Cat) {
        var action = BlankFragment_1Directions.actionBlankFragment1ToBlankFragment2(cat)
        navigate(action, cat)
    }
}