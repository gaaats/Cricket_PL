package com.generamobile.headsoccerla.gjijijgtiogt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoccerla.apapapa.TomatoClass
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.jmjkmk3
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.d3d3d6
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.jukikiik
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.hujujjuuj
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.jujikiikik
import com.generamobile.headsoccerla.databinding.ActivitySooortTviiiiBinding
import com.generamobile.headsoccerla.gtijojjgti.LinkBrobbbbActivity2
import com.generamobile.headsoccerla.rfnkgnktgjntgn.GaaamamauaauauauauActivity2
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class SooortTviiiiActivity : AppCompatActivity() {

    private fun gtgthy() {

        val ftgtt: String = Hawk.get(jujikiikik)
        val gtghylp: String = Hawk.get(hujujjuuj, "null")

        val b2hy26hy26: String? = Hawk.get(d3d3d6, "null")
        val gt6hy56hy5hy5: String? = Hawk.get(jukikiik, "null")
        var jolo5o5o: String? = Hawk.get(jmjkmk3)

        Log.d("lolo", "${ftgtt}")
        Log.d("lolo", "${gtghylp}")
        Log.d("lolo", "${gt6hy56hy5hy5}")

        if (gt6hy56hy5hy5 == "1") {
            val gtjitgjgtji = Executors.newSingleThreadScheduledExecutor()
            gtjitgjgtji.scheduleAtFixedRate({
                if (jolo5o5o != null) {

                    if (jolo5o5o!!.contains("tdb2") || ftgtt.contains(gtghylp) || b2hy26hy26!!.contains(
                            "tdb2"
                        )
                    ) {
                        gtjitgjgtji.shutdown()

                        kgtkk()
                    } else {
                        gtjitgjgtji.shutdown()

                        bbhhyhyjuuj()
                    }
                } else {
                    jolo5o5o = Hawk.get(jmjkmk3)
                }
            }, 0, 1, TimeUnit.SECONDS)
        } else if (ftgtt.contains(gtghylp)) {

            kgtkk()
        } else {
            bbhhyhyjuuj()
        }
    }

    private fun bbhhyhyjuuj() {
        val kioooo = Intent(this@SooortTviiiiActivity, GaaamamauaauauauauActivity2::class.java)
        Hawk.put(jujikiikik, null)
        Hawk.put(hujujjuuj, null)
        Hawk.put(TomatoClass.jukikiik, null)
        startActivity(kioooo)
        finish()
    }

    lateinit var bghhyhyhy: ActivitySooortTviiiiBinding

    private val gtgtkogtkpo = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val hyhy55yh = data?.get("campaign").toString()
            Hawk.put(jmjkmk3, hyhy55yh)
        }

        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        bghhyhyhy = ActivitySooortTviiiiBinding.inflate(layoutInflater)
        setContentView(bghhyhyhy.root)

        val hy25u5u5: String? = Hawk.get(jukikiik, "null")

        if (hy25u5u5 == "1") {
            AppsFlyerLib.getInstance()
                .init("EMNjEFmPwgYSRyarFcMNKg", gtgtkogtkpo, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtgthy()

    }


    private fun kgtkk() {
        val gtjtgjigtij = Intent(this@SooortTviiiiActivity, LinkBrobbbbActivity2::class.java)
        Hawk.put(jujikiikik, null)
        Hawk.put(hujujjuuj, null)
        Hawk.put(TomatoClass.jukikiik, null)
        startActivity(gtjtgjigtij)
        finish()
    }



}
