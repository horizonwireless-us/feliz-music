# Kotlin file reference

Every tracked Kotlin file is listed with hard metadata extracted from the file text: line count, package, whether it declares any `@Composable`, import count, top-level declaration count (`Decls` - a high value flags a god-file), and the external import roots it depends on. Declaration counting is regex-based (after stripping comments and string literals). For the actual declaration names, read the file or use your editor's outline - they are not duplicated here.

## `app` Kotlin files (670)

| File | Lines | Package | Compose | Imports | Decls | External import roots |
| --- | ---: | --- | --- | ---: | ---: | --- |
| `app/src/main/kotlin/com/dpi/ActivityLifecycleManager.kt` | 116 | `com.dpi` | no | 9 | 27 | android.annotation, android.app, android.os, java.util, timber.log |
| `app/src/main/kotlin/com/dpi/BaseLifecycleContentProvider.kt` | 36 | `com.dpi` | no | 4 | 7 | android.content, android.database, android.net |
| `app/src/main/kotlin/com/dpi/DensityConfiguration.kt` | 87 | `com.dpi` | no | 8 | 13 | android.annotation, android.app, android.content, android.util, kotlin.math, timber.log |
| `app/src/main/kotlin/com/dpi/DensityScaler.kt` | 46 | `com.dpi` | no | 2 | 9 | android.content, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/App.kt` | 548 | `com.jtech.felizmusic` | no | 75 | 52 | android.app, android.content, android.os, android.util, android.webkit, androidx.datastore, coil3.ImageLoader, coil3.PlatformContext, coil3.SingletonImageLoader, coil3.disk, coil3.network, coil3.request, coil3.svg, com.google, com.zemer, dagger.hilt, io.ktor, java.net, java.util, javax.inject, kotlinx.coroutines, kotlinx.serialization, okhttp3.Credentials, okhttp3.Dispatcher, okhttp3.OkHttpClient, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/MainActivity.kt` | 2394 | `com.jtech.felizmusic` | no | 305 | 239 | android.annotation, android.app, android.content, android.os, android.view, androidx.activity, androidx.compose, androidx.core, androidx.datastore, androidx.hilt, androidx.lifecycle, androidx.media3, androidx.navigation, coil3.compose, coil3.imageLoader, coil3.request, coil3.toBitmap, com.google, com.valentinilk, dagger.hilt, java.net, java.util, javax.inject, kotlin.time, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/accessibility/ButtonMapperAccessibilityService.kt` | 45 | `com.jtech.felizmusic.accessibility` | no | 7 | 6 | android.accessibilityservice, android.annotation, android.view |
| `app/src/main/kotlin/com/jtech/felizmusic/auth/AuthState.kt` | 57 | `com.jtech.felizmusic.auth` | no | 0 | 16 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/auth/UserAuthManager.kt` | 145 | `com.jtech.felizmusic.auth` | no | 13 | 26 | android.content, com.google, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/auth/WebViewGoogleAuthManager.kt` | 133 | `com.jtech.felizmusic.auth` | no | 20 | 18 | android.content, android.net, android.util, android.webkit, androidx.compose, com.google, javax.inject, kotlin.coroutines, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/Dimensions.kt` | 46 | `com.jtech.felizmusic.constants` | no | 4 | 23 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/HistorySource.kt` | 7 | `com.jtech.felizmusic.constants` | no | 0 | 1 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/LibraryFilter.kt` | 14 | `com.jtech.felizmusic.constants` | no | 0 | 1 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/MediaSessionConstants.kt` | 23 | `com.jtech.felizmusic.constants` | no | 2 | 14 | android.os, androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/PlaybackMode.kt` | 11 | `com.jtech.felizmusic.constants` | no | 0 | 1 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/PreferenceKeys.kt` | 618 | `com.jtech.felizmusic.constants` | no | 9 | 190 | androidx.annotation, androidx.datastore, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/constants/StatPeriod.kt` | 97 | `com.jtech.felizmusic.constants` | no | 3 | 4 | java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/Converters.kt` | 20 | `com.jtech.felizmusic.db` | no | 4 | 3 | androidx.room, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/DatabaseDao.kt` | 1786 | `com.jtech.felizmusic.db` | no | 65 | 246 | androidx.room, androidx.sqlite, java.text, java.time, java.util, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/db/MusicDatabase.kt` | 641 | `com.jtech.felizmusic.db` | no | 44 | 80 | android.annotation, android.content, android.database, androidx.core, androidx.room, androidx.sqlite, java.time, java.util, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/ActionSnapshotRow.kt` | 13 | `com.jtech.felizmusic.db.entities` | no | 1 | 3 | java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/Album.kt` | 33 | `com.jtech.felizmusic.db.entities` | no | 4 | 8 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/AlbumArtistMap.kt` | 29 | `com.jtech.felizmusic.db.entities` | no | 3 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/AlbumEntity.kt` | 59 | `com.jtech.felizmusic.db.entities` | no | 13 | 19 | androidx.compose, androidx.room, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/AlbumWithSongs.kt` | 36 | `com.jtech.felizmusic.db.entities` | no | 4 | 4 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/Artist.kt` | 19 | `com.jtech.felizmusic.db.entities` | no | 2 | 7 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/ArtistEntity.kt` | 63 | `com.jtech.felizmusic.db.entities` | no | 13 | 14 | androidx.compose, androidx.room, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/ArtistWhitelistEntity.kt` | 27 | `com.jtech.felizmusic.db.entities` | no | 5 | 12 | androidx.compose, androidx.room, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/Event.kt` | 32 | `com.jtech.felizmusic.db.entities` | no | 7 | 5 | androidx.compose, androidx.room, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/EventWithSong.kt` | 17 | `com.jtech.felizmusic.db.entities` | no | 3 | 3 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/FormatEntity.kt` | 19 | `com.jtech.felizmusic.db.entities` | no | 2 | 11 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/LocalItem.kt` | 7 | `com.jtech.felizmusic.db.entities` | no | 0 | 4 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/LyricsEntity.kt` | 14 | `com.jtech.felizmusic.db.entities` | no | 2 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PlayCountEntity.kt` | 16 | `com.jtech.felizmusic.db.entities` | no | 2 | 5 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/Playlist.kt` | 40 | `com.jtech.felizmusic.db.entities` | no | 4 | 8 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PlaylistEntity.kt` | 67 | `com.jtech.felizmusic.db.entities` | no | 13 | 20 | androidx.compose, androidx.room, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PlaylistSong.kt` | 14 | `com.jtech.felizmusic.db.entities` | no | 2 | 3 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PlaylistSongMap.kt` | 31 | `com.jtech.felizmusic.db.entities` | no | 4 | 6 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PlaylistSongMapPreview.kt` | 14 | `com.jtech.felizmusic.db.entities` | no | 2 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PodcastEntity.kt` | 29 | `com.jtech.felizmusic.db.entities` | no | 4 | 10 | androidx.compose, androidx.room, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/PodcastWhitelistEntity.kt` | 26 | `com.jtech.felizmusic.db.entities` | no | 4 | 8 | androidx.compose, androidx.room, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/RecognitionHistoryEntity.kt` | 31 | `com.jtech.felizmusic.db.entities` | no | 4 | 8 | androidx.room, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/RelatedSongMap.kt` | 29 | `com.jtech.felizmusic.db.entities` | no | 4 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SearchHistory.kt` | 19 | `com.jtech.felizmusic.db.entities` | no | 3 | 3 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SetVideoIdEntity.kt` | 11 | `com.jtech.felizmusic.db.entities` | no | 2 | 3 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/Song.kt` | 54 | `com.jtech.felizmusic.db.entities` | no | 4 | 9 | androidx.compose, androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SongAlbumMap.kt` | 29 | `com.jtech.felizmusic.db.entities` | no | 3 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SongArtistMap.kt` | 29 | `com.jtech.felizmusic.db.entities` | no | 3 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SongEntity.kt` | 105 | `com.jtech.felizmusic.db.entities` | no | 14 | 31 | androidx.compose, androidx.room, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SongWithStats.kt` | 12 | `com.jtech.felizmusic.db.entities` | no | 1 | 6 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SortedSongAlbumMap.kt` | 14 | `com.jtech.felizmusic.db.entities` | no | 2 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/db/entities/SortedSongArtistMap.kt` | 14 | `com.jtech.felizmusic.db.entities` | no | 2 | 4 | androidx.room |
| `app/src/main/kotlin/com/jtech/felizmusic/di/AppModule.kt` | 90 | `com.jtech.felizmusic.di` | no | 22 | 8 | android.content, androidx.media3, com.google, dagger.Module, dagger.Provides, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/di/DataStoreQualifiers.kt` | 11 | `com.jtech.felizmusic.di` | no | 1 | 2 | javax.inject |
| `app/src/main/kotlin/com/jtech/felizmusic/di/LyricsHelperEntryPoint.kt` | 12 | `com.jtech.felizmusic.di` | no | 4 | 2 | dagger.hilt |
| `app/src/main/kotlin/com/jtech/felizmusic/di/NetworkModule.kt` | 21 | `com.jtech.felizmusic.di` | no | 8 | 2 | android.content, dagger.Module, dagger.Provides, dagger.hilt, javax.inject |
| `app/src/main/kotlin/com/jtech/felizmusic/di/Qualifiers.kt` | 15 | `com.jtech.felizmusic.di` | no | 1 | 3 | javax.inject |
| `app/src/main/kotlin/com/jtech/felizmusic/di/SyncModule.kt` | 121 | `com.jtech.felizmusic.di` | no | 16 | 9 | android.content, androidx.datastore, com.google, dagger.Module, dagger.Provides, dagger.hilt, javax.inject |
| `app/src/main/kotlin/com/jtech/felizmusic/di/ZemerSearchRepositoryEntryPoint.kt` | 29 | `com.jtech.felizmusic.di` | no | 6 | 3 | android.content, dagger.hilt |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/AccountState.kt` | 29 | `com.jtech.felizmusic.extensions` | no | 6 | 2 | android.content, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/ContextExt.kt` | 178 | `com.jtech.felizmusic.extensions` | no | 16 | 23 | android.content, android.net, android.widget, androidx.annotation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/CoroutineExt.kt` | 27 | `com.jtech.felizmusic.extensions` | no | 5 | 1 | kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/FileExt.kt` | 13 | `com.jtech.felizmusic.extensions` | no | 5 | 3 | java.io, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/ListExt.kt` | 54 | `com.jtech.felizmusic.extensions` | no | 2 | 5 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/MediaItemExt.kt` | 76 | `com.jtech.felizmusic.extensions` | no | 9 | 5 | androidx.core, androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/PlayerExt.kt` | 146 | `com.jtech.felizmusic.extensions` | no | 12 | 21 | androidx.annotation, androidx.media3, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/QueueExt.kt` | 100 | `com.jtech.felizmusic.extensions` | no | 8 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/StringExt.kt` | 23 | `com.jtech.felizmusic.extensions` | no | 3 | 4 | androidx.sqlite, java.net |
| `app/src/main/kotlin/com/jtech/felizmusic/extensions/UtilExt.kt` | 8 | `com.jtech.felizmusic.extensions` | no | 0 | 0 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/latestreleases/LatestReleaseCard.kt` | 131 | `com.jtech.felizmusic.latestreleases` | yes | 29 | 12 | androidx.compose, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/latestreleases/LatestReleaseDate.kt` | 16 | `com.jtech.felizmusic.latestreleases` | no | 2 | 2 | android.text, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/latestreleases/LatestReleaseFilter.kt` | 15 | `com.jtech.felizmusic.latestreleases` | no | 0 | 2 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/latestreleases/LatestReleaseMapping.kt` | 19 | `com.jtech.felizmusic.latestreleases` | no | 2 | 1 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/latestreleases/LatestReleasePlayback.kt` | 79 | `com.jtech.felizmusic.latestreleases` | no | 7 | 10 | androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/latestreleases/LatestReleasesStore.kt` | 256 | `com.jtech.felizmusic.latestreleases` | no | 17 | 65 | android.content, io.ktor, java.io, kotlinx.coroutines, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/LrcLibLyricsProvider.kt` | 32 | `com.jtech.felizmusic.lyrics` | no | 5 | 5 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/LyricsEntry.kt` | 15 | `com.jtech.felizmusic.lyrics` | no | 1 | 6 | kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/LyricsHelper.kt` | 166 | `com.jtech.felizmusic.lyrics` | no | 15 | 24 | android.content, android.util, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/LyricsProvider.kt` | 28 | `com.jtech.felizmusic.lyrics` | no | 1 | 5 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/LyricsUtils.kt` | 781 | `com.jtech.felizmusic.lyrics` | no | 3 | 122 | android.text, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/SimpMusicLyricsProvider.kt` | 29 | `com.jtech.felizmusic.lyrics` | no | 2 | 5 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/YouTubeLyricsProvider.kt` | 28 | `com.jtech.felizmusic.lyrics` | no | 4 | 5 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/YouTubeSubtitleLyricsProvider.kt` | 18 | `com.jtech.felizmusic.lyrics` | no | 2 | 4 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/lyrics/model/LyricsUnavailableException.kt` | 9 | `com.jtech.felizmusic.lyrics.model` | no | 0 | 2 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/models/DpadDirection.kt` | 27 | `com.jtech.felizmusic.models` | no | 9 | 5 | android.view, androidx.annotation, androidx.datastore |
| `app/src/main/kotlin/com/jtech/felizmusic/models/ItemsPage.kt` | 8 | `com.jtech.felizmusic.models` | no | 1 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/models/MediaMetadata.kt` | 143 | `com.jtech.felizmusic.models` | no | 9 | 26 | androidx.compose, java.io, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/models/PersistPlayerState.kt` | 14 | `com.jtech.felizmusic.models` | no | 1 | 9 | java.io |
| `app/src/main/kotlin/com/jtech/felizmusic/models/PersistQueue.kt` | 59 | `com.jtech.felizmusic.models` | no | 1 | 31 | java.io |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/OfflineReadProvider.kt` | 138 | `com.jtech.felizmusic.offline` | no | 23 | 28 | android.content, dagger.hilt, java.lang, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/OfflineSubsetSyncer.kt` | 190 | `com.jtech.felizmusic.offline` | no | 23 | 31 | android.content, androidx.datastore, dagger.hilt, java.io, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetCategories.kt` | 428 | `com.jtech.felizmusic.offline` | no | 9 | 164 | java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetCorpus.kt` | 191 | `com.jtech.felizmusic.offline` | no | 0 | 121 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetDecoder.kt` | 250 | `com.jtech.felizmusic.offline` | no | 17 | 54 | java.io, java.util, kotlinx.coroutines, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetFemale.kt` | 32 | `com.jtech.felizmusic.offline` | no | 0 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetHash.kt` | 23 | `com.jtech.felizmusic.offline` | no | 1 | 5 | java.security |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetLiveWhitelist.kt` | 123 | `com.jtech.felizmusic.offline` | no | 1 | 20 | java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetManifest.kt` | 74 | `com.jtech.felizmusic.offline` | no | 1 | 21 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetNormalize.kt` | 115 | `com.jtech.felizmusic.offline` | no | 2 | 29 | java.text, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetReadLayer.kt` | 760 | `com.jtech.felizmusic.offline` | no | 23 | 123 | java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetSearch.kt` | 315 | `com.jtech.felizmusic.offline` | no | 4 | 116 | kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetStore.kt` | 115 | `com.jtech.felizmusic.offline` | no | 5 | 26 | android.content, java.io, kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetSyncClient.kt` | 61 | `com.jtech.felizmusic.offline` | no | 12 | 10 | io.ktor, java.io, javax.inject, kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/offline/SubsetSynonyms.kt` | 59 | `com.jtech.felizmusic.offline` | no | 0 | 14 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastAutoAdvance.kt` | 74 | `com.jtech.felizmusic.playback` | no | 0 | 13 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastAwarePlayer.kt` | 185 | `com.jtech.felizmusic.playback` | no | 5 | 42 | androidx.media3, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastConnect.kt` | 139 | `com.jtech.felizmusic.playback` | no | 10 | 16 | java.net, kotlinx.coroutines, org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastConnector.kt` | 95 | `com.jtech.felizmusic.playback` | no | 2 | 21 | org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastController.kt` | 386 | `com.jtech.felizmusic.playback` | no | 17 | 46 | androidx.media3, kotlinx.coroutines, org.fcast, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastDeviceAddressResolver.kt` | 94 | `com.jtech.felizmusic.playback` | no | 13 | 15 | android.content, android.net, android.os, java.net, kotlin.coroutines, kotlinx.coroutines, org.fcast, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastDeviceCatalog.kt` | 80 | `com.jtech.felizmusic.playback` | no | 3 | 10 | org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastDeviceRefresher.kt` | 161 | `com.jtech.felizmusic.playback` | no | 20 | 24 | android.content, android.net, java.net, java.util, kotlinx.coroutines, org.fcast, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastErrorRecovery.kt` | 73 | `com.jtech.felizmusic.playback` | no | 0 | 8 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastIdleWatchdog.kt` | 53 | `com.jtech.felizmusic.playback` | no | 1 | 5 | org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastNativeLibLoader.kt` | 207 | `com.jtech.felizmusic.playback` | no | 11 | 44 | android.content, android.os, java.io, java.net, java.security, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastPlayback.kt` | 97 | `com.jtech.felizmusic.playback` | no | 1 | 13 | org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastRelayProtocol.kt` | 89 | `com.jtech.felizmusic.playback` | no | 4 | 27 | java.net, java.security |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastSessionLocks.kt` | 48 | `com.jtech.felizmusic.playback` | no | 4 | 6 | android.annotation, android.content, android.net, android.os |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastStreamRelay.kt` | 375 | `com.jtech.felizmusic.playback` | no | 19 | 75 | java.io, java.net, java.nio, java.security, java.util, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/CastVolumeKeys.kt` | 57 | `com.jtech.felizmusic.playback` | no | 1 | 7 | android.view |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/DeferredStatsPush.kt` | 51 | `com.jtech.felizmusic.playback` | no | 1 | 7 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/DeferredStatsQueue.kt` | 127 | `com.jtech.felizmusic.playback` | no | 6 | 23 | java.io, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/DeferredStatsRecord.kt` | 53 | `com.jtech.felizmusic.playback` | no | 3 | 12 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/DownloadMenuLogic.kt` | 68 | `com.jtech.felizmusic.playback` | no | 0 | 4 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/DownloadStateResolver.kt` | 106 | `com.jtech.felizmusic.playback` | no | 3 | 11 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/DownloadUtil.kt` | 333 | `com.jtech.felizmusic.playback` | no | 45 | 43 | android.content, android.net, androidx.core, androidx.media3, dagger.hilt, java.time, java.util, javax.inject, kotlinx.coroutines, okhttp3.OkHttpClient |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/EpisodePositionTracker.kt` | 157 | `com.jtech.felizmusic.playback` | no | 14 | 24 | androidx.media3, kotlin.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/EpisodeResume.kt` | 28 | `com.jtech.felizmusic.playback` | no | 0 | 5 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/ExoDownloadService.kt` | 81 | `com.jtech.felizmusic.playback` | no | 13 | 10 | android.app, android.content, android.graphics, androidx.media3, dagger.hilt, javax.inject |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/FCastDiscoveryHandler.kt` | 390 | `com.jtech.felizmusic.playback` | no | 5 | 73 | kotlinx.coroutines, org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/ListenAccumulator.kt` | 69 | `com.jtech.felizmusic.playback` | no | 0 | 12 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/MediaLibrarySessionCallback.kt` | 816 | `com.jtech.felizmusic.playback` | no | 60 | 80 | android.content, android.net, android.os, androidx.annotation, androidx.core, androidx.media3, com.google, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/MediaStoreDownloadManager.kt` | 1085 | `com.jtech.felizmusic.playback` | no | 55 | 127 | android.content, android.media, android.net, androidx.core, dagger.hilt, java.io, java.time, java.util, javax.inject, kotlin.math, kotlinx.coroutines, okhttp3.OkHttpClient, okhttp3.Request, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/MediaStoreDownloadService.kt` | 302 | `com.jtech.felizmusic.playback` | no | 27 | 48 | android.app, android.content, android.os, androidx.core, dagger.hilt, javax.inject, kotlin.math, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/MusicService.kt` | 2936 | `com.jtech.felizmusic.playback` | no | 185 | 309 | android.app, android.content, android.database, android.media, android.net, android.os, androidx.core, androidx.datastore, androidx.media3, com.zemer, dagger.hilt, java.io, java.time, java.util, javax.inject, kotlin.time, kotlinx.coroutines, okhttp3.OkHttpClient, org.fcast, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/PlaybackNonceRegistry.kt` | 76 | `com.jtech.felizmusic.playback` | no | 1 | 13 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/PlaybackProbe.kt` | 31 | `com.jtech.felizmusic.playback` | no | 0 | 8 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/PlayerConnection.kt` | 370 | `com.jtech.felizmusic.playback` | no | 28 | 67 | android.content, androidx.media3, kotlinx.coroutines, org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/PlayerVideoUiLogic.kt` | 49 | `com.jtech.felizmusic.playback` | no | 0 | 5 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/RemoteVolumeTracker.kt` | 54 | `com.jtech.felizmusic.playback` | no | 3 | 9 | kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/SeekMath.kt` | 15 | `com.jtech.felizmusic.playback` | no | 0 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/SleepTimer.kt` | 81 | `com.jtech.felizmusic.playback` | no | 11 | 12 | androidx.compose, androidx.media3, kotlin.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoAvailabilityCache.kt` | 69 | `com.jtech.felizmusic.playback` | no | 3 | 18 | kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoDecoderCaps.kt` | 35 | `com.jtech.felizmusic.playback` | no | 2 | 6 | android.media, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoModeController.kt` | 771 | `com.jtech.felizmusic.playback` | no | 32 | 113 | android.os, android.view, androidx.media3, kotlinx.coroutines, org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoModeLogic.kt` | 190 | `com.jtech.felizmusic.playback` | no | 1 | 11 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoQualityLogic.kt` | 204 | `com.jtech.felizmusic.playback` | no | 1 | 39 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoRendition.kt` | 95 | `com.jtech.felizmusic.playback` | no | 0 | 20 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/VideoSongIds.kt` | 28 | `com.jtech.felizmusic.playback` | no | 0 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/WatchTimeReporter.kt` | 488 | `com.jtech.felizmusic.playback` | no | 11 | 86 | androidx.media3, java.util, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/WatchTimeSchedule.kt` | 41 | `com.jtech.felizmusic.playback` | no | 0 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/WatchTimeSegments.kt` | 117 | `com.jtech.felizmusic.playback` | no | 1 | 20 | java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/EmptyQueue.kt` | 14 | `com.jtech.felizmusic.playback.queues` | no | 2 | 5 | androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/ListQueue.kt` | 35 | `com.jtech.felizmusic.playback.queues` | no | 5 | 11 | androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/LocalAlbumRadio.kt` | 62 | `com.jtech.felizmusic.playback.queues` | no | 10 | 14 | android.content, androidx.media3, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/Queue.kt` | 103 | `com.jtech.felizmusic.playback.queues` | no | 4 | 20 | androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/StationQueue.kt` | 160 | `com.jtech.felizmusic.playback.queues` | no | 19 | 32 | android.content, androidx.media3, java.io, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/YouTubeQueue.kt` | 75 | `com.jtech.felizmusic.playback.queues` | no | 11 | 16 | androidx.media3, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/queues/ZemerRadioQueue.kt` | 126 | `com.jtech.felizmusic.playback.queues` | no | 10 | 23 | android.content, androidx.media3, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/relay/RelayDataSourceFactory.kt` | 62 | `com.jtech.felizmusic.playback.relay` | no | 11 | 7 | android.content, androidx.core, androidx.media3, java.util, okhttp3.OkHttpClient |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/relay/RelayDeviceId.kt` | 72 | `com.jtech.felizmusic.playback.relay` | no | 10 | 10 | android.content, androidx.datastore, java.util, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/relay/RelayDownload.kt` | 46 | `com.jtech.felizmusic.playback.relay` | no | 0 | 5 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/playback/relay/RelayStream.kt` | 30 | `com.jtech.felizmusic.playback.relay` | no | 1 | 9 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/AudioResampler.kt` | 118 | `com.jtech.felizmusic.recognition` | no | 6 | 24 | java.nio, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/RecognitionAudioCapture.kt` | 147 | `com.jtech.felizmusic.recognition` | no | 15 | 24 | android.Manifest, android.annotation, android.content, android.media, androidx.core, java.io, java.nio, kotlin.coroutines, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/RecognitionHistoryFilter.kt` | 25 | `com.jtech.felizmusic.recognition` | no | 0 | 4 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/RecognitionHistoryPlayback.kt` | 34 | `com.jtech.felizmusic.recognition` | no | 2 | 4 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/RecognitionMatchSelector.kt` | 51 | `com.jtech.felizmusic.recognition` | no | 1 | 5 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/RecognitionMatcher.kt` | 108 | `com.jtech.felizmusic.recognition` | no | 1 | 31 | java.text |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/RecognitionResolver.kt` | 88 | `com.jtech.felizmusic.recognition` | no | 10 | 15 | kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/ShazamSignatureGenerator.kt` | 395 | `com.jtech.felizmusic.recognition` | no | 10 | 109 | java.io, java.nio, java.util, kotlin.math, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/VibraSignature.kt` | 22 | `com.jtech.felizmusic.recognition` | no | 0 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/shazam/Shazam.kt` | 234 | `com.jtech.felizmusic.recognition.shazam` | no | 22 | 47 | io.ktor, java.util, kotlin.random, kotlinx.coroutines, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/recognition/shazam/ShazamModels.kt` | 316 | `com.jtech.felizmusic.recognition.shazam` | no | 2 | 137 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/repositories/CachedSongsRepository.kt` | 96 | `com.jtech.felizmusic.repositories` | no | 22 | 18 | android.content, androidx.media3, dagger.hilt, java.time, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ResultDedupe.kt` | 78 | `com.jtech.felizmusic.search` | no | 2 | 9 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerGenresModels.kt` | 149 | `com.jtech.felizmusic.search` | no | 1 | 42 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerPodcastGenresModels.kt` | 81 | `com.jtech.felizmusic.search` | no | 1 | 26 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerResultMapper.kt` | 697 | `com.jtech.felizmusic.search` | no | 21 | 103 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerRoutes.kt` | 71 | `com.jtech.felizmusic.search` | no | 1 | 14 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerSearchClient.kt` | 599 | `com.jtech.felizmusic.search` | no | 16 | 62 | io.ktor, java.io, javax.inject, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerSearchModels.kt` | 410 | `com.jtech.felizmusic.search` | no | 2 | 158 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerSearchOptions.kt` | 32 | `com.jtech.felizmusic.search` | no | 5 | 6 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerSearchRepository.kt` | 474 | `com.jtech.felizmusic.search` | no | 34 | 68 | android.content, dagger.hilt, java.io, java.nio, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/search/ZemerStationsModels.kt` | 135 | `com.jtech.felizmusic.search` | no | 1 | 39 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusDownload.kt` | 65 | `com.jtech.felizmusic.statuses` | no | 2 | 16 | org.json |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusDownloadManager.kt` | 118 | `com.jtech.felizmusic.statuses` | no | 14 | 26 | android.content, android.graphics, android.net, androidx.core, dagger.hilt, java.io, javax.inject, kotlinx.coroutines, okhttp3.OkHttpClient, okhttp3.Request |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusDownloadNaming.kt` | 29 | `com.jtech.felizmusic.statuses` | no | 4 | 4 | java.time, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusDownloadsStore.kt` | 47 | `com.jtech.felizmusic.statuses` | no | 9 | 8 | android.content, androidx.datastore, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusDownloadsView.kt` | 30 | `com.jtech.felizmusic.statuses` | no | 0 | 5 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusGallery.kt` | 107 | `com.jtech.felizmusic.statuses` | no | 13 | 19 | android.content, android.graphics, android.net, android.os, android.provider, java.io, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusSeenStore.kt` | 31 | `com.jtech.felizmusic.statuses` | no | 9 | 5 | android.content, androidx.datastore, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusSourcesConfig.kt` | 162 | `com.jtech.felizmusic.statuses` | no | 2 | 35 | org.json |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusText.kt` | 45 | `com.jtech.felizmusic.statuses` | no | 9 | 9 | android.util, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusTextImage.kt` | 60 | `com.jtech.felizmusic.statuses` | no | 8 | 12 | android.graphics, android.text, androidx.core |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusTimeline.kt` | 76 | `com.jtech.felizmusic.statuses` | no | 4 | 20 | java.time, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusesApi.kt` | 290 | `com.jtech.felizmusic.statuses` | no | 9 | 68 | java.net, kotlinx.coroutines, org.json |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/StatusesRepository.kt` | 293 | `com.jtech.felizmusic.statuses` | no | 22 | 51 | android.content, android.os, androidx.datastore, dagger.hilt, java.util, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/statuses/YidStatusApi.kt` | 147 | `com.jtech.felizmusic.statuses` | no | 8 | 29 | java.io, java.util, okhttp3.MediaType, okhttp3.OkHttpClient, okhttp3.Request, okhttp3.RequestBody, org.json |
| `app/src/main/kotlin/com/jtech/felizmusic/sync/ContentFilterSyncService.kt` | 347 | `com.jtech.felizmusic.sync` | no | 18 | 42 | android.util, javax.inject, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/sync/ContentReportRepository.kt` | 54 | `com.jtech.felizmusic.sync` | no | 6 | 7 | com.google, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/sync/PodcastSyncLogic.kt` | 105 | `com.jtech.felizmusic.sync` | no | 0 | 10 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/sync/UserPreferencesRepository.kt` | 723 | `com.jtech.felizmusic.sync` | no | 41 | 104 | android.content, android.util, androidx.datastore, com.google, dagger.hilt, java.util, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/sync/models/DevicePreferencesEntity.kt` | 136 | `com.jtech.felizmusic.sync.models` | no | 3 | 53 | com.google, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/sync/models/UserPreferencesEntity.kt` | 93 | `com.jtech.felizmusic.sync.models` | no | 3 | 22 | com.google, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/FlushSchedule.kt` | 30 | `com.jtech.felizmusic.tracking` | no | 0 | 8 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/ImpressionReporter.kt` | 99 | `com.jtech.felizmusic.tracking` | yes | 9 | 5 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/LibraryActionBackfill.kt` | 142 | `com.jtech.felizmusic.tracking` | no | 16 | 18 | android.content, androidx.datastore, java.time, java.util, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/PlayHistoryBackfill.kt` | 166 | `com.jtech.felizmusic.tracking` | no | 18 | 27 | android.content, androidx.datastore, java.time, java.util, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/PlaySource.kt` | 80 | `com.jtech.felizmusic.tracking` | no | 1 | 22 | java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/Tracker.kt` | 303 | `com.jtech.felizmusic.tracking` | no | 18 | 57 | android.content, androidx.datastore, java.io, java.util, kotlinx.coroutines, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/TrackingEvents.kt` | 235 | `com.jtech.felizmusic.tracking` | no | 9 | 39 | kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/TrackingLifecycle.kt` | 58 | `com.jtech.felizmusic.tracking` | no | 4 | 13 | android.app, android.os |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/TrackingQueue.kt` | 98 | `com.jtech.felizmusic.tracking` | no | 1 | 16 | java.io |
| `app/src/main/kotlin/com/jtech/felizmusic/tracking/TrackingUploader.kt` | 119 | `com.jtech.felizmusic.tracking` | no | 13 | 23 | io.ktor, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AccountSettingsDialog.kt` | 69 | `com.jtech.felizmusic.ui.component` | yes | 20 | 1 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AlphabetIndex.kt` | 21 | `com.jtech.felizmusic.ui.component` | no | 0 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AnonymousAuthEmailDialog.kt` | 123 | `com.jtech.felizmusic.ui.component` | yes | 25 | 3 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AppBarTitle.kt` | 31 | `com.jtech.felizmusic.ui.component` | yes | 6 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AppNameTitle.kt` | 35 | `com.jtech.felizmusic.ui.component` | yes | 9 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AppStateViews.kt` | 121 | `com.jtech.felizmusic.ui.component` | yes | 27 | 1 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ArtistBrowseComponents.kt` | 252 | `com.jtech.felizmusic.ui.component` | yes | 40 | 8 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/AutoResizeText.kt` | 97 | `com.jtech.felizmusic.ui.component` | yes | 20 | 9 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/BackTopAppBar.kt` | 59 | `com.jtech.felizmusic.ui.component` | yes | 9 | 3 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/BigSeekBar.kt` | 58 | `com.jtech.felizmusic.ui.component` | yes | 17 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/BottomSheet.kt` | 348 | `com.jtech.felizmusic.ui.component` | yes | 47 | 45 | androidx.activity, androidx.compose, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/BottomSheetMenu.kt` | 87 | `com.jtech.felizmusic.ui.component` | yes | 23 | 8 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/BottomSheetPage.kt` | 166 | `com.jtech.felizmusic.ui.component` | yes | 47 | 10 | androidx.activity, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/CastVolumeKeyHandler.kt` | 71 | `com.jtech.felizmusic.ui.component` | yes | 13 | 6 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ChartRankCell.kt` | 231 | `com.jtech.felizmusic.ui.component` | yes | 29 | 23 | androidx.compose, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ChipsRow.kt` | 286 | `com.jtech.felizmusic.ui.component` | yes | 62 | 15 | android.annotation, androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/CreatePlaylistDialog.kt` | 123 | `com.jtech.felizmusic.ui.component` | yes | 34 | 8 | androidx.compose, java.time, java.util, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Dialog.kt` | 394 | `com.jtech.felizmusic.ui.component` | yes | 49 | 9 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/DownloadStatusUi.kt` | 170 | `com.jtech.felizmusic.ui.component` | yes | 28 | 18 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/DraggableScrollBarOverlay.kt` | 246 | `com.jtech.felizmusic.ui.component` | yes | 34 | 52 | androidx.compose, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/EmptyPlaceholder.kt` | 47 | `com.jtech.felizmusic.ui.component` | yes | 16 | 1 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ExpandableStatusCaption.kt` | 98 | `com.jtech.felizmusic.ui.component` | yes | 32 | 7 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/FocusBorder.kt` | 93 | `com.jtech.felizmusic.ui.component` | yes | 22 | 8 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/GenreCard.kt` | 166 | `com.jtech.felizmusic.ui.component` | yes | 39 | 19 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/GenreCardGrid.kt` | 84 | `com.jtech.felizmusic.ui.component` | yes | 15 | 3 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/GenreChip.kt` | 84 | `com.jtech.felizmusic.ui.component` | yes | 22 | 4 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/GenreDetailHeader.kt` | 118 | `com.jtech.felizmusic.ui.component` | yes | 28 | 6 | androidx.annotation, androidx.compose, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/GenreIcons.kt` | 85 | `com.jtech.felizmusic.ui.component` | no | 2 | 2 | androidx.annotation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/HideOnScrollFAB.kt` | 117 | `com.jtech.felizmusic.ui.component` | yes | 21 | 3 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/IconButton.kt` | 203 | `com.jtech.felizmusic.ui.component` | yes | 41 | 9 | androidx.annotation, androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/IconCategoryCard.kt` | 92 | `com.jtech.felizmusic.ui.component` | yes | 24 | 1 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Items.kt` | 1665 | `com.jtech.felizmusic.ui.component` | yes | 113 | 93 | android.annotation, androidx.compose, androidx.media3, coil3.compose, coil3.request, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/LetterFastScrollbar.kt` | 217 | `com.jtech.felizmusic.ui.component` | yes | 37 | 23 | androidx.compose, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Library.kt` | 522 | `com.jtech.felizmusic.ui.component` | yes | 41 | 12 | android.annotation, androidx.compose, androidx.navigation, coil3.compose, coil3.request, coil3.size, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Lyrics.kt` | 972 | `com.jtech.felizmusic.ui.component` | yes | 118 | 112 | android.annotation, android.content, android.os, androidx.activity, androidx.annotation, androidx.compose, androidx.lifecycle, androidx.palette, coil3.imageLoader, coil3.request, coil3.toBitmap, kotlin.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/LyricsImageCard.kt` | 287 | `com.jtech.felizmusic.ui.component` | yes | 28 | 34 | android.annotation, androidx.compose, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Material3MenuItem.kt` | 135 | `com.jtech.felizmusic.ui.component` | yes | 31 | 13 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Material3SettingsGroup.kt` | 206 | `com.jtech.felizmusic.ui.component` | yes | 36 | 13 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/MenuDialogs.kt` | 129 | `com.jtech.felizmusic.ui.component` | yes | 27 | 6 | androidx.compose, coil3.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/NavigationTitle.kt` | 81 | `com.jtech.felizmusic.ui.component` | yes | 22 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/NewMenuComponents.kt` | 154 | `com.jtech.felizmusic.ui.component` | yes | 32 | 14 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OfflineBackupPromo.kt` | 91 | `com.jtech.felizmusic.ui.component` | yes | 22 | 5 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OnboardingActionButton.kt` | 83 | `com.jtech.felizmusic.ui.component` | yes | 11 | 3 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OnboardingChoiceCard.kt` | 87 | `com.jtech.felizmusic.ui.component` | yes | 19 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OnboardingInfoCard.kt` | 89 | `com.jtech.felizmusic.ui.component` | yes | 22 | 1 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OnboardingStatusPill.kt` | 49 | `com.jtech.felizmusic.ui.component` | yes | 15 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OnboardingStepHeader.kt` | 42 | `com.jtech.felizmusic.ui.component` | yes | 12 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/OnboardingStepTitle.kt` | 32 | `com.jtech.felizmusic.ui.component` | yes | 7 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/PlayerSlider.kt` | 112 | `com.jtech.felizmusic.ui.component` | yes | 17 | 19 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/PlayingIndicator.kt` | 113 | `com.jtech.felizmusic.ui.component` | yes | 29 | 3 | androidx.compose, kotlin.random, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/Preference.kt` | 378 | `com.jtech.felizmusic.ui.component` | yes | 48 | 12 | androidx.compose, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/RecognizeMusicFab.kt` | 29 | `com.jtech.felizmusic.ui.component` | yes | 6 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/SearchBar.kt` | 369 | `com.jtech.felizmusic.ui.component` | yes | 79 | 32 | androidx.activity, androidx.compose, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/SelectionTopActions.kt` | 73 | `com.jtech.felizmusic.ui.component` | yes | 9 | 4 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/SettingsCardGroup.kt` | 98 | `com.jtech.felizmusic.ui.component` | yes | 13 | 12 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/SortHeader.kt` | 108 | `com.jtech.felizmusic.ui.component` | yes | 25 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/StatusCopyButton.kt` | 48 | `com.jtech.felizmusic.ui.component` | yes | 16 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/StatusCreatorCircle.kt` | 139 | `com.jtech.felizmusic.ui.component` | yes | 36 | 15 | androidx.compose, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/StatusLoadingIndicator.kt` | 61 | `com.jtech.felizmusic.ui.component` | yes | 18 | 1 | androidx.compose, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/StatusStoryTopOverlay.kt` | 159 | `com.jtech.felizmusic.ui.component` | yes | 37 | 6 | androidx.compose, androidx.navigation, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/StatusVideoSurface.kt` | 46 | `com.jtech.felizmusic.ui.component` | yes | 7 | 1 | android.view, androidx.compose, androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/SyncAccountWarning.kt` | 58 | `com.jtech.felizmusic.ui.component` | yes | 15 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/UpdateDownloadDialog.kt` | 129 | `com.jtech.felizmusic.ui.component` | yes | 20 | 7 | androidx.compose, java.io |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ZemerCuratedPlaylistCard.kt` | 82 | `com.jtech.felizmusic.ui.component` | yes | 8 | 7 | androidx.compose, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ZemerFab.kt` | 38 | `com.jtech.felizmusic.ui.component` | yes | 8 | 1 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/ZemerStationCard.kt` | 70 | `com.jtech.felizmusic.ui.component` | yes | 15 | 1 | androidx.compose, coil3.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/shimmer/BoxPlaceholder.kt` | 30 | `com.jtech.felizmusic.ui.component.shimmer` | yes | 9 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/shimmer/ButtonPlaceholder.kt` | 15 | `com.jtech.felizmusic.ui.component.shimmer` | yes | 5 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/shimmer/GridItemPlaceholder.kt` | 51 | `com.jtech.felizmusic.ui.component.shimmer` | yes | 14 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/shimmer/ListItemPlaceholder.kt` | 53 | `com.jtech.felizmusic.ui.component.shimmer` | yes | 18 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/shimmer/ShimmerHost.kt` | 76 | `com.jtech.felizmusic.ui.component.shimmer` | yes | 17 | 3 | androidx.compose, com.valentinilk |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/component/shimmer/TextPlaceholder.kt` | 33 | `com.jtech.felizmusic.ui.component.shimmer` | yes | 15 | 1 | androidx.compose, kotlin.random |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/AddToPlaylistDialog.kt` | 195 | `com.jtech.felizmusic.ui.menu` | yes | 36 | 10 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/AddToPlaylistDialogOnline.kt` | 207 | `com.jtech.felizmusic.ui.menu` | yes | 42 | 15 | androidx.compose, java.net, java.nio, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/AlbumMenu.kt` | 373 | `com.jtech.felizmusic.ui.menu` | yes | 63 | 21 | android.annotation, androidx.compose, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/ArtistMenu.kt` | 262 | `com.jtech.felizmusic.ui.menu` | yes | 55 | 9 | androidx.compose, coil3.compose, coil3.request, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/CustomThumbnailMenu.kt` | 63 | `com.jtech.felizmusic.ui.menu` | yes | 17 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/DownloadMenuItems.kt` | 71 | `com.jtech.felizmusic.ui.menu` | no | 12 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/ImportPlaylistDialog.kt` | 63 | `com.jtech.felizmusic.ui.menu` | yes | 18 | 7 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/LibraryMenuItems.kt` | 34 | `com.jtech.felizmusic.ui.menu` | no | 9 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/LoadingScreen.kt` | 23 | `com.jtech.felizmusic.ui.menu` | yes | 6 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/LyricsMenu.kt` | 372 | `com.jtech.felizmusic.ui.menu` | yes | 58 | 16 | android.app, android.content, androidx.compose, androidx.hilt |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/PlayerMenu.kt` | 531 | `com.jtech.felizmusic.ui.menu` | yes | 78 | 34 | android.content, android.media, androidx.activity, androidx.annotation, androidx.compose, androidx.media3, androidx.navigation, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/PlaylistMenu.kt` | 232 | `com.jtech.felizmusic.ui.menu` | yes | 50 | 12 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/PodcastChannelMenu.kt` | 184 | `com.jtech.felizmusic.ui.menu` | yes | 42 | 7 | androidx.compose, androidx.navigation, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/ReportContentDialog.kt` | 130 | `com.jtech.felizmusic.ui.menu` | yes | 31 | 8 | androidx.compose, androidx.hilt, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/SavedStatusMenu.kt` | 113 | `com.jtech.felizmusic.ui.menu` | yes | 32 | 1 | androidx.compose, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/SelectionSongsMenu.kt` | 604 | `com.jtech.felizmusic.ui.menu` | yes | 52 | 43 | android.annotation, androidx.compose, androidx.media3, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/SongMenu.kt` | 561 | `com.jtech.felizmusic.ui.menu` | yes | 80 | 38 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/VideoQualityMenu.kt` | 72 | `com.jtech.felizmusic.ui.menu` | yes | 15 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/ViewCollectionMenuItem.kt` | 56 | `com.jtech.felizmusic.ui.menu` | no | 12 | 2 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/YouTubeAlbumMenu.kt` | 358 | `com.jtech.felizmusic.ui.menu` | yes | 64 | 20 | android.annotation, androidx.compose, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/YouTubeArtistMenu.kt` | 204 | `com.jtech.felizmusic.ui.menu` | yes | 41 | 7 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/YouTubeItemMenu.kt` | 64 | `com.jtech.felizmusic.ui.menu` | yes | 9 | 1 | androidx.compose, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/YouTubePlaylistMenu.kt` | 490 | `com.jtech.felizmusic.ui.menu` | yes | 78 | 23 | android.annotation, androidx.compose, coil3.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/menu/YouTubeSongMenu.kt` | 509 | `com.jtech.felizmusic.ui.menu` | yes | 83 | 32 | android.annotation, androidx.compose, androidx.navigation, coil3.compose, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/CastBottomSheet.kt` | 468 | `com.jtech.felizmusic.ui.player` | yes | 53 | 35 | android.content, androidx.compose, kotlinx.coroutines, org.fcast |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/CastButton.kt` | 93 | `com.jtech.felizmusic.ui.player` | yes | 26 | 12 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/EpisodeSpeed.kt` | 35 | `com.jtech.felizmusic.ui.player` | no | 1 | 7 | kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/LyricsScreen.kt` | 751 | `com.jtech.felizmusic.ui.player` | yes | 92 | 30 | android.app, android.content, android.view, androidx.activity, androidx.compose, androidx.media3, androidx.navigation, coil3.compose, dagger.hilt, kotlinx.coroutines, me.saket |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/MiniPlayer.kt` | 1107 | `com.jtech.felizmusic.ui.player` | yes | 98 | 111 | android.annotation, android.content, androidx.compose, androidx.media3, coil3.compose, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/OverMediaChrome.kt` | 36 | `com.jtech.felizmusic.ui.player` | yes | 9 | 5 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/PlaybackError.kt` | 45 | `com.jtech.felizmusic.ui.player` | yes | 15 | 1 | androidx.compose, androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/Player.kt` | 1550 | `com.jtech.felizmusic.ui.player` | yes | 154 | 110 | android.annotation, android.app, android.content, androidx.compose, androidx.core, androidx.media3, androidx.navigation, coil3.compose, coil3.request, kotlin.math, kotlinx.coroutines, me.saket |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/PlayerBackground.kt` | 116 | `com.jtech.felizmusic.ui.player` | yes | 19 | 11 | android.os, android.util, androidx.compose, androidx.palette, coil3.imageLoader, coil3.request, coil3.toBitmap, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/PlayerVideoFullscreen.kt` | 317 | `com.jtech.felizmusic.ui.player` | yes | 58 | 18 | android.app, android.content, androidx.activity, androidx.compose, androidx.core, androidx.media3, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/PlayerVideoSurface.kt` | 128 | `com.jtech.felizmusic.ui.player` | yes | 30 | 12 | android.view, androidx.compose, androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/Queue.kt` | 1143 | `com.jtech.felizmusic.ui.player` | yes | 122 | 52 | android.annotation, androidx.activity, androidx.compose, androidx.media3, androidx.navigation, kotlin.math, kotlinx.coroutines, sh.calvin |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/StationLiveBar.kt` | 70 | `com.jtech.felizmusic.ui.player` | yes | 17 | 2 | androidx.compose, androidx.media3 |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/Thumbnail.kt` | 577 | `com.jtech.felizmusic.ui.player` | yes | 80 | 61 | androidx.compose, androidx.media3, coil3.compose, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/VideoModePill.kt` | 139 | `com.jtech.felizmusic.ui.player` | yes | 30 | 7 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/player/VideoQualitySelector.kt` | 104 | `com.jtech.felizmusic.ui.player` | yes | 27 | 3 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/AccountScreen.kt` | 194 | `com.jtech.felizmusic.ui.screens` | yes | 41 | 8 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/AlbumScreen.kt` | 542 | `com.jtech.felizmusic.ui.screens` | yes | 102 | 39 | androidx.activity, androidx.compose, androidx.hilt, androidx.media3, androidx.navigation, coil3.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/ChartsScreen.kt` | 327 | `com.jtech.felizmusic.ui.screens` | yes | 71 | 17 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/GenreScreen.kt` | 500 | `com.jtech.felizmusic.ui.screens` | yes | 90 | 22 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/GenreSectionScreen.kt` | 100 | `com.jtech.felizmusic.ui.screens` | yes | 29 | 3 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/GenresScreen.kt` | 167 | `com.jtech.felizmusic.ui.screens` | yes | 40 | 5 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HistoryScreen.kt` | 504 | `com.jtech.felizmusic.ui.screens` | yes | 78 | 30 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HomeContentTab.kt` | 23 | `com.jtech.felizmusic.ui.screens` | no | 0 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HomeContinueListeningRow.kt` | 107 | `com.jtech.felizmusic.ui.screens` | yes | 33 | 4 | androidx.compose, coil3.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HomeGenresRow.kt` | 118 | `com.jtech.felizmusic.ui.screens` | yes | 31 | 8 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HomeScreen.kt` | 1517 | `com.jtech.felizmusic.ui.screens` | yes | 143 | 103 | android.net, androidx.annotation, androidx.compose, androidx.datastore, androidx.hilt, androidx.lifecycle, androidx.navigation, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HomeSeeAllScreen.kt` | 369 | `com.jtech.felizmusic.ui.screens` | yes | 68 | 31 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/HomeStatusesRow.kt` | 58 | `com.jtech.felizmusic.ui.screens` | yes | 18 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/KidZoneScreen.kt` | 234 | `com.jtech.felizmusic.ui.screens` | yes | 44 | 18 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/LatestReleasesScreen.kt` | 108 | `com.jtech.felizmusic.ui.screens` | yes | 34 | 9 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/LoadingScreen.kt` | 144 | `com.jtech.felizmusic.ui.screens` | yes | 36 | 9 | android.graphics, androidx.compose, androidx.lifecycle, com.airbnb |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/LoginCapture.kt` | 39 | `com.jtech.felizmusic.ui.screens` | no | 0 | 7 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/LoginGateScreen.kt` | 275 | `com.jtech.felizmusic.ui.screens` | yes | 56 | 23 | androidx.compose, androidx.datastore, androidx.navigation, io.ktor, kotlinx.coroutines, kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/LoginScreen.kt` | 244 | `com.jtech.felizmusic.ui.screens` | yes | 40 | 20 | android.annotation, android.content, android.webkit, androidx.activity, androidx.compose, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/NavigationBuilder.kt` | 514 | `com.jtech.felizmusic.ui.screens` | no | 53 | 8 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/NewReleaseScreen.kt` | 252 | `com.jtech.felizmusic.ui.screens` | yes | 47 | 12 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/OnboardingScreen.kt` | 89 | `com.jtech.felizmusic.ui.screens` | yes | 22 | 8 | android.content, androidx.compose, androidx.hilt |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/PodcastGenreScreen.kt` | 151 | `com.jtech.felizmusic.ui.screens` | yes | 39 | 6 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/PodcastGenresScreen.kt` | 158 | `com.jtech.felizmusic.ui.screens` | yes | 40 | 4 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/Screens.kt` | 62 | `com.jtech.felizmusic.ui.screens` | no | 4 | 12 | androidx.annotation, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/SplashScreen.kt` | 166 | `com.jtech.felizmusic.ui.screens` | yes | 42 | 5 | android.graphics, androidx.compose, com.airbnb |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/StatsScreen.kt` | 411 | `com.jtech.felizmusic.ui.screens` | yes | 57 | 33 | androidx.compose, androidx.hilt, androidx.navigation, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/WhitelistedArtistsScreen.kt` | 397 | `com.jtech.felizmusic.ui.screens` | yes | 76 | 33 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/WhitelistedPodcastsScreen.kt` | 585 | `com.jtech.felizmusic.ui.screens` | yes | 89 | 34 | androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/ZemerPlaylistsScreen.kt` | 72 | `com.jtech.felizmusic.ui.screens` | yes | 26 | 2 | android.net, androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/artist/ArtistAlbumsScreen.kt` | 144 | `com.jtech.felizmusic.ui.screens.artist` | yes | 48 | 13 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/artist/ArtistScreen.kt` | 912 | `com.jtech.felizmusic.ui.screens.artist` | yes | 129 | 47 | androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, com.valentinilk |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/artist/ArtistSectionScreen.kt` | 362 | `com.jtech.felizmusic.ui.screens.artist` | yes | 61 | 31 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/artist/ArtistSongsScreen.kt` | 197 | `com.jtech.felizmusic.ui.screens.artist` | yes | 51 | 14 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryAlbumsScreen.kt` | 327 | `com.jtech.felizmusic.ui.screens.library` | yes | 67 | 24 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryArtistsScreen.kt` | 302 | `com.jtech.felizmusic.ui.screens.library` | yes | 65 | 18 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryMixScreen.kt` | 785 | `com.jtech.felizmusic.ui.screens.library` | yes | 99 | 38 | androidx.compose, androidx.hilt, androidx.navigation, java.text, java.time, java.util, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryPlaylistsScreen.kt` | 543 | `com.jtech.felizmusic.ui.screens.library` | yes | 76 | 31 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryPodcastsScreen.kt` | 660 | `com.jtech.felizmusic.ui.screens.library` | yes | 83 | 32 | androidx.compose, androidx.hilt, androidx.lifecycle, androidx.navigation, coil3.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryScreen.kt` | 103 | `com.jtech.felizmusic.ui.screens.library` | yes | 17 | 8 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibrarySongsScreen.kt` | 327 | `com.jtech.felizmusic.ui.screens.library` | yes | 70 | 22 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/library/LibraryVideosScreen.kt` | 155 | `com.jtech.felizmusic.ui.screens.library` | yes | 40 | 9 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/BottomNavSetupScreen.kt` | 118 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 30 | 4 | android.content, androidx.compose, androidx.core, androidx.datastore |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/ContentFiltersScreen.kt` | 414 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 58 | 27 | androidx.activity, androidx.compose, androidx.datastore, androidx.hilt, com.google, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/DensityScreen.kt` | 294 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 43 | 18 | android.content, androidx.compose, androidx.core, androidx.datastore |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/OnboardingConnectivity.kt` | 44 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 11 | 8 | androidx.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/OnboardingNavigation.kt` | 39 | `com.jtech.felizmusic.ui.screens.onboarding` | no | 0 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/OnboardingSearchBackupScreen.kt` | 100 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 25 | 2 | androidx.compose, androidx.hilt |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/PermissionsScreen.kt` | 350 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 46 | 27 | android.Manifest, android.annotation, android.content, android.net, android.os, android.provider, androidx.activity, androidx.compose, androidx.core, androidx.lifecycle, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/onboarding/WelcomeScreen.kt` | 220 | `com.jtech.felizmusic.ui.screens.onboarding` | yes | 43 | 10 | android.graphics, androidx.compose, com.airbnb |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/AutoPlaylistScreen.kt` | 576 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 104 | 33 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/CachePlaylistScreen.kt` | 442 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 88 | 23 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, java.time |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/DownloadedContentScreen.kt` | 129 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 31 | 9 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/DownloadedVideosScreen.kt` | 481 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 93 | 26 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, coil3.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/LocalPlaylistScreen.kt` | 1396 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 159 | 86 | android.annotation, android.content, android.graphics, android.net, androidx.activity, androidx.compose, androidx.core, androidx.hilt, androidx.lifecycle, androidx.navigation, coil3.compose, coil3.request, com.yalantis, io.ktor, java.time, kotlinx.coroutines, sh.calvin |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/OnlinePlaylistScreen.kt` | 657 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 110 | 29 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/PlaylistDetailShared.kt` | 120 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 29 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/PlaylistHeaderCover.kt` | 16 | `com.jtech.felizmusic.ui.screens.playlist` | no | 0 | 0 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/TopPlaylistScreen.kt` | 531 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 97 | 27 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/playlist/ZemerCuratedPlaylistScreen.kt` | 474 | `com.jtech.felizmusic.ui.screens.playlist` | yes | 85 | 24 | androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/podcast/OnlinePodcastScreen.kt` | 496 | `com.jtech.felizmusic.ui.screens.podcast` | yes | 95 | 17 | androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, coil3.request, coil3.size, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/recognition/RecognitionHistoryScreen.kt` | 186 | `com.jtech.felizmusic.ui.screens.recognition` | yes | 53 | 5 | androidx.compose, androidx.hilt, androidx.navigation, coil3.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/recognition/RecognizeMusicDialogActivity.kt` | 335 | `com.jtech.felizmusic.ui.screens.recognition` | yes | 64 | 19 | android.content, android.os, androidx.activity, androidx.compose, androidx.core, androidx.hilt, coil3.compose, dagger.hilt |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/search/OnlineSearchResult.kt` | 522 | `com.jtech.felizmusic.ui.screens.search` | yes | 90 | 36 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/search/OnlineSearchScreen.kt` | 531 | `com.jtech.felizmusic.ui.screens.search` | yes | 99 | 28 | androidx.compose, androidx.hilt, androidx.navigation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/search/SearchFilterPolicy.kt` | 26 | `com.jtech.felizmusic.ui.screens.search` | no | 6 | 2 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/AboutScreen.kt` | 455 | `com.jtech.felizmusic.ui.screens.settings` | yes | 64 | 29 | androidx.annotation, androidx.compose, androidx.navigation, coil3.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/AccountSettings.kt` | 518 | `com.jtech.felizmusic.ui.screens.settings` | yes | 78 | 46 | androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, io.ktor, kotlinx.coroutines, kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/AndroidAutoSettings.kt` | 273 | `com.jtech.felizmusic.ui.screens.settings` | yes | 53 | 29 | androidx.compose, androidx.lifecycle, androidx.navigation, kotlinx.coroutines, sh.calvin |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/AppearanceSettings.kt` | 1115 | `com.jtech.felizmusic.ui.screens.settings` | yes | 128 | 101 | android.annotation, android.content, androidx.compose, androidx.core, androidx.navigation, kotlin.math, kotlinx.coroutines, me.saket |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/BackupAndRestore.kt` | 203 | `com.jtech.felizmusic.ui.screens.settings` | yes | 48 | 16 | androidx.activity, androidx.compose, androidx.hilt, androidx.navigation, java.time, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/ButtonSetupScreen.kt` | 374 | `com.jtech.felizmusic.ui.screens.settings` | yes | 58 | 17 | android.view, androidx.activity, androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/ContentSettings.kt` | 733 | `com.jtech.felizmusic.ui.screens.settings` | yes | 95 | 68 | android.content, android.os, android.provider, androidx.activity, androidx.compose, androidx.core, androidx.hilt, androidx.navigation, com.google, dagger.hilt, java.text, java.util, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/GeneralSettings.kt` | 85 | `com.jtech.felizmusic.ui.screens.settings` | yes | 31 | 4 | android.content, android.net, android.os, android.provider, androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/LogViewerScreen.kt` | 378 | `com.jtech.felizmusic.ui.screens.settings` | yes | 73 | 30 | androidx.compose, androidx.navigation, java.text, java.time, java.util, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/OfflineSearchSettings.kt` | 140 | `com.jtech.felizmusic.ui.screens.settings` | yes | 41 | 9 | android.text, androidx.compose, androidx.hilt, androidx.lifecycle, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/PlayerSettings.kt` | 342 | `com.jtech.felizmusic.ui.screens.settings` | yes | 58 | 35 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/PrivacySettings.kt` | 221 | `com.jtech.felizmusic.ui.screens.settings` | yes | 45 | 12 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/SettingsScreen.kt` | 267 | `com.jtech.felizmusic.ui.screens.settings` | yes | 38 | 21 | android.os, androidx.compose, androidx.navigation, com.google |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/StorageSettings.kt` | 468 | `com.jtech.felizmusic.ui.screens.settings` | yes | 71 | 36 | android.annotation, android.content, android.net, android.provider, androidx.activity, androidx.compose, androidx.navigation, coil3.annotation, coil3.imageLoader, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/StreamSourceSettings.kt` | 259 | `com.jtech.felizmusic.ui.screens.settings` | yes | 55 | 20 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/ThemeScreen.kt` | 593 | `com.jtech.felizmusic.ui.screens.settings` | yes | 90 | 42 | android.os, androidx.compose, androidx.navigation, com.materialkolor |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/UpdaterSettings.kt` | 408 | `com.jtech.felizmusic.ui.screens.settings` | yes | 66 | 27 | android.content, androidx.compose, androidx.navigation, java.io, kotlinx.coroutines, rikka.shizuku, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/settings/integrations/IntegrationScreen.kt` | 40 | `com.jtech.felizmusic.ui.screens.settings.integrations` | yes | 17 | 1 | androidx.compose, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/statuses/SavedStatusScreen.kt` | 353 | `com.jtech.felizmusic.ui.screens.statuses` | yes | 62 | 38 | androidx.activity, androidx.compose, androidx.core, androidx.hilt, androidx.lifecycle, androidx.media3, androidx.navigation, coil3.compose, coil3.request, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/statuses/StatusDownloadsScreen.kt` | 439 | `com.jtech.felizmusic.ui.screens.statuses` | yes | 85 | 25 | androidx.annotation, androidx.compose, androidx.hilt, androidx.navigation, coil3.compose, coil3.request |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/statuses/StatusesScreen.kt` | 140 | `com.jtech.felizmusic.ui.screens.statuses` | yes | 43 | 11 | androidx.compose, androidx.hilt, androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/screens/statuses/StoryScreen.kt` | 925 | `com.jtech.felizmusic.ui.screens.statuses` | yes | 120 | 119 | androidx.activity, androidx.compose, androidx.hilt, androidx.lifecycle, androidx.media3, androidx.navigation, coil3.compose, coil3.imageLoader, coil3.request, java.time, java.util, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/ChartColors.kt` | 30 | `com.jtech.felizmusic.ui.theme` | yes | 4 | 3 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/LogColors.kt` | 26 | `com.jtech.felizmusic.ui.theme` | yes | 5 | 2 | android.util, androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/PlayerColorExtractor.kt` | 159 | `com.jtech.felizmusic.ui.theme` | no | 5 | 42 | androidx.compose, androidx.palette, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/PlayerSliderColors.kt` | 129 | `com.jtech.felizmusic.ui.theme` | yes | 6 | 7 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/Theme.kt` | 177 | `com.jtech.felizmusic.ui.theme` | yes | 27 | 27 | android.graphics, android.os, androidx.compose, androidx.palette, com.materialkolor |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/ThemePalettes.kt` | 109 | `com.jtech.felizmusic.ui.theme` | no | 2 | 19 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/theme/Type.kt` | 131 | `com.jtech.felizmusic.ui.theme` | no | 7 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/ActiveRowTap.kt` | 21 | `com.jtech.felizmusic.ui.utils` | no | 0 | 1 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/AppBar.kt` | 75 | `com.jtech.felizmusic.ui.utils` | yes | 14 | 10 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/AppNavigation.kt` | 62 | `com.jtech.felizmusic.ui.utils` | no | 1 | 8 | androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/CubeFace.kt` | 19 | `com.jtech.felizmusic.ui.utils` | no | 4 | 2 | androidx.compose, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/FadingEdge.kt` | 89 | `com.jtech.felizmusic.ui.utils` | no | 7 | 2 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/ForceLightStatusBarIcons.kt` | 42 | `com.jtech.felizmusic.ui.utils` | yes | 11 | 6 | android.app, androidx.compose, androidx.core |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/HomeTitleEasterEgg.kt` | 51 | `com.jtech.felizmusic.ui.utils` | no | 11 | 7 | kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/ItemWrapper.kt` | 15 | `com.jtech.felizmusic.ui.utils` | no | 1 | 4 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/LazyGridSnapLayoutInfoProvider.kt` | 66 | `com.jtech.felizmusic.ui.utils` | no | 6 | 14 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/MediaViewerEffects.kt` | 27 | `com.jtech.felizmusic.ui.utils` | yes | 3 | 4 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/NavControllerUtils.kt` | 14 | `com.jtech.felizmusic.ui.utils` | no | 2 | 2 | androidx.navigation |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/ScrollUtils.kt` | 59 | `com.jtech.felizmusic.ui.utils` | yes | 9 | 8 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/SeeAll.kt` | 22 | `com.jtech.felizmusic.ui.utils` | no | 0 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/ShapeUtils.kt` | 8 | `com.jtech.felizmusic.ui.utils` | no | 3 | 1 | androidx.compose |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/ShowMediaInfo.kt` | 224 | `com.jtech.felizmusic.ui.utils` | yes | 52 | 20 | android.text, androidx.annotation, androidx.compose, com.zemer |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/StatusNavigation.kt` | 17 | `com.jtech.felizmusic.ui.utils` | no | 0 | 2 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/StringUtils.kt` | 34 | `com.jtech.felizmusic.ui.utils` | no | 2 | 5 | java.text, kotlin.math |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/VideoThumbnail.kt` | 45 | `com.jtech.felizmusic.ui.utils` | yes | 9 | 6 | android.graphics, android.media, android.util, androidx.compose, androidx.core, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/ui/utils/YouTubeUtils.kt` | 40 | `com.jtech.felizmusic.ui.utils` | no | 0 | 7 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/AccessibilityUtils.kt` | 91 | `com.jtech.felizmusic.utils` | yes | 19 | 18 | android.content, android.database, android.net, android.os, android.provider, android.text, androidx.compose, androidx.lifecycle |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ArtistThumbResolver.kt` | 88 | `com.jtech.felizmusic.utils` | no | 11 | 12 | javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/BlockedIdsCache.kt` | 61 | `com.jtech.felizmusic.utils` | no | 0 | 9 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/BottomNavItems.kt` | 19 | `com.jtech.felizmusic.utils` | no | 0 | 2 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ButtonInputCapture.kt` | 40 | `com.jtech.felizmusic.utils` | no | 5 | 10 | android.view, java.util, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ButtonMapperBridge.kt` | 35 | `com.jtech.felizmusic.utils` | no | 5 | 8 | android.view, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/CoilBitmapLoader.kt` | 54 | `com.jtech.felizmusic.utils` | no | 15 | 8 | android.content, android.graphics, android.net, androidx.core, androidx.media3, coil3.imageLoader, coil3.request, coil3.toBitmap, com.google, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ComposeDebugUtils.kt` | 99 | `com.jtech.felizmusic.utils` | no | 18 | 15 | androidx.compose, kotlin.math, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ComposeToImage.kt` | 263 | `com.jtech.felizmusic.utils` | no | 32 | 63 | android.annotation, android.content, android.graphics, android.net, android.os, android.provider, android.text, androidx.core, coil3.imageLoader, coil3.request, coil3.toBitmap, java.io, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ContentFilterConfig.kt` | 112 | `com.jtech.felizmusic.utils` | no | 0 | 19 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/CoverArtEmbedder.kt` | 170 | `com.jtech.felizmusic.utils` | no | 9 | 22 | android.content, android.util, java.io, kotlinx.coroutines, okhttp3.OkHttpClient, okhttp3.Request |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/CoverArtNative.kt` | 47 | `com.jtech.felizmusic.utils` | no | 0 | 3 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/CrashReportingTree.kt` | 35 | `com.jtech.felizmusic.utils` | no | 2 | 6 | android.util, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/DataStore.kt` | 193 | `com.jtech.felizmusic.utils` | yes | 21 | 13 | android.content, androidx.compose, androidx.datastore, kotlin.properties, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/DeviceIdGenerator.kt` | 198 | `com.jtech.felizmusic.utils` | no | 15 | 30 | android.content, android.os, android.provider, android.util, androidx.datastore, dagger.hilt, java.util, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/EnvironmentPaths.kt` | 25 | `com.jtech.felizmusic.utils` | no | 4 | 6 | android.net, android.os, android.provider, java.io |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/FirestoreUtils.kt` | 41 | `com.jtech.felizmusic.utils` | no | 0 | 2 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/FutureUtils.kt` | 43 | `com.jtech.felizmusic.utils` | no | 8 | 3 | androidx.concurrent, com.google, java.util, kotlin.coroutines, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/IsraeliArtistRegistry.kt` | 56 | `com.jtech.felizmusic.utils` | no | 5 | 7 | com.google, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/LogBufferTree.kt` | 71 | `com.jtech.felizmusic.utils` | no | 5 | 15 | android.util, java.util, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/LogExport.kt` | 113 | `com.jtech.felizmusic.utils` | no | 11 | 19 | android.content, androidx.core, java.io, java.text, java.time, java.util |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/MediaStoreHelper.kt` | 688 | `com.jtech.felizmusic.utils` | no | 17 | 83 | android.content, android.net, android.os, android.provider, androidx.documentfile, java.io, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/NetworkConnectivityObserver.kt` | 88 | `com.jtech.felizmusic.utils` | no | 7 | 16 | android.content, android.net, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/NewEpisodesFeed.kt` | 47 | `com.jtech.felizmusic.utils` | no | 11 | 9 | android.content, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/NotificationUtils.kt` | 35 | `com.jtech.felizmusic.utils` | no | 6 | 2 | android.Manifest, android.content, android.os, androidx.core |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/PermissionHelper.kt` | 247 | `com.jtech.felizmusic.utils` | no | 10 | 19 | android.Manifest, android.app, android.content, android.os, androidx.activity, androidx.core, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/PlaylistRemoteEdits.kt` | 49 | `com.jtech.felizmusic.utils` | no | 2 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/PodcastLibrarySources.kt` | 78 | `com.jtech.felizmusic.utils` | no | 8 | 8 | kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/PodcastWhitelistCache.kt` | 35 | `com.jtech.felizmusic.utils` | no | 1 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/RankedContentGate.kt` | 32 | `com.jtech.felizmusic.utils` | no | 0 | 6 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/StringUtils.kt` | 31 | `com.jtech.felizmusic.utils` | no | 2 | 8 | java.math, java.security |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/SyncUtils.kt` | 1143 | `com.jtech.felizmusic.utils` | no | 48 | 144 | android.content, android.util, androidx.datastore, dagger.hilt, java.time, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/UpdateChecker.kt` | 274 | `com.jtech.felizmusic.utils` | no | 20 | 68 | android.content, android.net, io.ktor, java.io, kotlinx.coroutines, kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/Updater.kt` | 59 | `com.jtech.felizmusic.utils` | no | 5 | 20 | io.ktor, org.json |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/UrlValidator.kt` | 109 | `com.jtech.felizmusic.utils` | no | 2 | 12 | okhttp3.HttpUrl |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/Utils.kt` | 30 | `com.jtech.felizmusic.utils` | no | 4 | 3 | android.content, java.util, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/VideoLinkBuilder.kt` | 36 | `com.jtech.felizmusic.utils` | no | 0 | 8 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/VideoMuxer.kt` | 138 | `com.jtech.felizmusic.utils` | no | 7 | 22 | android.media, java.io, java.nio, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/WhitelistCache.kt` | 40 | `com.jtech.felizmusic.utils` | no | 1 | 9 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/WhitelistFetcher.kt` | 226 | `com.jtech.felizmusic.utils` | no | 7 | 50 | com.google, java.time, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/WhitelistFilter.kt` | 366 | `com.jtech.felizmusic.utils` | no | 10 | 44 | java.util, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/YTPlayerUtils.kt` | 822 | `com.jtech.felizmusic.utils` | no | 36 | 102 | android.net, androidx.core, androidx.media3, com.zemer, kotlinx.coroutines, okhttp3.OkHttpClient, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/ZemerContentClient.kt` | 251 | `com.jtech.felizmusic.utils` | no | 21 | 62 | io.ktor, java.io, kotlinx.serialization, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/sabr/EjsNTransformSolver.kt` | 307 | `com.jtech.felizmusic.utils.sabr` | no | 17 | 37 | android.content, android.net, android.webkit, com.zemer, java.io, kotlin.coroutines, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/sabr/SabrException.kt` | 3 | `com.jtech.felizmusic.utils.sabr` | no | 0 | 1 |  |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/updater/ApkInstallController.kt` | 102 | `com.jtech.felizmusic.utils.updater` | yes | 15 | 15 | androidx.activity, androidx.compose, java.io, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/updater/AppInstaller.kt` | 267 | `com.jtech.felizmusic.utils.updater` | no | 28 | 41 | android.app, android.content, android.net, android.os, android.provider, androidx.core, com.topjohnwu, dev.rikka, java.io, kotlinx.coroutines, org.lsposed, rikka.shizuku, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/updater/AppRestarter.kt` | 30 | `com.jtech.felizmusic.utils.updater` | no | 1 | 4 | android.content |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/updater/InstallReceiver.kt` | 66 | `com.jtech.felizmusic.utils.updater` | no | 10 | 7 | android.content, android.os, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/updater/Installer.kt` | 24 | `com.jtech.felizmusic.utils.updater` | no | 2 | 4 | androidx.annotation |
| `app/src/main/kotlin/com/jtech/felizmusic/utils/updater/NightlyUpdates.kt` | 107 | `com.jtech.felizmusic.utils.updater` | no | 7 | 29 | java.io, java.util, kotlinx.serialization |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/AccountSettingsViewModel.kt` | 42 | `com.jtech.felizmusic.viewmodels` | no | 9 | 4 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/AccountViewModel.kt` | 81 | `com.jtech.felizmusic.viewmodels` | no | 15 | 11 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/AlbumViewModel.kt` | 149 | `com.jtech.felizmusic.viewmodels` | no | 18 | 15 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ArtistAlbumsViewModel.kt` | 25 | `com.jtech.felizmusic.viewmodels` | no | 8 | 4 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ArtistViewModel.kt` | 240 | `com.jtech.felizmusic.viewmodels` | no | 32 | 30 | android.content, androidx.compose, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/AutoPlaylistViewModel.kt` | 83 | `com.jtech.felizmusic.viewmodels` | no | 24 | 11 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/BackupRestoreViewModel.kt` | 189 | `com.jtech.felizmusic.viewmodels` | no | 29 | 22 | android.content, android.net, androidx.lifecycle, dagger.hilt, java.io, java.util, javax.inject, kotlin.system, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ButtonSetupViewModel.kt` | 159 | `com.jtech.felizmusic.viewmodels` | no | 22 | 29 | android.content, android.view, androidx.datastore, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/CachePlaylistViewModel.kt` | 26 | `com.jtech.felizmusic.viewmodels` | no | 7 | 4 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ChartsViewModel.kt` | 87 | `com.jtech.felizmusic.viewmodels` | no | 17 | 14 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ContinueListeningViewModel.kt` | 38 | `com.jtech.felizmusic.viewmodels` | no | 12 | 2 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/DownloadedContentViewModel.kt` | 51 | `com.jtech.felizmusic.viewmodels` | no | 17 | 5 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/DownloadedVideosViewModel.kt` | 46 | `com.jtech.felizmusic.viewmodels` | no | 20 | 5 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/HistoryViewModel.kt` | 108 | `com.jtech.felizmusic.viewmodels` | no | 20 | 22 | androidx.lifecycle, dagger.hilt, java.time, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/HomeSeeAllStore.kt` | 131 | `com.jtech.felizmusic.viewmodels` | no | 14 | 38 | androidx.annotation, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/HomeViewModel.kt` | 982 | `com.jtech.felizmusic.viewmodels` | no | 57 | 197 | android.content, androidx.datastore, androidx.lifecycle, com.google, dagger.hilt, javax.inject, kotlin.random, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/KidZoneViewModel.kt` | 56 | `com.jtech.felizmusic.viewmodels` | no | 15 | 11 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/LatestReleasesViewModel.kt` | 74 | `com.jtech.felizmusic.viewmodels` | no | 18 | 12 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/LibraryVideosViewModel.kt` | 47 | `com.jtech.felizmusic.viewmodels` | no | 17 | 9 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/LibraryViewModels.kt` | 600 | `com.jtech.felizmusic.viewmodels` | no | 72 | 89 | android.content, androidx.lifecycle, dagger.hilt, java.time, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/LocalPlaylistViewModel.kt` | 93 | `com.jtech.felizmusic.viewmodels` | no | 25 | 7 | android.content, androidx.lifecycle, dagger.hilt, java.text, java.util, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/LyricsMenuViewModel.kt` | 100 | `com.jtech.felizmusic.viewmodels` | no | 22 | 16 | android.content, androidx.compose, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/NewReleaseViewModel.kt` | 110 | `com.jtech.felizmusic.viewmodels` | no | 20 | 19 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/OfflineSearchSettingsViewModel.kt` | 61 | `com.jtech.felizmusic.viewmodels` | no | 14 | 7 | android.content, androidx.datastore, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/OnboardingViewModel.kt` | 205 | `com.jtech.felizmusic.viewmodels` | no | 19 | 31 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/OnlinePlaylistViewModel.kt` | 203 | `com.jtech.felizmusic.viewmodels` | no | 28 | 33 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/OnlinePodcastViewModel.kt` | 184 | `com.jtech.felizmusic.viewmodels` | no | 33 | 27 | android.content, androidx.lifecycle, dagger.hilt, java.time, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/OnlineSearchSuggestionViewModel.kt` | 100 | `com.jtech.felizmusic.viewmodels` | no | 23 | 13 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/OnlineSearchViewModel.kt` | 265 | `com.jtech.felizmusic.viewmodels` | no | 35 | 31 | android.content, android.net, androidx.compose, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/PodcastGenreCatalogViewModel.kt` | 65 | `com.jtech.felizmusic.viewmodels` | no | 17 | 12 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/PodcastGenreViewModel.kt` | 71 | `com.jtech.felizmusic.viewmodels` | no | 17 | 15 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/PodcastGenresHomeViewModel.kt` | 57 | `com.jtech.felizmusic.viewmodels` | no | 18 | 9 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/PodcastHomeRowsViewModel.kt` | 74 | `com.jtech.felizmusic.viewmodels` | no | 20 | 13 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/PodcastSubscriptionsHomeViewModel.kt` | 81 | `com.jtech.felizmusic.viewmodels` | no | 18 | 7 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/RecognitionHistoryViewModel.kt` | 42 | `com.jtech.felizmusic.viewmodels` | no | 12 | 6 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/RecognizeMusicViewModel.kt` | 111 | `com.jtech.felizmusic.viewmodels` | no | 18 | 23 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ReportContentViewModel.kt` | 37 | `com.jtech.felizmusic.viewmodels` | no | 6 | 3 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/SavedStatusViewModel.kt` | 38 | `com.jtech.felizmusic.viewmodels` | no | 10 | 5 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/StatsViewModel.kt` | 175 | `com.jtech.felizmusic.viewmodels` | no | 20 | 9 | androidx.lifecycle, dagger.hilt, java.time, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/StatusDownloadsViewModel.kt` | 34 | `com.jtech.felizmusic.viewmodels` | no | 10 | 5 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/StoryViewModel.kt` | 120 | `com.jtech.felizmusic.viewmodels` | no | 25 | 17 | android.content, android.graphics, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/TopPlaylistViewModel.kt` | 38 | `com.jtech.felizmusic.viewmodels` | no | 14 | 4 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/VideoHomeRowsViewModel.kt` | 96 | `com.jtech.felizmusic.viewmodels` | no | 24 | 18 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/WhitelistedArtistsViewModel.kt` | 65 | `com.jtech.felizmusic.viewmodels` | no | 17 | 13 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines, timber.log |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/WhitelistedPodcastsViewModel.kt` | 83 | `com.jtech.felizmusic.viewmodels` | no | 19 | 16 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerCuratedPlaylistViewModel.kt` | 72 | `com.jtech.felizmusic.viewmodels` | no | 17 | 14 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerCuratedPlaylistsViewModel.kt` | 81 | `com.jtech.felizmusic.viewmodels` | no | 20 | 10 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerFlagRefetch.kt` | 29 | `com.jtech.felizmusic.viewmodels` | no | 8 | 1 | androidx.lifecycle, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerGenreCatalogViewModel.kt` | 69 | `com.jtech.felizmusic.viewmodels` | no | 18 | 12 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerGenreSectionViewModel.kt` | 96 | `com.jtech.felizmusic.viewmodels` | no | 18 | 21 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerGenreViewModel.kt` | 168 | `com.jtech.felizmusic.viewmodels` | no | 21 | 28 | android.content, androidx.lifecycle, coil3.imageLoader, coil3.request, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerGenresViewModel.kt` | 59 | `com.jtech.felizmusic.viewmodels` | no | 18 | 9 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerStationsViewModel.kt` | 47 | `com.jtech.felizmusic.viewmodels` | no | 13 | 7 | androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/viewmodels/ZemerStatusesViewModel.kt` | 63 | `com.jtech.felizmusic.viewmodels` | no | 18 | 6 | android.content, androidx.lifecycle, dagger.hilt, javax.inject, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/widget/MusicWidget.kt` | 391 | `com.jtech.felizmusic.widget` | no | 62 | 49 | android.content, android.graphics, androidx.compose, androidx.datastore, androidx.glance, coil3.SingletonImageLoader, coil3.request, coil3.toBitmap, java.io, kotlinx.coroutines |
| `app/src/main/kotlin/com/jtech/felizmusic/widget/WidgetLayout.kt` | 14 | `com.jtech.felizmusic.widget` | no | 0 | 3 |  |
| `app/src/test/kotlin/com/jtech/felizmusic/constants/PreferenceKeysTest.kt` | 26 | `com.jtech.felizmusic.constants` | no | 4 | 3 | androidx.datastore, java.lang, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/extensions/PlayerIconResTest.kt` | 42 | `com.jtech.felizmusic.extensions` | no | 4 | 2 | androidx.media3, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/latestreleases/LatestReleaseFilterTest.kt` | 46 | `com.jtech.felizmusic.latestreleases` | no | 2 | 11 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/latestreleases/LatestReleasePlaybackTest.kt` | 120 | `com.jtech.felizmusic.latestreleases` | no | 6 | 9 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/latestreleases/LatestReleasesStoreTest.kt` | 120 | `com.jtech.felizmusic.latestreleases` | no | 8 | 8 | java.io, java.nio, kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetDecoderTest.kt` | 148 | `com.jtech.felizmusic.offline` | no | 5 | 15 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetLiveWhitelistTest.kt` | 121 | `com.jtech.felizmusic.offline` | no | 6 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetNormalizeTest.kt` | 53 | `com.jtech.felizmusic.offline` | no | 2 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetPodcastReadTest.kt` | 164 | `com.jtech.felizmusic.offline` | no | 5 | 30 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetReadLayerTest.kt` | 176 | `com.jtech.felizmusic.offline` | no | 5 | 26 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetSearchTest.kt` | 160 | `com.jtech.felizmusic.offline` | no | 4 | 34 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetStoreStagingTest.kt` | 74 | `com.jtech.felizmusic.offline` | no | 6 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/offline/SubsetSyncTest.kt` | 72 | `com.jtech.felizmusic.offline` | no | 4 | 13 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/BlockedPodcastsQueueTest.kt` | 55 | `com.jtech.felizmusic.playback` | no | 6 | 4 | androidx.media3, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastAutoAdvanceTest.kt` | 184 | `com.jtech.felizmusic.playback` | no | 3 | 10 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastConnectTest.kt` | 134 | `com.jtech.felizmusic.playback` | no | 13 | 13 | java.net, kotlinx.coroutines, org.fcast, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastDeviceCatalogTest.kt` | 145 | `com.jtech.felizmusic.playback` | no | 8 | 20 | org.fcast, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastErrorRecoveryTest.kt` | 120 | `com.jtech.felizmusic.playback` | no | 4 | 5 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastIdleWatchdogTest.kt` | 65 | `com.jtech.felizmusic.playback` | no | 4 | 4 | org.fcast, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastNativeLibLoaderTest.kt` | 84 | `com.jtech.felizmusic.playback` | no | 5 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastPlaybackTest.kt` | 160 | `com.jtech.felizmusic.playback` | no | 6 | 1 | org.fcast, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastRelayProtocolTest.kt` | 125 | `com.jtech.felizmusic.playback` | no | 6 | 7 | java.net, java.security, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastStreamRelayTest.kt` | 330 | `com.jtech.felizmusic.playback` | no | 15 | 62 | java.io, java.net, java.nio, java.util, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/CastVolumeKeysTest.kt` | 93 | `com.jtech.felizmusic.playback` | no | 3 | 1 | android.view, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/DeferredStatsPushTest.kt` | 98 | `com.jtech.felizmusic.playback` | no | 4 | 8 | kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/DeferredStatsQueueTest.kt` | 209 | `com.jtech.felizmusic.playback` | no | 8 | 24 | java.io, kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/DeferredStatsRecordTest.kt` | 58 | `com.jtech.felizmusic.playback` | no | 5 | 4 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/DownloadCancellationContractTest.kt` | 75 | `com.jtech.felizmusic.playback` | no | 10 | 10 | java.util, kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/DownloadMenuLogicTest.kt` | 140 | `com.jtech.felizmusic.playback` | no | 3 | 21 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/DownloadStateResolverTest.kt` | 186 | `com.jtech.felizmusic.playback` | no | 6 | 38 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/EpisodeResumeTest.kt` | 48 | `com.jtech.felizmusic.playback` | no | 3 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/ListenAccumulatorTest.kt` | 68 | `com.jtech.felizmusic.playback` | no | 3 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/PlaybackNonceRegistryTest.kt` | 134 | `com.jtech.felizmusic.playback` | no | 5 | 28 | java.util, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/PlayerVideoUiLogicTest.kt` | 74 | `com.jtech.felizmusic.playback` | no | 3 | 3 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/QueueContinuationTest.kt` | 42 | `com.jtech.felizmusic.playback` | no | 4 | 7 | androidx.media3, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/RemoteVolumeTrackerTest.kt` | 57 | `com.jtech.felizmusic.playback` | no | 3 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/SeekMathTest.kt` | 35 | `com.jtech.felizmusic.playback` | no | 2 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/VideoAvailabilityCacheTest.kt` | 75 | `com.jtech.felizmusic.playback` | no | 4 | 11 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/VideoModeLogicTest.kt` | 254 | `com.jtech.felizmusic.playback` | no | 5 | 7 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/VideoQualityLogicTest.kt` | 221 | `com.jtech.felizmusic.playback` | no | 5 | 23 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/VideoRenditionTest.kt` | 87 | `com.jtech.felizmusic.playback` | no | 4 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/VideoSongIdsTest.kt` | 45 | `com.jtech.felizmusic.playback` | no | 4 | 4 | java.util, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/WatchTimeReporterTest.kt` | 181 | `com.jtech.felizmusic.playback` | no | 8 | 28 | kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/WatchTimeScheduleTest.kt` | 59 | `com.jtech.felizmusic.playback` | no | 2 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/WatchTimeSegmentsTest.kt` | 161 | `com.jtech.felizmusic.playback` | no | 5 | 18 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/relay/RelayDeviceIdTest.kt` | 82 | `com.jtech.felizmusic.playback.relay` | no | 6 | 4 | java.util, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/relay/RelayDownloadTest.kt` | 67 | `com.jtech.felizmusic.playback.relay` | no | 2 | 11 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/playback/relay/RelayStreamTest.kt` | 55 | `com.jtech.felizmusic.playback.relay` | no | 2 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/recognition/AudioResamplerTest.kt` | 59 | `com.jtech.felizmusic.recognition` | no | 6 | 15 | java.nio, kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/recognition/RecognitionHistoryFilterTest.kt` | 47 | `com.jtech.felizmusic.recognition` | no | 4 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/recognition/RecognitionHistoryPlaybackTest.kt` | 64 | `com.jtech.felizmusic.recognition` | no | 4 | 7 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/recognition/RecognitionMatchSelectorTest.kt` | 106 | `com.jtech.felizmusic.recognition` | no | 8 | 13 | kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/recognition/RecognitionMatcherTest.kt` | 72 | `com.jtech.felizmusic.recognition` | no | 4 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/recognition/ShazamSignatureGeneratorTest.kt` | 75 | `com.jtech.felizmusic.recognition` | no | 11 | 16 | java.nio, java.util, kotlin.math, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ChartMovementTest.kt` | 78 | `com.jtech.felizmusic.search` | no | 3 | 4 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/PodcastGenreSectionsTest.kt` | 64 | `com.jtech.felizmusic.search` | no | 4 | 9 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ResultDedupeTest.kt` | 86 | `com.jtech.felizmusic.search` | no | 7 | 18 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerCuratedPlaylistsTest.kt` | 187 | `com.jtech.felizmusic.search` | no | 8 | 15 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerGenresTest.kt` | 272 | `com.jtech.felizmusic.search` | no | 5 | 24 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerPodcastMapperTest.kt` | 177 | `com.jtech.felizmusic.search` | no | 14 | 19 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerResultMapperTest.kt` | 750 | `com.jtech.felizmusic.search` | no | 18 | 89 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerRoutesTest.kt` | 75 | `com.jtech.felizmusic.search` | no | 3 | 3 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerSearchJsonTest.kt` | 89 | `com.jtech.felizmusic.search` | no | 3 | 10 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerSearchParametersTest.kt` | 45 | `com.jtech.felizmusic.search` | no | 2 | 4 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerSearchRoutingTest.kt` | 81 | `com.jtech.felizmusic.search` | no | 8 | 8 | java.io, java.nio, kotlinx.coroutines, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/search/ZemerStationsTest.kt` | 127 | `com.jtech.felizmusic.search` | no | 5 | 11 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/StatusDownloadNamingTest.kt` | 39 | `com.jtech.felizmusic.statuses` | no | 3 | 2 | java.time, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/StatusDownloadTest.kt` | 40 | `com.jtech.felizmusic.statuses` | no | 4 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/StatusDownloadsViewTest.kt` | 40 | `com.jtech.felizmusic.statuses` | no | 2 | 3 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/StatusSourcesConfigTest.kt` | 156 | `com.jtech.felizmusic.statuses` | no | 5 | 19 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/StatusTimelineTest.kt` | 105 | `com.jtech.felizmusic.statuses` | no | 5 | 8 | java.time, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/StatusesApiTest.kt` | 208 | `com.jtech.felizmusic.statuses` | no | 6 | 28 | org.json, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/statuses/YidStatusApiTest.kt` | 81 | `com.jtech.felizmusic.statuses` | no | 5 | 11 | org.json, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/sync/ContentReportRepositoryTest.kt` | 81 | `com.jtech.felizmusic.sync` | no | 2 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/sync/PodcastSyncLogicTest.kt` | 171 | `com.jtech.felizmusic.sync` | no | 4 | 9 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/sync/models/DeviceContentFiltersTest.kt` | 78 | `com.jtech.felizmusic.sync.models` | no | 7 | 3 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/tracking/FlushScheduleTest.kt` | 57 | `com.jtech.felizmusic.tracking` | no | 2 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/tracking/LibraryActionBackfillTest.kt` | 101 | `com.jtech.felizmusic.tracking` | no | 9 | 10 | java.time, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/tracking/PlayHistoryBackfillTest.kt` | 102 | `com.jtech.felizmusic.tracking` | no | 7 | 11 | java.time, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/tracking/PlaySourceResolverTest.kt` | 95 | `com.jtech.felizmusic.tracking` | no | 2 | 9 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/tracking/TrackingEventsTest.kt` | 213 | `com.jtech.felizmusic.tracking` | no | 2 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/tracking/TrackingQueueTest.kt` | 100 | `com.jtech.felizmusic.tracking` | no | 5 | 13 | java.io, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/ActiveRowTapTest.kt` | 31 | `com.jtech.felizmusic.ui` | no | 4 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/HomeTitleEasterEggTest.kt` | 36 | `com.jtech.felizmusic.ui` | no | 5 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/component/AlphabetIndexTest.kt` | 28 | `com.jtech.felizmusic.ui.component` | no | 2 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/component/SettingsCardGroupTest.kt` | 20 | `com.jtech.felizmusic.ui.component` | no | 2 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/menu/DownloadMenuItemsTest.kt` | 71 | `com.jtech.felizmusic.ui.menu` | no | 5 | 33 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/menu/ViewCollectionMenuItemTest.kt` | 31 | `com.jtech.felizmusic.ui.menu` | no | 3 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/player/EpisodeSpeedTest.kt` | 47 | `com.jtech.felizmusic.ui.player` | no | 2 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/player/PlayerBackgroundTest.kt` | 53 | `com.jtech.felizmusic.ui.player` | no | 4 | 3 | androidx.compose, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/GenreScreenTest.kt` | 154 | `com.jtech.felizmusic.ui.screens` | no | 11 | 11 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/HomeContentTabTest.kt` | 49 | `com.jtech.felizmusic.ui.screens` | no | 4 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/LoginCaptureTest.kt` | 61 | `com.jtech.felizmusic.ui.screens` | no | 5 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/artist/ArtistSectionScreenTest.kt` | 36 | `com.jtech.felizmusic.ui.screens.artist` | no | 4 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/onboarding/OnboardingNavigationTest.kt` | 88 | `com.jtech.felizmusic.ui.screens.onboarding` | no | 2 | 12 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/playlist/PlaylistHeaderCoverTest.kt` | 23 | `com.jtech.felizmusic.ui.screens.playlist` | no | 3 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/playlist/ZemerCuratedPlaylistFilterTest.kt` | 73 | `com.jtech.felizmusic.ui.screens.playlist` | no | 7 | 4 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/screens/search/SearchFilterPolicyTest.kt` | 53 | `com.jtech.felizmusic.ui.screens.search` | no | 11 | 5 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/theme/ThemePaletteSelectionTest.kt` | 84 | `com.jtech.felizmusic.ui.theme` | no | 7 | 11 | androidx.compose, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/utils/AppNavigationTest.kt` | 91 | `com.jtech.felizmusic.ui.utils` | no | 3 | 12 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/utils/SeeAllTest.kt` | 39 | `com.jtech.felizmusic.ui.utils` | no | 6 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/utils/StatusNavigationTest.kt` | 17 | `com.jtech.felizmusic.ui.utils` | no | 2 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/utils/StringUtilsTest.kt` | 21 | `com.jtech.felizmusic.ui.utils` | no | 3 | 2 | java.util, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/ui/utils/YouTubeUtilsTest.kt` | 76 | `com.jtech.felizmusic.ui.utils` | no | 2 | 10 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/ArtistThumbResolverTest.kt` | 62 | `com.jtech.felizmusic.utils` | no | 5 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/BlockedIdsCacheTest.kt` | 53 | `com.jtech.felizmusic.utils` | no | 5 | 7 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/BottomNavItemsTest.kt` | 46 | `com.jtech.felizmusic.utils` | no | 2 | 8 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/CrashReportingTreeTest.kt` | 64 | `com.jtech.felizmusic.utils` | no | 6 | 6 | org.junit, timber.log |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/LogBufferTreeTest.kt` | 77 | `com.jtech.felizmusic.utils` | no | 6 | 7 | org.junit, timber.log |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/LogExportTest.kt` | 100 | `com.jtech.felizmusic.utils` | no | 6 | 21 | java.time, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/PlaylistRemoteEditsTest.kt` | 89 | `com.jtech.felizmusic.utils` | no | 8 | 6 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/PlaylistSongWhitelistTest.kt` | 52 | `com.jtech.felizmusic.utils` | no | 3 | 2 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/PodcastLibrarySourcesTest.kt` | 67 | `com.jtech.felizmusic.utils` | no | 4 | 4 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/PodcastWhitelistCacheTest.kt` | 35 | `com.jtech.felizmusic.utils` | no | 5 | 3 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/RankedContentGateTest.kt` | 59 | `com.jtech.felizmusic.utils` | no | 4 | 3 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/VideoLinkBuilderTest.kt` | 49 | `com.jtech.felizmusic.utils` | no | 2 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/ZemerContentClientTest.kt` | 97 | `com.jtech.felizmusic.utils` | no | 7 | 11 | kotlinx.coroutines, kotlinx.serialization, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/updater/InstallerTest.kt` | 43 | `com.jtech.felizmusic.utils.updater` | no | 3 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/utils/updater/NightlyUpdatesTest.kt` | 188 | `com.jtech.felizmusic.utils.updater` | no | 9 | 15 | java.util, org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/viewmodels/ArtistChannelEpisodesTest.kt` | 67 | `com.jtech.felizmusic.viewmodels` | no | 7 | 11 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/viewmodels/StaleAlbumDeleteTest.kt` | 29 | `com.jtech.felizmusic.viewmodels` | no | 3 | 1 | org.junit |
| `app/src/test/kotlin/com/jtech/felizmusic/widget/WidgetLayoutTest.kt` | 26 | `com.jtech.felizmusic.widget` | no | 3 | 1 | org.junit |

