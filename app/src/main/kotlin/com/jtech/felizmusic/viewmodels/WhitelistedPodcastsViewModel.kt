package com.jtech.felizmusic.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jtech.felizmusic.db.MusicDatabase
import com.jtech.felizmusic.db.entities.PodcastWhitelistEntity
import com.jtech.felizmusic.search.ZemerSearchRepository
import com.jtech.felizmusic.utils.NewEpisodesFeed
import com.jtech.felizmusic.utils.ContentFilterState
import com.jtech.felizmusic.utils.PodcastLibrarySources
import com.jtech.felizmusic.utils.SyncUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WhitelistedPodcastsViewModel
@Inject
constructor(
    @ApplicationContext private val context: Context,
    private val database: MusicDatabase,
    private val syncUtils: SyncUtils,
    private val zemerRepository: ZemerSearchRepository,
) : ViewModel() {
    val searchQuery = MutableStateFlow("")

    // Expose sync progress from SyncUtils
    val syncProgress = syncUtils.podcastWhitelistSyncProgress
    val isSyncing = syncUtils.isPodcastWhitelistSyncing

    // Subscribed podcasts (whitelist-filtered) - shared source so the filter can't drift between VMs.
    val subscribedPodcasts = PodcastLibrarySources.whitelistedSubscribedPodcasts(database)
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    // New Episodes feed (shared holder so this VM and LibraryPodcastsViewModel can't drift).
    private val newEpisodesFeed = NewEpisodesFeed(zemerRepository, context, database)
    val newEpisodes = newEpisodesFeed.episodes
    val isLoadingNewEpisodes = newEpisodesFeed.isLoading

    val allPodcasts =
        combine(
            database.allWhitelistedPodcastsByName(),
            searchQuery,
            ContentFilterState.state,
        ) { podcasts: List<PodcastWhitelistEntity>, query, filters ->
            podcasts
                // Podcasts ignore onlyAcappella; isFemale was removed. The only gate is the existing
                // podcast-specific block, applied by the caller.
                .filter { query.isBlank() || it.name.contains(query, ignoreCase = true) }
        }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    init {
        // Fetch new episodes when screen is opened
        fetchNewEpisodes()
        // Sync subscribed podcasts from YouTube Music
        syncSubscribedPodcasts()
    }

    fun fetchNewEpisodes() = newEpisodesFeed.fetch(viewModelScope)

    fun syncSubscribedPodcasts() {
        viewModelScope.launch(Dispatchers.IO) {
            syncUtils.syncPodcastSubscriptions()
        }
    }

    fun sync() {
        viewModelScope.launch(Dispatchers.IO) {
            syncUtils.syncPodcastWhitelist(forceSync = true)
        }
    }

    // requestPodcastThumbnail is gone: the server `/podcasts` browse list carries a ready-to-load
    // thumbnail on every row, synced straight into the whitelist table, so there is no per-row art
    // fetch to make anymore.
}
