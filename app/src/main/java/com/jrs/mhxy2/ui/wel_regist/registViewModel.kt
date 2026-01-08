package com.jrs.mhxy2.ui.wel_regist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class registViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Regist Fragment"
    }
    val text: LiveData<String> = _text
}