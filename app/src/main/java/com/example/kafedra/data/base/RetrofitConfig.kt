package com.example.kafedra.data.base

import com.squareup.moshi.Moshi
import retrofit2.Retrofit

class RetrofitConfig(
    val retrofit: Retrofit,
    val moshi: Moshi
)