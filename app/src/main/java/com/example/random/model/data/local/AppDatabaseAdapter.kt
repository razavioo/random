package com.example.random.model.data.local

import android.content.Context
import androidx.room.Room

object AppDatabaseAdapter {
    private var database: AppDatabase? = null

    fun database(context: Context): AppDatabase {
        if (database == null) {
            database = Room.databaseBuilder(
                context, AppDatabase::class.java, "app-database"
            ).allowMainThreadQueries().build()
        }

        return database!!
    }
}