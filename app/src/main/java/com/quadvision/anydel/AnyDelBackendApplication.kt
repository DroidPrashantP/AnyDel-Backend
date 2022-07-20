package com.quadvision.anydel

import android.app.Application

class AnyDelBackendApplication : Application() {
    companion object {
        var mApplication: Application? = null
    }

    override fun onCreate() {
        super.onCreate()
        mApplication = this
    }
}