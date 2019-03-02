package com.theprotocode.k_dharura

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {



//This activity will contain procedures for first aid incase of an emergency
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}


//package com.theprotocode.k_dharura
//
//import android.content.Intent
//import android.graphics.Bitmap
//import android.net.Uri
//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
//import android.provider.MediaStore
//import android.view.View
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
////    Am now going to get reference to all my image views in my homepage
//// and set onClickListener and intents to listen to onClicks
//
//
//////This intent opens phone keypad automatically
//
//    fun EmergencyNumber(view: View){
//        val intent = Intent(Intent.ACTION_DIAL)
//        intent.data = Uri.parse("tel:999")
//        startActivity(intent)
//    }
//
//
//    ////This code opens camera automatically and sends it to email automatically.
//    val REQUEST_IMAGE_CAPTURE = 1
//    fun dispatchTakePictureIntent(view: View) {
//        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
//            takePictureIntent.resolveActivity(packageManager)?.also {
//                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
//
//            }
//        }
//    }
//
//
//
//}




//// when button is clicked, show the alert
//editHealthId.setOnClickListener {
//    // build alert dialog
//    val dialogBuilder = AlertDialog.Builder(this)
//
//    // set message of alert dialog
//    dialogBuilder.setMessage("Do you want to close this application ?")
//        // if the dialog is cancelable
//        .setCancelable(false)
//        // positive button text and action
//        .setPositiveButton("Proceed", DialogInterface.OnClickListener {
//                dialog, id -> finish()
//        })
//        // negative button text and action
//        .setNegativeButton("Cancel", DialogInterface.OnClickListener {
//                dialog, id -> dialog.cancel()
//        })
//
//    // create dialog box
//    val alert = dialogBuilder.create()
//    // set title for alert dialog box
//    alert.setTitle("AlertDialogExample")
//    // show alert dialog
//    alert.show()
//}


//
//editHealthId.setOnClickListener {
//    val intent = Intent(this, ScrollingActivity::class.java)
//    // start your next activity
//    startActivity(intent)
//
//}
