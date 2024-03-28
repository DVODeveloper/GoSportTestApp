package com.example.gosporttestapp.data.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {

    private const val BASE_URL =
        "https://script.google.com"

    private val gson = GsonBuilder()
        .setLenient()
        .create()

    private val retrofit =Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}