package com.example.random.model.data.remote

import com.example.random.model.data.remote.response.ElephantResponse
import retrofit2.http.GET

interface ApiService {
    @GET("elephants")
    suspend fun getElephants(): List<ElephantResponse>
}