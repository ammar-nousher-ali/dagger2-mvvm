package com.example.dagger2mvvm.di

import com.example.dagger2mvvm.retrofit.FakerApi
import com.example.dagger2mvvm.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.migration.DisableInstallInCheck
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@DisableInstallInCheck
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @Singleton
    @Provides
    fun providesFakerApi(retrofit: Retrofit):FakerApi{
        return retrofit.create(FakerApi::class.java)
    }
}