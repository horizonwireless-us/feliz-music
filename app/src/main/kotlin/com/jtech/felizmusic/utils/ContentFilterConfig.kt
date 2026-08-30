package com.jtech.felizmusic.utils

/**
 * In-memory representation of content filter settings pulled from DataStore.
 * Includes fields for sync functionality and device-specific preferences.
 *
 * Canonical Acappella contract: [acappellaOnly] restricts music to artists
 * whose owning-artist isAcappella flag is true. false/absent means
 * unrestricted. Podcasts are never affected by [acappellaOnly]; they keep the
 * existing podcast-specific block only.
 */
data class ContentFilterConfig(
    val filtersEnabled: Boolean = true,
    val acappellaOnly: Boolean = false,
    val blockVideos: Boolean = false,
    val blockPodcasts: Boolean = false,
    val lastSyncTime: Long = -1L,
    val isSynced: Boolean = false
)

object ContentFilterState {
    private val _state = kotlinx.coroutines.flow.MutableStateFlow(ContentFilterConfig())
    val state: kotlinx.coroutines.flow.StateFlow<ContentFilterConfig> = _state

    var current: ContentFilterConfig
        get() = _state.value
        internal set(value) {
            _state.value = value
        }

    /**
     * Update content filter configuration
     */
    fun updateConfig(
        filtersEnabled: Boolean? = null,
        acappellaOnly: Boolean? = null,
        blockVideos: Boolean? = null,
        blockPodcasts: Boolean? = null,
        lastSyncTime: Long? = null,
        isSynced: Boolean? = null
    ) {
        val currentConfig = current
        current = currentConfig.copy(
            filtersEnabled = filtersEnabled ?: currentConfig.filtersEnabled,
            acappellaOnly = acappellaOnly ?: currentConfig.acappellaOnly,
            blockVideos = blockVideos ?: currentConfig.blockVideos,
            blockPodcasts = blockPodcasts ?: currentConfig.blockPodcasts,
            lastSyncTime = lastSyncTime ?: currentConfig.lastSyncTime,
            isSynced = isSynced ?: currentConfig.isSynced
        )
    }

    /**
     * Update only content filter settings (preserving sync metadata)
     */
    fun updateContentFilters(
        filtersEnabled: Boolean? = null,
        acappellaOnly: Boolean? = null,
        blockVideos: Boolean? = null,
        blockPodcasts: Boolean? = null
    ) {
        updateConfig(
            filtersEnabled = filtersEnabled,
            acappellaOnly = acappellaOnly,
            blockVideos = blockVideos,
            blockPodcasts = blockPodcasts
        )
    }

    /**
     * Update sync-related metadata
     */
    fun updateSyncMetadata(
        lastSyncTime: Long,
        isSynced: Boolean
    ) {
        updateConfig(
            lastSyncTime = lastSyncTime,
            isSynced = isSynced
        )
    }

    /**
     * Mark configuration as modified (not synced)
     */
    fun markAsModified() {
        updateConfig(isSynced = false)
    }

    /**
     * Reset to default configuration
     */
    fun resetToDefaults() {
        current = ContentFilterConfig()
    }

    /**
     * Check if configuration has been modified since last sync
     */
    val hasUnsyncedChanges: Boolean
        get() = !current.isSynced

    /**
     * Check if any content filters are active
     */
    val hasActiveFilters: Boolean
        get() = current.filtersEnabled && (
            current.acappellaOnly ||
            current.blockVideos ||
            current.blockPodcasts
        )
}
