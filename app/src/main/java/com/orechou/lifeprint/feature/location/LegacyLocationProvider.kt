package com.orechou.lifeprint.feature.location

import android.content.Context
import android.location.LocationListener
import android.location.LocationManager
import com.orechou.library.base.log.Log

// context 后面通过更加优雅的方式注入进来
class LegacyLocationProvider(private val context: Context) : LocationProvider {

    private val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

    companion object {
        private val TAG = Log.Tag(LegacyLocationProvider::class.simpleName!!)
    }

    private val networkLocationListener = LocationListener {
        Log.d(TAG, "networkLocationListener, onLocationChanged, location: $it")
    }

    private val gpsLocationListener = LocationListener {
        Log.d(TAG, "gpsLocationListener, onLocationChanged, location: $it")
    }

    override fun onStart() {

        TODO("Not yet implemented")
    }

    override fun onStop() {
        TODO("Not yet implemented")
    }

}