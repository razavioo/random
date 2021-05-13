package com.example.random.model.data.local.mapper

import com.example.random.model.data.local.entity.AnimalEntity
import com.example.random.model.domain.Animal

object AnimalEntityMapper {
    fun map(from: AnimalEntity): Animal {
        return Animal(from.name, from.bodyColor)
    }

    fun map(from: Animal): AnimalEntity {
        return AnimalEntity(null, from.name, from.bodyColor)
    }
}