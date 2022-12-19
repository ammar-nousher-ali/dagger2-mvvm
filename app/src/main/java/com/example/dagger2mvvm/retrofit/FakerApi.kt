package com.example.dagger2mvvm.retrofit

import com.example.dagger2mvvm.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("/products")
    suspend fun getProducts(): Response<List<Product>>
}