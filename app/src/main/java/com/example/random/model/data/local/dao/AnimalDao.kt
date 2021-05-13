package com.example.random.model.data.local.dao

import androidx.room.*
import com.example.random.model.data.local.entity.AnimalEntity

@Dao
interface AnimalDao {
    @Query("SELECT * FROM animal")
    fun getAnimals(): List<AnimalEntity>

    @Insert
    fun insertAnimal(animal: AnimalEntity)

    @Delete
    fun delete(animal: AnimalEntity)

    @Update
    fun updateAnimal(animal: AnimalEntity): Int
}