package com.example.teknooo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Modul 4\n" +
                "Pemrograman Mobile (Teknologi)"
    }
    val text: LiveData<String> = _text
}