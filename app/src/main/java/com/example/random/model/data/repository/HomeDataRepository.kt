package com.example.random.model.data.repository

import com.example.random.model.data.local.source.LocalDataSource
import com.example.random.model.data.remote.source.RemoteDataSource
import com.example.random.model.domain.Animal
import com.example.random.model.domain.Elephant

object HomeDataRepository {
    fun getHomeData(): String {
        return LocalDataSource.selectData()
    }

    fun getAnimals(): List<Animal> {
        return LocalDataSource.selectAnimals()
    }

    suspend fun getElephants(): List<Elephant> {
        return RemoteDataSource.selectElephants()
    }
}