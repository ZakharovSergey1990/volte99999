package ru.protei.volte99999

import android.os.PersistableBundle
import android.service.carrier.CarrierIdentifier
import android.service.carrier.CarrierService
import android.telephony.CarrierConfigManager
import android.util.Log

class CarrierConfigService : CarrierService() {
    init {
        Log.d(TAG, "Service created")
    }

    override fun onLoadConfig(id: CarrierIdentifier): PersistableBundle {
        Log.d(TAG, "Config being fetched")
        val config = PersistableBundle()
        Log.d(TAG, "config = $config" )
        config.putBoolean(
            CarrierConfigManager.KEY_CARRIER_VOLTE_AVAILABLE_BOOL, true
        )
        config.putBoolean(
            CarrierConfigManager.KEY_CARRIER_VOLTE_TTY_SUPPORTED_BOOL, false
        )
        config.putInt(CarrierConfigManager.KEY_VOLTE_REPLACEMENT_RAT_INT, 6)
        // Check CarrierIdentifier and add more config if needed…

        Log.d(TAG, "finish config = $config" )

        return config
    }

    companion object {
        private const val TAG = "CarrierConfigService"
    }
}