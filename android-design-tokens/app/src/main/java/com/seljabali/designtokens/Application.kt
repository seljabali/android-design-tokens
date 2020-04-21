package com.seljabali.designtokens

import android.app.Application

class Application: Application() {

    override fun onCreate() {
        super.onCreate()
        setupLibraries()
    }

    private fun setupLibraries() {
    }
}