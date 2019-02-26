package com.theprotocode.k_dharura

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class breakdownPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sos_page)

    }
    fun tow1Button(view: View){
        val openURL=Intent(android.content.Intent.ACTION_VIEW)
        openURL.data = Uri.parse("http://cmskenya.co.ke/services/recovery-roadside-assistance/")
        startActivity(openURL)
    }



}
