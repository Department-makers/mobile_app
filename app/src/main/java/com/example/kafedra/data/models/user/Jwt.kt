package com.example.kafedra.data.models.user

data class Jwt(
    val access_token: String,
    val refresh_token: String
)