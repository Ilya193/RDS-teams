package com.xlwe.rdsteams.app

import android.app.Application
import com.xlwe.rdsteams.di.AppComponent
import com.xlwe.rdsteams.di.DaggerAppComponent

class MainApp: Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

}