package com.example.gosporttestapp.domain.entity

import android.media.Image

data class PizzaCardEntity(
    val id: Int,
//    val imagePizza: String,
    val title: String? = "title",
    val description: String? = "title",
    val price: String? = "title"
    )

data class ItemsResponse(
    val products: List<PizzaCardEntity>
)
