package com.example.random.model.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animal")
class AnimalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    @ColumnInfo(name = "body_color")
    val bodyColor: String
)