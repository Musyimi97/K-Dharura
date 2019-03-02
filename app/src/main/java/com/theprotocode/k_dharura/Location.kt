package com.theprotocode.k_dharura

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_location.*
import kotlinx.android.synthetic.main.activity_main.*

class Location : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)



        //        Hospital onclick listener
        hospital.setOnClickListener(View.OnClickListener {
            Handler().postDelayed(Runnable {
                val gmmIntentUri = Uri.parse("geo:0,0?q= "+"Hospital")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }, 600)
        })



        //        Police station map onclick listener
        clinics.setOnClickListener(View.OnClickListener {
            Handler().postDelayed(Runnable {
                val gmmIntentUri = Uri.parse("geo:0,0?q= "+"Police Station")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }, 600)
        })


        //        Location onclick listener
        car_garage.setOnClickListener(View.OnClickListener {
            Handler().postDelayed(Runnable {
                val gmmIntentUri = Uri.parse("geo:0,0?q= "+"Car Garage")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }, 600)
        })



    }
}
