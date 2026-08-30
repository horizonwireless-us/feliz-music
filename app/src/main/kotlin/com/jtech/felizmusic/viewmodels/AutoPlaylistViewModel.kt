package com.jtech.felizmusic.viewmodels

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jtech.felizmusic.constants.HideExplicitKey
import com.jtech.felizmusic.constants.VideoDownloadsInMusicKey
import com.jtech.felizmusic.constants.SongSortDescendingKey
import com.jtech.felizmusic.constants.SongSortType
import com.jtech.felizmusic.constants.SongSortTypeKey
import com.jtech.felizmusic.db.MusicDatabase
import com.jtech.felizmusic.extensions.filterExplicit
import com.jtech.felizmusic.extensions.toEnum
import com.jtech.felizmusic.utils.SyncUtils
import com.jtech.felizmusic.utils.dataStore
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class AutoPlaylistViewModel
@Inject
constructor(
    @ApplicationContext context: Context,
    private val database: MusicDatabase,
    savedStateHandle: SavedStateHandle,
    private val syncUtils: SyncUtils,
) : ViewModel() {
    val playlist = requireNotNull(savedStateHandle.get<String>("playlist")) {
        "playlist is required but was not provided in navigation arguments"
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    val likedSongs =
        context.dataStore.data
            .map {
                Pair(
                    it[SongSortTypeKey].toEnum(SongSortType.CREATE_DATE) to (it[SongSortDescendingKey]
                        ?: true),
                    (it[HideExplicitKey] ?: false) to (it[VideoDownloadsInMusicKey] ?: true)
                )
            }
            .distinctUntilChanged()
            .flatMapLatest { (sortDesc, flags) ->
                val (sortType, descending) = sortDesc
                val (hideExplicit, videosInMusic) = flags
                when (playlist) {
                    "liked" -> database.likedSongs(sortType, descending)
                        .map { it.filterExplicit(hideExplicit) }

                    "downloaded" -> database.downloadedSongs(sortType, descending, videosInMusic)
                        .map { it.filterExplicit(hideExplicit) }

                    // Downloaded podcast episodes (isEpisode = 1) - reuses this whole screen for the
                    // Library -> Downloaded "Podcasts" tile, just a different song source.
                    "downloaded_episodes" -> database.downloadedEpisodes(sortType, descending)
                        .map { it.filterExplicit(hideExplicit) }

                    "uploaded" -> database.uploadedSongs(sortType, descending)
                        .map { it.filterExplicit(hideExplicit) }

                    else -> kotlinx.coroutines.flow.flowOf(emptyList())
                }
            }
            .stateIn(viewModelScope, kotlinx.coroutines.flow.SharingStarted.Lazily, emptyList())

    fun syncLikedSongs() {
        viewModelScope.launch(Dispatchers.IO) { syncUtils.syncLikedSongs() }
    }

    fun syncUploadedSongs() {
        viewModelScope.launch(Dispatchers.IO) { syncUtils.syncUploadedSongs() }
    }
}
