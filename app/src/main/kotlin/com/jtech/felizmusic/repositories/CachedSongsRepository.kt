package com.jtech.felizmusic.repositories

import android.content.Context
import androidx.media3.datasource.cache.SimpleCache
import com.jtech.felizmusic.constants.HideExplicitKey
import com.jtech.felizmusic.db.MusicDatabase
import com.jtech.felizmusic.db.entities.Song
import com.jtech.felizmusic.di.DownloadCache
import com.jtech.felizmusic.di.PlayerCache
import com.jtech.felizmusic.extensions.filterExplicit
import com.jtech.felizmusic.utils.dataStore
import com.jtech.felizmusic.utils.get
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDateTime
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

@Singleton
class CachedSongsRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val database: MusicDatabase,
    @PlayerCache private val playerCache: SimpleCache,
    @DownloadCache private val downloadCache: SimpleCache,
) {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val _cachedSongs = MutableStateFlow<List<Song>>(emptyList())
    val cachedSongs: StateFlow<List<Song>> = _cachedSongs

    init {
        scope.launch {
            // Initial refresh
            refreshInternal()
            // Then refresh every 30 seconds instead of every 1 second
            while (isActive) {
                delay(30_000)
                refreshInternal()
            }
        }
    }

    /** Force refresh the cached songs list */
    fun refresh() {
        scope.launch {
            refreshInternal()
        }
    }

    private suspend fun refreshInternal() {
        val hideExplicit = context.dataStore.get(HideExplicitKey, false)
        val cachedIds = playerCache.keys.mapNotNull { it?.toString() }.toSet()
        val downloadedIds = downloadCache.keys.mapNotNull { it?.toString() }.toSet()
        val pureCacheIds = cachedIds.subtract(downloadedIds)

        val songs = if (pureCacheIds.isNotEmpty()) {
            database.getSongsByIds(pureCacheIds.toList())
        } else {
            emptyList()
        }

        val completeSongs = songs.filter { song ->
            val contentLength = song.format?.contentLength
            contentLength != null &&
                playerCache.isCached(song.song.id, 0, contentLength) &&
                !song.song.isDownloaded
        }

        if (completeSongs.isNotEmpty()) {
            database.query {
                completeSongs.forEach {
                    if (it.song.dateDownload == null) {
                        update(it.song.copy(dateDownload = LocalDateTime.now()))
                    }
                }
            }
        }

        _cachedSongs.value = completeSongs
            .filter { it.song.dateDownload != null }
            .sortedByDescending { it.song.dateDownload }
            .filterExplicit(hideExplicit)
    }

    fun removeSongFromCache(songId: String) {
        playerCache.removeResource(songId)
        refresh() // Refresh list after removal
    }
}
