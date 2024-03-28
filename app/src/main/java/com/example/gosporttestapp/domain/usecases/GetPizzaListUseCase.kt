package com.example.gosporttestapp.domain.usecases

import androidx.lifecycle.LiveData
import com.example.gosporttestapp.domain.entity.ItemsResponse
import com.example.gosporttestapp.domain.entity.PizzaCardEntity
import com.example.gosporttestapp.domain.repository.PizzaListRepository

class GetPizzaListUseCase(
    private val pizzaListRepository: PizzaListRepository
) {

    suspend fun getPizzaList(): ItemsResponse {
        return pizzaListRepository.getPizzaList()
    }
}