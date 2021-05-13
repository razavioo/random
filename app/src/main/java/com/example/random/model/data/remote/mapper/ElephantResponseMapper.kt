package com.example.random.model.data.remote.mapper

import com.example.random.model.data.remote.response.ElephantResponse
import com.example.random.model.domain.Elephant

object ElephantResponseMapper {
    fun map(elephantResponse: ElephantResponse): Elephant {
        with(elephantResponse) {
            return Elephant(name, link)
        }
    }
}