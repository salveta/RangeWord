package com.salvaperez.myapplication

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun checkTextWithRegex(enterText: String): Boolean{
        return Regex(PATTERN).containsMatchIn(enterText.first().toString())
    }

    companion object{
        const val PATTERN = "[A-Z]"
    }
}