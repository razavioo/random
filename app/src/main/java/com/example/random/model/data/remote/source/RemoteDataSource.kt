package com.example.random.model.data.remote.source

import com.example.random.BaseApplication
import com.example.random.model.data.remote.mapper.ElephantResponseMapper
import com.example.random.model.domain.Elephant

object RemoteDataSource {
    suspend fun selectElephants(): List<Elephant> {
        val apiService = BaseApplication.apiService
        return apiService.getElephants().map { ElephantResponseMapper.map(it) }
    }
}