@file:Suppress("KotlinConstantConditions")

package com.jtech.felizmusic.utils

import com.jtech.felizmusic.BuildConfig
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import org.json.JSONObject

object Updater {
    private val client = HttpClient()
    private val docUrl: String
        get() {
            check(BuildConfig.FELIZ_FIREBASE_PROJECT_ID.isNotBlank()) {
                "Set -PfirebaseProjectId to enable Feliz Music self-updates."
            }
            return "https://firestore.googleapis.com/v1/projects/${BuildConfig.FELIZ_FIREBASE_PROJECT_ID}/databases/(default)/documents/appUpdates/latest"
        }

    var lastCheckTime = -1L
        private set
    private var cachedDownloadUrl: String? = null

    data class UpdateInfo(
        val versionName: String,
        val downloadUrl: String,
    )

    suspend fun getLatestUpdate(): Result<UpdateInfo> =
        runCatching {
            val response = client.get(docUrl).bodyAsText()
            val json = JSONObject(response)
            val fields = json.optJSONObject("fields")
                ?: error("Missing fields in update document")

            val versionName =
                fields.optJSONObject("versionName")?.optString("stringValue")
                    ?: error("Missing versionName")

            val universalUrl = fields.optJSONObject("universalUrl")?.optString("stringValue")
            val arm64Url = fields.optJSONObject("arm64Url")?.optString("stringValue")
            val x86Url = fields.optJSONObject("x86Url")?.optString("stringValue")
            val baseUrl = fields.optJSONObject("baseUrl")?.optString("stringValue")

            val architecture = BuildConfig.ARCHITECTURE
            val downloadUrl = when (architecture) {
                "arm64" -> arm64Url ?: universalUrl ?: baseUrl
                "x86" -> x86Url ?: universalUrl ?: baseUrl
                else -> universalUrl ?: baseUrl
            } ?: error("Missing download URL for architecture $architecture")

            lastCheckTime = System.currentTimeMillis()
            cachedDownloadUrl = downloadUrl
            UpdateInfo(versionName = versionName, downloadUrl = downloadUrl)
        }

    fun getCachedDownloadUrl(): String? = cachedDownloadUrl
}
