package com.example.kafedra.data.models.user

import com.example.kafedra.data.models.user.forms.UserRequestResponseBodies.*
import retrofit2.http.Body
import retrofit2.http.POST
import javax.net.ssl.*


interface UserApi {
    @POST("create_user")
    suspend fun createUser(@Body body: UserCreateRequest): UserCreateResponse

    @POST("get_jwt_by_login")
    suspend fun getJwtByLogin(@Body body: UserSignInRequest): UserSignInResponse

    @POST("user_info")
    suspend fun getUserInfo(@Body body: UserInfoRequest): UserInfoResponse
}