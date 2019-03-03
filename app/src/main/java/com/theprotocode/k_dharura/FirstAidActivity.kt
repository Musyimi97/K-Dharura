package com.theprotocode.k_dharura

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_first_aid.*

class FirstAidActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        webview.loadUrl("http://www.sja.org.uk/sja/first-aid-advice/first-aid-techniques.aspx")
        webview.webViewClient=WebViewClient()
        webview.settings.javaScriptEnabled=true






    }




}
