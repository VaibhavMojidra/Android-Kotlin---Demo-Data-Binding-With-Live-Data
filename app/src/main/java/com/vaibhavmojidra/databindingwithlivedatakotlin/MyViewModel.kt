package com.vaibhavmojidra.databindingwithlivedatakotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    var count=MutableLiveData<Int>(0)
    fun updateValue(){
        count.value=count.value?.plus(1)
    }
}