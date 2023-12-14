package com.sendiko.daggerhiltexample.network.services

import com.sendiko.daggerhiltexample.network.ExampleApi
import com.sendiko.daggerhiltexample.network.response.ExampleResponse
import javax.inject.Inject

class ExampleService @Inject constructor(
    private val api: ExampleApi
) {
    suspend fun getDatas(params: String): List<ExampleResponse> {
        return api.getData(params)
    }
}