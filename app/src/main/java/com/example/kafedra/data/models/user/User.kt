package com.example.kafedra.data.models.user

//import android.media.Image

data class User(
    val user_id: Long,
    var first_name: String,
    var second_name: String,
    var role: Int,
    var group_id: Int?,
    var email: String,
//    var photo: Image
)

