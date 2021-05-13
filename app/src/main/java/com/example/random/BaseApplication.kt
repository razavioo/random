package com.example.random

import android.app.Application
import com.example.random.model.data.local.AppDatabase
import com.example.random.model.data.local.AppDatabaseAdapter
import com.example.random.model.data.remote.ApiAdapter
import com.example.random.model.data.remote.ApiService

class BaseApplication : Application() {
    companion object {
        lateinit var appDatabase: AppDatabase
        lateinit var apiService: ApiService
    }

    override fun onCreate() {
        super.onCreate()

        appDatabase = AppDatabaseAdapter.database(this)
        apiService = ApiAdapter.apiService
    }
}