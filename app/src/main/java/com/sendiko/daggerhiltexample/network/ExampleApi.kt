package com.sendiko.daggerhiltexample.network

import com.sendiko.daggerhiltexample.network.response.ExampleResponse

interface ExampleApi {
    suspend fun getData(params: String): List<ExampleResponse>
}