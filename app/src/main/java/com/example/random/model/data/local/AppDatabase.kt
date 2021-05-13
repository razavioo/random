package com.example.random.model.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.random.model.data.local.dao.AnimalDao
import com.example.random.model.data.local.entity.AnimalEntity

@Database(entities = [AnimalEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun animalDao(): AnimalDao
}