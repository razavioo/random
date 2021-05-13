package com.example.random.model.data.local.source

import com.example.random.BaseApplication
import com.example.random.model.data.local.mapper.AnimalEntityMapper
import com.example.random.model.domain.Animal

object LocalDataSource {
    fun selectData(): String {
        return "This is home Fragment"
    }

    fun selectAnimals(): List<Animal> {
        val appDatabase = BaseApplication.appDatabase
        return appDatabase.animalDao().getAnimals().map { AnimalEntityMapper.map(it) }
    }

    fun insertAnimal(animal: Animal) {
        val appDatabase = BaseApplication.appDatabase
        val animalEntity = AnimalEntityMapper.map(animal)
        appDatabase.animalDao().insertAnimal(animalEntity)
    }
}