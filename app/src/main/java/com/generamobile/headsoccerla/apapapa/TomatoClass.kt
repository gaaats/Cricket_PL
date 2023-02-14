package com.generamobile.headsoccerla.apapapa

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class TomatoClass:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(hyhyhhyjuuj)
        Hawk.init(this).build()
    }

    companion object {
        const val hyhyhhyjuuj = "7c0cb9e6-ad12-4387-9ab9-831e26361e95"
        var jukikiik = "appsChecker"
        var hujujjuuj: String? = "countryCode"
        var jujikiikik = "geo"
        var jmjkmk3: String? = "c11"
        var ju3kik3 = "link"
        var hyhj2uuj: String? = "mainid"
        var d3d3d6: String? = "d11"
    }
}