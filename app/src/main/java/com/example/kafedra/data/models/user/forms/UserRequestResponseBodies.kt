package com.example.kafedra.data.models.user.forms

import com.example.kafedra.data.models.user.Jwt
import org.json.JSONObject

class UserRequestResponseBodies {
    data class UserCreateRequest(
        val first_name: String,
        val second_name: String,
        val role: String,
        val email: String,
        val password: String,
        val photo: JSONObject
    )

    data class UserCreateResponse(
        val code: Int,
        val user_id: Long
    )

    data class UserSignInRequest(
        val email: String,
        val password: String,
    )

    data class UserSignInResponse(
        val code: Int,
        val access_token: String,
        val refresh_token: String
    ) {
        fun toJwt() = Jwt(
            access_token = access_token,
            refresh_token = refresh_token
        )
    }


    data class UserInfoRequest(
        val user_id: Long
    )

    data class UserInfoResponse(
        val user_id: Long,
        val first_name: String,
        val second_name: String,
        val role: Int,
        val group_id: Int?,
        val email: String,
        val photo: String
    )


//    data class Doctor(
//        val id: Int,
//        val fullName: String,
//        val specialtyId: Int
//    )
//    data class DoctorResponse (
//        val value: List<Doctor>
//    )
}