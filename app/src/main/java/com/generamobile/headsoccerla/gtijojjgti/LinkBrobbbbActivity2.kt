package com.generamobile.headsoccerla.gtijojjgti

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoccerla.R
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.jmjkmk3
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.d3d3d6
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.hyhj2uuj
import com.generamobile.headsoccerla.apapapa.TomatoClass.Companion.ju3kik3
import com.generamobile.headsoccerla.databinding.ActivityLinkBrobbbb2Binding
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class LinkBrobbbbActivity2 : AppCompatActivity() {


    private var yhygttt6 = false
    override fun onBackPressed() {


        if (gthyhujuu.canGoBack()) {
            if (yhygttt6) {
                gthyhujuu.stopLoading()
                gthyhujuu.loadUrl(urlfififif)
            }
            this.yhygttt6 = true
            gthyhujuu.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                yhygttt6 = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun jujuikikik(uri: String): Boolean {

        val hyhujjuujuj = packageManager
        try {

            hyhujjuujuj.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun juujghgtfrrf() {
        val hyhujujuj3 = gthyhujuu.settings
        hyhujujuj3.javaScriptEnabled = true

        hyhujujuj3.useWideViewPort = true

        hyhujujuj3.loadWithOverviewMode = true
        hyhujujuj3.allowFileAccess = true
        hyhujujuj3.domStorageEnabled = true
        hyhujujuj3.userAgentString = hyhujujuj3.userAgentString.replace("; wv", "")

        hyhujujuj3.javaScriptCanOpenWindowsAutomatically = true
        hyhujujuj3.setSupportMultipleWindows(false)

        hyhujujuj3.displayZoomControls = false
        hyhujujuj3.builtInZoomControls = true
        hyhujujuj3.setSupportZoom(true)

        hyhujujuj3.pluginState = WebSettings.PluginState.ON
        hyhujujuj3.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hyhujujuj3.cacheMode = WebSettings.LOAD_DEFAULT

        hyhujujuj3.allowContentAccess = true
    }

    private val gtgtgt = 1

    var bnhhujujuj: ValueCallback<Array<Uri>>? = null
    lateinit var gthyhujuu: WebView
    lateinit var frrgtttg: ActivityLinkBrobbbb2Binding
    var ikioiol: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frrgtttg = ActivityLinkBrobbbb2Binding.inflate(layoutInflater)
        setContentView(frrgtttg.root)

        gthyhujuu = frrgtttg.bggthyhyhy
        Snackbar.make(
            frrgtttg.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val gtgtrrr = CookieManager.getInstance()
        gtgtrrr.setAcceptCookie(true)
        gtgtrrr.setAcceptThirdPartyCookies(gthyhujuu, true)
        juujghgtfrrf()
        val hyjuujuj: Activity = this
        gthyhujuu.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (jujuikikik(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                gtgt2hy2hy2(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(hyjuujuj, description, Toast.LENGTH_SHORT).show()
            }


        }
        gthyhujuu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                bnhhujujuj?.onReceiveValue(null)
                bnhhujujuj = filePathCallback
                var frgthyju: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (frgthyju!!.resolveActivity(packageManager) != null) {

                    var drfrgtt: File? = null
                    try {
                        drfrgtt = jukiloo()
                        frgthyju.putExtra("PhotoPath", ikioiol)
                    } catch (ex: IOException) {
                    }

                    if (drfrgtt != null) {
                        ikioiol = "file:" + drfrgtt.absolutePath
                        frgthyju.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(drfrgtt)
                        )
                    } else {
                        frgthyju = null
                    }
                }
                val cfdfdde = Intent(Intent.ACTION_GET_CONTENT)
                cfdfdde.addCategory(Intent.CATEGORY_OPENABLE)
                cfdfdde.type = "image/*"
                val hyujujgff: Array<Intent?> =
                    frgthyju?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gtgthyhhy = Intent(Intent.ACTION_CHOOSER)
                gtgthyhhy.putExtra(Intent.EXTRA_INTENT, cfdfdde)
                gtgthyhhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgtgttt))
                gtgthyhhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, hyujujgff)
                startActivityForResult(
                    gtgthyhhy, gtgtgt
                )
                return true
            }

            @Throws(IOException::class)
            private fun jukiloo(): File {
                var frgtgy = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frgtgy.exists()) {
                    frgtgy.mkdirs()
                }

                frgtgy =
                    File(frgtgy.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frgtgy
            }

        }

        gthyhujuu.loadUrl(ftgtt())
    }


    private fun hjuujuj(gthyyhju: String) {
        OneSignal.setExternalUserId(
            gthyyhju,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtthynnmmnn = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtthynnmmnn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val nbbnbm =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nbbnbm"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val mjmjjhhgf = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $mjmjjhhgf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    private fun ftgtt(): String {

        val hyhyhyhyijyhjihy = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val hyjuuu = "com.generamobile.headsoccerla"

        val gtjigtjigtji:String? = Hawk.get(jmjkmk3, "null")
        val thyy: String? = Hawk.get(hyhj2uuj, "null")
        val bgnhnhnjnj: String? = Hawk.get(d3d3d6, "null")


        val kiki36 = "deviceID="
        val hy25hy1yh = "sub_id_1="
        val y2hy8y = "ad_id="
        val sub4ftgtgt = "sub_id_4="
        val bbhnh226 = "sub_id_5="
        val hy2hy62yh = "sub_id_6="

        val hyhy2hy62 = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val bgbggb = "naming"
        val thy2yh26hy = "deeporg"


        val gthyy = Build.VERSION.RELEASE

        val hy25hy5yh = Hawk.get(ju3kik3, "null")

        var aftgtgtt = ""
        if (gtjigtjigtji != "null"){
            aftgtgtt = "$hy25hy5yh$hy25hy1yh$gtjigtjigtji&$kiki36$hyhy2hy62&$y2hy8y$thyy&$sub4ftgtgt$hyjuuu&$bbhnh226$gthyy&$hy2hy62yh$bgbggb"
            hjuujuj(hyhy2hy62.toString())
        } else {
            aftgtgtt = "$hy25hy5yh$hy25hy1yh$bgnhnhnjnj&$kiki36$hyhy2hy62&$y2hy8y$thyy&$sub4ftgtgt$hyjuuu&$bbhnh226$gthyy&$hy2hy62yh$thy2yh26hy"
            hjuujuj(hyhy2hy62.toString())
        }
        Log.d("lolo", "res is $aftgtgtt")
        Toast.makeText(this, "${aftgtgtt}", Toast.LENGTH_SHORT).show()

        return hyhyhyhyijyhjihy.getString("SAVED_URL", aftgtgtt).toString()
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gtgtgt || bnhhujujuj == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var rerererer: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                rerererer = arrayOf(Uri.parse(ikioiol))
            } else {
                val gtgtggttg = data.dataString
                if (gtgtggttg != null) {
                    rerererer = arrayOf(Uri.parse(gtgtggttg))
                }
            }
        }
        bnhhujujuj?.onReceiveValue(rerererer)
        bnhhujujuj = null
    }




    var urlfififif = ""
    fun gtgt2hy2hy2(hy2hy5yh5hy: String?) {
        if (!hy2hy5yh5hy!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    hy2hy5yh5hy
                ).toString()

                val gtgyhyj = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val hjoihyjiohyjoihy = gtgyhyj.edit()
                hjoihyjiohyjoihy.putString("SAVED_URL", hy2hy5yh5hy)
                hjoihyjiohyjoihy.apply()
            }
        }
    }

}