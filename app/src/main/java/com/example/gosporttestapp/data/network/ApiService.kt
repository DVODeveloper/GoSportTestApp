package com.example.gosporttestapp.data.network

import com.example.gosporttestapp.domain.entity.ItemsResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/macros/s/AKfycbx4aaiKFcQ-rHaGp6XqZodrLf-CFiiuYcTZzLmdMX1ox_EUSFjDUFKvgba4YCLkKnKY/exec")
    suspend fun getPizzaListFromAPI(): ItemsResponse

//    @GET("/macros/s/AKfycbx4aaiKFcQ-rHaGp6XqZodrLf-CFiiuYcTZzLmdMX1ox_EUSFjDUFKvgba4YCLkKnKY/exec")
//    suspend fun getPizzaListFromAPI(): Response<ItemsResponse>
}