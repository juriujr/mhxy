package com.jrs.mhxy2.ui.wel_login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class loginViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Regist Fragment"
    }
    val text: LiveData<String> = _text
}