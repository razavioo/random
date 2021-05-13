package com.example.random.model.data.remote.response

import com.google.gson.annotations.SerializedName

class ElephantResponse(
    val _id: String,
    val index: Int,
    val name: String,
    val affiliation: String,
    val species: String,
    val sex: String,
    val fictional: String,
    val dob: String,
    val dod: String,
    @SerializedName("wikilink")
    val link: String,
    val image: String,
    val note: String
)