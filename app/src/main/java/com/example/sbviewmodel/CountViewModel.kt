package com.example.sbviewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {

    private val _count = MutableLiveData<Int>() //Mutable means can change, a reference variable

    //Create getter and setter
    val count : LiveData<Int>
        get() = _count //getter of _count

    fun increment(){
        _count.value = _count.value?.plus(1)
    }

    fun decrement(){
        _count.value = _count.value?.minus(1)
    }

    init{
        Log.d("MainActivity", "ViewModel initialised")
        _count.value = 0
    }

    override fun onCleared(){
        Log.d("MainActivity", "ViewModel cleared")
        super.onCleared()
    }
}