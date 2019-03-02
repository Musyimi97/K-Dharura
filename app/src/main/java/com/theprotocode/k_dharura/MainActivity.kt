package com.theprotocode.k_dharura

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.*
import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v4.app.ActivityCompat.startActivityForResult
import android.support.v4.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)








        class pol(view: View){
            fun call(view: View) {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:999")
                startActivity(intent)
            }

        }


//This opens the first aid tips page.
        firstAidTips.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            // start your next activity
            startActivity(intent)

        }


////This intent opens phone keypad automatically

        police.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+254703248870")
            startActivity(intent)
         }


//Opens the phone when ambulance is clicked.
        ambulance.setOnClickListener {
            val laban = Intent(Intent.ACTION_DIAL)
            laban.data = Uri.parse("tel:+254703248870")
            startActivity(laban)
        }

        //Opens phone when fire is clicked.

        fire.setOnClickListener {
            val laban = Intent(Intent.ACTION_DIAL)
            laban.data = Uri.parse("tel:+254703248870")
            startActivity(laban)
        }




        fun callNumber(view: View){
            val intent =Intent(Intent.ACTION_SCREEN_OFF)
            startActivity(intent)
        }

        fun call(view: View) {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:999")
            startActivity(intent)
        }


        ////This code opens camera automatically and sends it to email automatically.
        val REQUEST_IMAGE_CAPTURE = 1
        fun dispatchTakePictureIntent(view: View) {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
                takePictureIntent.resolveActivity(packageManager)?.also {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)

                }
            }
        }


    }
}

//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)


//    Am now going to get reference to all my image views in my homepage
// and set onClickListener and intents to listen to onClicks


//    fun breakdownPageActivity(view: View){
//        val intent=Intent(this,breakdownPageActivity::class.java)
//        startActivity(intent)
//    }
//


////This intent opens phone keypad automatically

//    fun EmergencyNumber(view: View){
//        val intent = Intent(Intent.ACTION_DIAL)
//        intent.data = Uri.parse("tel:999")
//        startActivity(Context)
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
//
//







