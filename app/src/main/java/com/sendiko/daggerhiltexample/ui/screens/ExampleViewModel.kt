package com.sendiko.daggerhiltexample.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sendiko.daggerhiltexample.network.services.ExampleService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(
    private val exampleService: ExampleService
): ViewModel() {

    fun getUsersData() {
        viewModelScope.launch {
            exampleService.getDatas("this")
        }
    }
}