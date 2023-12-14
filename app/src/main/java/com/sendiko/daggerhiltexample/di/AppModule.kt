package com.sendiko.daggerhiltexample.di

import com.sendiko.daggerhiltexample.network.ExampleApi
import com.sendiko.daggerhiltexample.network.services.ExampleService
import dagger.Module
import dagger.Provides

@Module
object AppModule {

    @Provides
    fun provideExampleApi(): ExampleApi {
        // TODO: return retrofit instance
    }

    @Provides
    fun provideExampleService(api: ExampleApi): ExampleService = ExampleService(api)
}