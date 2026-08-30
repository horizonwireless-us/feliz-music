package com.jtech.felizmusic.sync.models

import com.google.firebase.firestore.IgnoreExtraProperties
import com.google.firebase.firestore.ServerTimestamp
import java.util.Date

/**
 * Simplified user preferences entity stored in Firestore.
 * One document per user email containing all their content filter preferences.
 */
@IgnoreExtraProperties
data class UserPreferencesEntity(
    val userEmail: String = "",
    val userId: String = "",
    val contentFilters: DeviceContentFilters = DeviceContentFilters(),
    val currentDevice: DeviceMetadata = DeviceMetadata(),
    val allDevices: List<DeviceMetadata> = emptyList(),
    val isLocked: Boolean = false,
    val createdAt: Date? = null,
    val updatedAt: Date? = null
) {
    companion object {
        const val FIELD_USER_EMAIL = "userEmail"
        const val FIELD_USER_ID = "userId"
        const val FIELD_CONTENT_FILTERS = "contentFilters"
        const val FIELD_CURRENT_DEVICE = "currentDevice"
        const val FIELD_ALL_DEVICES = "allDevices"
        const val FIELD_IS_LOCKED = "isLocked"
        const val FIELD_CREATED_AT = "createdAt"
        const val FIELD_UPDATED_AT = "updatedAt"

        /**
         * Create from local ContentFilterConfig
         */
        fun fromConfig(
            config: com.jtech.felizmusic.utils.ContentFilterConfig,
            userEmail: String,
            userId: String,
            currentDeviceInfo: com.jtech.felizmusic.utils.DeviceInfo,
            existingDevices: List<DeviceMetadata> = emptyList()
        ): UserPreferencesEntity {
            val updatedDevices = existingDevices.toMutableList()

            // Update current device info or add it if not exists
            val currentDeviceMetadata = com.jtech.felizmusic.sync.models.DeviceMetadata(
                deviceName = currentDeviceInfo.deviceName ?: "Unknown Device",
                manufacturer = currentDeviceInfo.manufacturer ?: "Unknown",
                model = currentDeviceInfo.model ?: "Unknown",
                androidVersion = currentDeviceInfo.androidVersion ?: "Unknown",
                sdkVersion = currentDeviceInfo.sdkVersion ?: 0,
                appVersion = currentDeviceInfo.appVersion ?: "1.0",
                lastSeen = java.util.Date() // Update last seen on every sync
            )
            val existingDeviceIndex = updatedDevices.indexOfFirst { it.deviceName == currentDeviceMetadata.deviceName }

            if (existingDeviceIndex >= 0) {
                updatedDevices[existingDeviceIndex] = currentDeviceMetadata
            } else {
                updatedDevices.add(currentDeviceMetadata)
            }

            return UserPreferencesEntity(
                userEmail = userEmail,
                userId = userId,
                contentFilters = com.jtech.felizmusic.sync.models.DeviceContentFilters(
                enableContentFilters = config.filtersEnabled,
                acappellaOnly = config.acappellaOnly,
                blockVideos = config.blockVideos,
                blockPodcasts = config.blockPodcasts
            ),
                currentDevice = currentDeviceMetadata,
                allDevices = updatedDevices,
                isLocked = false, // Will be set explicitly when locking
                createdAt = Date(),
                updatedAt = Date()
            )
        }
    }

    /**
     * Convert to local ContentFilterConfig
     */
    fun toConfig(): com.jtech.felizmusic.utils.ContentFilterConfig {
        return com.jtech.felizmusic.utils.ContentFilterConfig(
            filtersEnabled = contentFilters.enableContentFilters,
            acappellaOnly = contentFilters.acappellaOnly,
            blockVideos = contentFilters.blockVideos,
            // Unset podcast field couples to blockVideos (see DeviceContentFilters.toConfig).
            blockPodcasts = contentFilters.blockPodcasts ?: contentFilters.blockVideos,
            isSynced = true
        )
    }
}