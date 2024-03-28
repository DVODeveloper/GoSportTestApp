package com.example.gosporttestapp.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gosporttestapp.data.network.ApiFactory
import com.example.gosporttestapp.domain.entity.ItemsResponse
import com.example.gosporttestapp.domain.entity.PizzaCardEntity
import com.example.gosporttestapp.domain.repository.PizzaListRepository

class PizzaListRepositoryImpl: PizzaListRepository  {


    private val pizzaList = mutableListOf<PizzaCardEntity>()
    private val pizzaListLD = MutableLiveData<List<PizzaCardEntity>>()

    override suspend fun getPizzaList(): ItemsResponse {
        val response = ApiFactory.apiService.getPizzaListFromAPI()

            val products = response.products
            Log.d("PizzaListRepositoryImpl","getPizzaList was downloaded ${products.toString()}")
            return ItemsResponse(products)

//            return response.body()?.products?: emptyList()

    }

//    override suspend fun getPizzaList(): ItemsResponse {
//        val response = ApiFactory.apiService.getPizzaListFromAPI()
//        if (response.isSuccessful) {
//            val products = response.body()?.products?: emptyList()
//            Log.d("PizzaListRepositoryImpl","getPizzaList was downloaded ${products.toString()}")
//            return ItemsResponse(products)
//
////            return response.body()?.products?: emptyList()
//        } else {
//            Log.d("PizzaListRepositoryImpl","getPizzaList was't downloaded")
//            throw Exception("Failed to fetch pizza list")
//        }
//    }


}