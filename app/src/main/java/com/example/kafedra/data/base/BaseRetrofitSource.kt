package com.example.kafedra.data.base

import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonEncodingException
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import retrofit2.Retrofit
import java.io.IOException

open class BaseRetrofitSource(retrofitConfig: RetrofitConfig) {
    val retrofit: Retrofit = retrofitConfig.retrofit

    private val moshi: Moshi = retrofitConfig.moshi
    private val errorAdapter = moshi.adapter(ErrorResponseBody::class.java)

    suspend fun <T> wrapRetrofitExceptions(block: suspend () -> T): T {
        return try {
            block()
//        } catch (e: AppException) {
//            throw e
//            // moshi
        } catch (e: JsonDataException) {
//            throw ParseBackendResponseException(e)
            throw Throwable("NOT_IMPLEMENTED_YET")
        } catch (e: JsonEncodingException) {
//            throw ParseBackendResponseException(e)
            throw Throwable("NOT_IMPLEMENTED_YET")
            // retrofit
        } catch (e: HttpException) {
//            throw createBackendException(e)
            throw Throwable("NOT_IMPLEMENTED_YET")
            // mostly retrofit
        } catch (e: IOException) {
//            throw ConnectionException(e)
            throw Throwable("NOT_IMPLEMENTED_YET")

        }
    }

//    private fun createBackendException(e: HttpException): Exception {
//        return try {
//            val errorBody: ErrorResponseBody = errorAdapter.fromJson(
//                e.response()!!.errorBody()!!.string()
//            )!!
//            BackendException(e.code(), errorBody.error)
//        } catch (e: Exception) {
//            throw ParseBackendResponseException(e)
//        }
//    }

    class ErrorResponseBody(
        val error: String
    )
}