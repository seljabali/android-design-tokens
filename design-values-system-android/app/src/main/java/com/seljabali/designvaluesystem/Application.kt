package com.seljabali.designvaluesystem

import android.app.Application
import android.content.Context
import java.lang.ref.WeakReference

class Application: Application() {

    companion object {
        lateinit var instance: WeakReference<Context>
    }

    override fun onCreate() {
        super.onCreate()
        instance = WeakReference(applicationContext)
        setupLibraries()
    }

    private fun setupLibraries() {
    }
}