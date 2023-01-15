package dev.androidblog.peoples

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PeoplesApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }

}