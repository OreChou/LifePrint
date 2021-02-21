package com.orechou.lifeprint.feature.location

import android.location.Location
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

interface LocationProvider : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart()

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop()

    interface LocationChangedListener {
        fun onLocationChanged(location: Location, providerType: ProviderType)
    }

    enum class ProviderType {
        NET,
        GPS,
        FUSED
    }

}