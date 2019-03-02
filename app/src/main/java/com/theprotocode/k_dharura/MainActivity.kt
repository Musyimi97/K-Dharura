package com.theprotocode.k_dharura

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.support.v4.content.ContextCompat
import android.support.v4.content.ContextCompat.startActivity
import android.support.v4.content.FileProvider
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.support.v4.os.HandlerCompat.postDelayed






class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        Location onclick listener
        location.setOnClickListener(View.OnClickListener {
            Handler().postDelayed(Runnable {
                val gmmIntentUri = Uri.parse("geo:0,0?q= "+"Hospital")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }, 600)
        })



        policeSiren.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            // start your next activity
            startActivity(intent)
        }



        //        first aid kit image button onclick
        firstAidKit.setOnClickListener {
            val intent = Intent(this,FirstAidActivity::class.java)
            startActivity(intent)
        }


        //        Location image button onclick
        location.setOnClickListener {
            val intent = Intent(this,Location::class.java)
            startActivity(intent)
        }






    }


    //This intent opens phone keypad automatically

    fun callNumber(view: View){
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:999")
        startActivity(intent)
    }


//This code opens camera automatically, takes a picture and sends it to the email
    val REQUEST_IMAGE_CAPTURE = 1

    fun takePicture(view: View) {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)

            }
        }
    }
//       working on a code to take image and send it to a contact via email
//
//    // getExternalFilesDir() + "/Pictures" should match the declaration in fileprovider.xml paths
//    val file = File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "share_image_" + System.currentTimeMillis() + ".png")
//
//    // wrap File object into a content provider. NOTE: authority here should match authority in manifest declaration
//    val bmpUri = FileProvider.getUriForFile(MainActivity.this, "com.theprotocode.k-dharura", file)
//
//    val intent = Intent().apply {
//        this.action = Intent.ACTION_SEND
//        this.putExtra(Intent.EXTRA_STREAM, bmpUri)
//        this.type = "image/jpeg"
//    }
//    startActivity(Intent.createChooser(intent, resources.getText(R.string.se
//







}













