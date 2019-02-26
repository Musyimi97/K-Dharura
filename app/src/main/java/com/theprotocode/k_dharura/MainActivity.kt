package com.theprotocode.k_dharura

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    Am now going to get reference to all my image views in my homepage
// and set onClickListener and intents to listen to onClicks


    fun breakdownPageActivity(view: View){
        val intent=Intent(this,breakdownPageActivity::class.java)
        startActivity(intent)
    }



    fun EmergencyNumber(view: View){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:999")
        startActivity(intent)
    }






}





