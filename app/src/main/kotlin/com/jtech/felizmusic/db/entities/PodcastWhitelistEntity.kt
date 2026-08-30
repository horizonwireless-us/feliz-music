package com.jtech.felizmusic.db.entities

import androidx.compose.runtime.Immutable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

/**
 * One entry in the podcast whitelist, which is now CHANNEL-level (a `UC…` host channel). Approving a
 * channel vouches for its whole catalog: a show/episode is kosher iff its host channel is a member here.
 * The browse grid renders these channels; a tile opens the channel page (ArtistScreen, isPodcastChannel).
 * `isKidZone` is the kids-channel flag (per-item exceptions live in
 * `blockedContentIds`, handled by [com.jtech.felizmusic.utils.BlockedIdsCache]). isFemale was removed;
 * podcasts are unaffected by the music-only Acappella filter.
 */
@Immutable
@Entity(tableName = "podcast_whitelist")
data class PodcastWhitelistEntity(
    @PrimaryKey val channelId: String,
    val name: String,
    val thumbnailUrl: String? = null,
    val isKidZone: Boolean = false,
    val isVerified: Boolean = false,
    val showCount: Int = 0,
    val lastSyncedAt: LocalDateTime = LocalDateTime.now(),
)