## `innertube` Kotlin files (96)

| File | Lines | Package | Compose | Imports | Decls | External import roots |
| --- | ---: | --- | --- | ---: | ---: | --- |
| `innertube/src/main/kotlin/com/metrolist/innertube/InnerTube.kt` | 765 | `com.metrolist.innertube` | no | 49 | 51 | io.ktor, java.net, java.util, kotlinx.serialization, okhttp3.ConnectionPool, okhttp3.Dispatcher |
| `innertube/src/main/kotlin/com/metrolist/innertube/YouTube.kt` | 1400 | `com.metrolist.innertube` | no | 67 | 206 | io.ktor, java.net, kotlin.random, kotlinx.coroutines, kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/AccountInfo.kt` | 8 | `com.metrolist.innertube.models` | no | 0 | 5 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/AutomixPreviewVideoRenderer.kt` | 18 | `com.metrolist.innertube.models` | no | 1 | 6 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Badges.kt` | 13 | `com.metrolist.innertube.models` | no | 1 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Button.kt` | 16 | `com.metrolist.innertube.models` | no | 1 | 7 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Context.kt` | 60 | `com.metrolist.innertube.models` | no | 1 | 27 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Continuation.kt` | 20 | `com.metrolist.innertube.models` | no | 3 | 5 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/ContinuationItemRenderer.kt` | 18 | `com.metrolist.innertube.models` | no | 1 | 6 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Endpoint.kt` | 120 | `com.metrolist.innertube.models` | no | 5 | 57 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/GridRenderer.kt` | 26 | `com.metrolist.innertube.models` | no | 1 | 11 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Icon.kt` | 8 | `com.metrolist.innertube.models` | no | 1 | 2 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MediaInfo.kt` | 15 | `com.metrolist.innertube.models` | no | 0 | 12 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Menu.kt` | 52 | `com.metrolist.innertube.models` | no | 1 | 26 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicCardShelfRenderer.kt` | 30 | `com.metrolist.innertube.models` | no | 1 | 15 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicCarouselShelfRenderer.kt` | 31 | `com.metrolist.innertube.models` | no | 1 | 16 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicDescriptionShelfRenderer.kt` | 11 | `com.metrolist.innertube.models` | no | 1 | 5 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicEditablePlaylistDetailHeaderRenderer.kt` | 35 | `com.metrolist.innertube.models` | no | 1 | 17 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicNavigationButtonRenderer.kt` | 21 | `com.metrolist.innertube.models` | no | 1 | 9 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicPlaylistShelfRenderer.kt` | 11 | `com.metrolist.innertube.models` | no | 1 | 5 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicQueueRenderer.kt` | 25 | `com.metrolist.innertube.models` | no | 1 | 10 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicResponsiveHeaderRenderer.kt` | 24 | `com.metrolist.innertube.models` | no | 1 | 12 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicResponsiveListItemRenderer.kt` | 124 | `com.metrolist.innertube.models` | no | 10 | 34 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicShelfRenderer.kt` | 28 | `com.metrolist.innertube.models` | no | 1 | 11 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/MusicTwoRowItemRenderer.kt` | 68 | `com.metrolist.innertube.models` | no | 7 | 14 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/NavigationEndpoint.kt` | 27 | `com.metrolist.innertube.models` | no | 1 | 10 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/PlaylistDeleteBody.kt` | 10 | `com.metrolist.innertube.models.body` | no | 2 | 3 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/PlaylistPanelRenderer.kt` | 24 | `com.metrolist.innertube.models` | no | 1 | 13 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/PlaylistPanelVideoRenderer.kt` | 19 | `com.metrolist.innertube.models` | no | 1 | 13 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/PlaylistPanelVideoWrapperRenderer.kt` | 31 | `com.metrolist.innertube.models` | no | 1 | 7 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/ResponseContext.kt` | 21 | `com.metrolist.innertube.models` | no | 1 | 9 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/ReturnYouTubeDislikeResponse.kt` | 14 | `com.metrolist.innertube.models` | no | 1 | 8 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Runs.kt` | 43 | `com.metrolist.innertube.models` | no | 1 | 10 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/SearchSuggestions.kt` | 6 | `com.metrolist.innertube.models` | no | 0 | 3 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/SearchSuggestionsSectionRenderer.kt` | 20 | `com.metrolist.innertube.models` | no | 1 | 8 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/SectionListRenderer.kt` | 73 | `com.metrolist.innertube.models` | no | 3 | 35 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/SubscriptionButton.kt` | 14 | `com.metrolist.innertube.models` | no | 1 | 5 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Tabs.kt` | 26 | `com.metrolist.innertube.models` | no | 1 | 11 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/ThumbnailRenderer.kt` | 29 | `com.metrolist.innertube.models` | no | 3 | 12 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/Thumbnails.kt` | 15 | `com.metrolist.innertube.models` | no | 1 | 6 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/TwoColumnBrowseResultsRenderer.kt` | 26 | `com.metrolist.innertube.models` | no | 1 | 11 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/YTItem.kt` | 149 | `com.metrolist.innertube.models` | no | 0 | 92 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/YouTubeClient.kt` | 182 | `com.metrolist.innertube.models` | no | 1 | 28 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/YouTubeDataPage.kt` | 183 | `com.metrolist.innertube.models` | no | 2 | 63 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/YouTubeLocale.kt` | 9 | `com.metrolist.innertube.models` | no | 1 | 3 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/AccountMenuBody.kt` | 11 | `com.metrolist.innertube.models.body` | no | 2 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/BrowseBody.kt` | 13 | `com.metrolist.innertube.models.body` | no | 3 | 5 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/CreatePlaylistBody.kt` | 18 | `com.metrolist.innertube.models.body` | no | 2 | 9 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/EditPlaylistBody.kt` | 79 | `com.metrolist.innertube.models.body` | no | 2 | 37 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/FeedbackBody.kt` | 12 | `com.metrolist.innertube.models.body` | no | 2 | 5 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/GetQueueBody.kt` | 11 | `com.metrolist.innertube.models.body` | no | 2 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/GetSearchSuggestionsBody.kt` | 10 | `com.metrolist.innertube.models.body` | no | 2 | 3 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/GetTranscriptBody.kt` | 10 | `com.metrolist.innertube.models.body` | no | 2 | 3 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/LikeBody.kt` | 18 | `com.metrolist.innertube.models.body` | no | 2 | 8 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/NextBody.kt` | 15 | `com.metrolist.innertube.models.body` | no | 2 | 8 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/PlayerBody.kt` | 30 | `com.metrolist.innertube.models.body` | no | 2 | 14 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/SearchBody.kt` | 11 | `com.metrolist.innertube.models.body` | no | 2 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/body/SubscribeBody.kt` | 11 | `com.metrolist.innertube.models.body` | no | 2 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/AccountMenuResponse.kt` | 53 | `com.metrolist.innertube.models.response` | no | 5 | 18 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/AddItemYouTubePlaylistResponse.kt` | 20 | `com.metrolist.innertube.models.response` | no | 1 | 8 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/BrowseResponse.kt` | 142 | `com.metrolist.innertube.models.response` | no | 14 | 72 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/ContinuationResponse.kt` | 20 | `com.metrolist.innertube.models.response` | no | 2 | 6 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/CreatePlaylistResponse.kt` | 8 | `com.metrolist.innertube.models.response` | no | 1 | 2 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/EditPlaylistResponse.kt` | 8 | `com.metrolist.innertube.models.response` | no | 1 | 2 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/FeedbackResponse.kt` | 13 | `com.metrolist.innertube.models.response` | no | 1 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/GetQueueResponse.kt` | 14 | `com.metrolist.innertube.models.response` | no | 2 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/GetSearchSuggestionsResponse.kt` | 14 | `com.metrolist.innertube.models.response` | no | 2 | 4 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/GetTranscriptResponse.kt` | 65 | `com.metrolist.innertube.models.response` | no | 1 | 26 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/ImageUploadResponse.kt` | 8 | `com.metrolist.innertube.models.response` | no | 1 | 2 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/NextResponse.kt` | 40 | `com.metrolist.innertube.models.response` | no | 5 | 15 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/PlayerResponse.kt` | 124 | `com.metrolist.innertube.models.response` | no | 4 | 66 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/models/response/SearchResponse.kt` | 33 | `com.metrolist.innertube.models.response` | no | 4 | 12 | kotlinx.serialization |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/AlbumPage.kt` | 61 | `com.metrolist.innertube.pages` | no | 6 | 4 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/ArtistItemsContinuationPage.kt` | 8 | `com.metrolist.innertube.pages` | no | 1 | 3 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/ArtistItemsPage.kt` | 122 | `com.metrolist.innertube.pages` | no | 11 | 6 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/ArtistPage.kt` | 228 | `com.metrolist.innertube.pages` | no | 19 | 14 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/BrowseResult.kt` | 31 | `com.metrolist.innertube.pages` | no | 2 | 7 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/ChartsPage.kt` | 18 | `com.metrolist.innertube.pages` | no | 1 | 8 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/HistoryPage.kt` | 68 | `com.metrolist.innertube.pages` | no | 8 | 7 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/HomePage.kt` | 166 | `com.metrolist.innertube.pages` | no | 13 | 23 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/LibraryContinuationPage.kt` | 8 | `com.metrolist.innertube.pages` | no | 1 | 3 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/LibraryPage.kt` | 171 | `com.metrolist.innertube.pages` | no | 13 | 7 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/NewPipe.kt` | 114 | `com.metrolist.innertube` | no | 16 | 20 | io.ktor, java.io, java.net, okhttp3.OkHttpClient, okhttp3.RequestBody, org.schabi |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/NewReleaseAlbumPage.kt` | 44 | `com.metrolist.innertube.pages` | no | 5 | 2 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/NextPage.kt` | 123 | `com.metrolist.innertube.pages` | no | 11 | 21 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/PageHelper.kt` | 38 | `com.metrolist.innertube.pages` | no | 3 | 8 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/PlaylistContinuationPage.kt` | 8 | `com.metrolist.innertube.pages` | no | 1 | 3 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/PlaylistPage.kt` | 52 | `com.metrolist.innertube.pages` | no | 7 | 6 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/PodcastPage.kt` | 15 | `com.metrolist.innertube.pages` | no | 2 | 4 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/RelatedPage.kt` | 163 | `com.metrolist.innertube.pages` | no | 10 | 7 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/SearchPage.kt` | 211 | `com.metrolist.innertube.pages` | no | 11 | 6 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/SearchSuggestionPage.kt` | 147 | `com.metrolist.innertube.pages` | no | 9 | 3 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/pages/SearchSummaryPage.kt` | 381 | `com.metrolist.innertube.pages` | no | 17 | 12 |  |
| `innertube/src/main/kotlin/com/metrolist/innertube/utils/ResilientDns.kt` | 84 | `com.metrolist.innertube.utils` | no | 5 | 10 | java.net, okhttp3.Dns, okhttp3.HttpUrl, okhttp3.OkHttpClient, okhttp3.dnsoverhttps |
| `innertube/src/main/kotlin/com/metrolist/innertube/utils/Utils.kt` | 95 | `com.metrolist.innertube.utils` | no | 4 | 23 | java.security |
| `innertube/src/test/kotlin/com/metrolist/innertube/pages/NextCounterpartTest.kt` | 127 | `com.metrolist.innertube.pages` | no | 6 | 9 | kotlinx.serialization, org.junit |

## `lrclib` Kotlin files (2)

| File | Lines | Package | Compose | Imports | Decls | External import roots |
| --- | ---: | --- | --- | ---: | ---: | --- |
| `lrclib/src/main/kotlin/com/metrolist/lrclib/LrcLib.kt` | 286 | `com.metrolist.lrclib` | no | 15 | 41 | io.ktor, kotlin.math, kotlinx.coroutines, kotlinx.serialization |
| `lrclib/src/main/kotlin/com/metrolist/lrclib/models/Track.kt` | 137 | `com.metrolist.lrclib.models` | no | 2 | 29 | kotlin.math, kotlinx.serialization |

## `simpmusic` Kotlin files (2)

| File | Lines | Package | Compose | Imports | Decls | External import roots |
| --- | ---: | --- | --- | ---: | ---: | --- |
| `simpmusic/src/main/kotlin/com/metrolist/simpmusic/SimpMusicLyrics.kt` | 119 | `com.metrolist.simpmusic` | no | 15 | 15 | io.ktor, kotlin.math, kotlinx.serialization |
| `simpmusic/src/main/kotlin/com/metrolist/simpmusic/models/LyricsResponse.kt` | 32 | `com.metrolist.simpmusic.models` | no | 2 | 15 | kotlinx.serialization |
