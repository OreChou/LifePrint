package com.orechou.lifeprint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orechou.library.base.log.Log
import com.orechou.lifeprint.feature.location.LocationForegroundService

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = Log.Tag(MainActivity::class.simpleName!!)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        val intent = Intent(this, LocationForegroundService::class.java)
        startService(intent)
    }
}