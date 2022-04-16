package com.example.androidkickoff.model

import java.io.Serializable

data class Food(

        val id: Int,
        val name: String,
        val rating: String,
        val costForTwo: Int,
        val imageUrl: String
)