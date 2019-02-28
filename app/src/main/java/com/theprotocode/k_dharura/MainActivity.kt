package com.theprotocode.k_dharura

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        details.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}


//    Am now going to get reference to all my image views in my homepage
// and set onClickListener and intents to listen to onClicks


//    fun breakdownPageActivity(view: View){
//        val intent=Intent(this,breakdownPageActivity::class.java)
//        startActivity(intent)
//    }
//
////This intent opens phone keypad automatically
//
//    fun EmergencyNumber(view: View){
//        val intent = Intent(Intent.ACTION_DIAL)
//        intent.data = Uri.parse("tel:999")
//        startActivity(intent)
//    }


////This code opens camera automatically and sends it to email automatically.
//    val REQUEST_IMAGE_CAPTURE = 1
//
//    fun dispatchTakePictureIntent(view: View) {
//
//
//
//
//        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
//            takePictureIntent.resolveActivity(packageManager)?.also {
//                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
//
//            }
//        }
//    }









