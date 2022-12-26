package com.example.dagger2mvvm

import android.app.Application
import com.example.dagger2mvvm.di.ApplicationComponent
import com.example.dagger2mvvm.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()

    }
}