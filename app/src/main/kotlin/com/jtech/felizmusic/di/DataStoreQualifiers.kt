package com.jtech.felizmusic.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SyncDataStore

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MainDataStore