package com.example.dagger2mvvm.di

import com.example.dagger2mvvm.MainActivity
import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}