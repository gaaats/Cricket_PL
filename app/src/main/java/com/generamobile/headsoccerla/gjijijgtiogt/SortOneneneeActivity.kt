package com.generamobile.headsoccerla.gjijijgtiogt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsoccerla.R
import com.generamobile.headsoccerla.apapapa.TomatoClass
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.hyhj2uuj
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.jukikiik
import com.generamobile.headsoccerla.rfnkgnktgjntgn.GaaamamauaauauauauActivity2
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SortOneneneeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort_onenenee)
        checkCountrygtgttg()
    }

    private fun getShDatafrrfr(): String? {
        val restCheck: String? = Hawk.get(jukikiik)
        return restCheck
    }

    private fun hyhydsds() {
        val juii = Intent(this@SortOneneneeActivity, GaaamamauaauauauauActivity2::class.java)
        Hawk.put(TomatoClass.jujikiikik, null)
        Hawk.put(TomatoClass.hujujjuuj, null)
        Hawk.put(TomatoClass.jukikiik, null)
        startActivity(juii)
        finish()
    }

    private fun kikioopp() {
        val juihffd = Intent(this@SortOneneneeActivity, SooortTviiiiActivity::class.java)
        startActivity(juihffd)
        finish()
    }

    private fun checkCountrygtgttg() {

        val jgtfrfrrf = getShDatafrrfr()

        if (jgtfrfrrf == "0") {
            hyhydsds()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                juiiik()
            }

            kikioopp()
        }
    }

    private fun juiiik(){
        val frfrrf = AdvertisingIdClient(applicationContext)
        frfrrf.start()
        val hy2hy62 = frfrrf.info.id
        Hawk.put(hyhj2uuj, hy2hy62)
    }


}