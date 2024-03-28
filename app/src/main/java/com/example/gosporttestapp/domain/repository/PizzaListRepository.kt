package com.example.gosporttestapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.gosporttestapp.domain.entity.ItemsResponse
import com.example.gosporttestapp.domain.entity.PizzaCardEntity

interface PizzaListRepository {

    suspend fun getPizzaList(): ItemsResponse
}