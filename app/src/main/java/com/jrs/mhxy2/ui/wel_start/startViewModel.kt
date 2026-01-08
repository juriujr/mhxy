package com.jrs.mhxy2.ui.wel_start

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class startViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is first Fragment"
    }
    val text: LiveData<String> = _text
}