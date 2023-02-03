package com.example.kafedra.data

import com.example.kafedra.data.models.user.forms.UserRequestResponseBodies.*
import com.squareup.moshi.Moshi
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.*


interface UserApi {
    @POST("create_user")
    suspend fun signUp(@Body body: UserCreateRequest): UserCreateResponse

    @POST("get_jwt_by_login")
    suspend fun signIn(@Body body: UserSignInRequest): UserSignInResponse

    @POST("user_info")
    suspend fun getUserInfo(@Body body: UserInfoRequest): UserInfoResponse

//    @GET("doctor/get_all")
//    suspend fun getAllDoctors(): DoctorResponse
}

//val loggingInterface = HttpLoggingInterceptor()
//    .setLevel(HttpLoggingInterceptor.Level.BODY)
//
//fun main() {
//    val client = getUnsafeOkHttpClient()
//    val moshi = Moshi.Builder().build()
//    val moshiConverterFactory = MoshiConverterFactory.create(moshi)
//    val retrofit = Retrofit.Builder()
//        .baseUrl("https://localhost:7289")
//        .client(client)
//        .addConverterFactory(moshiConverterFactory)
//        .build()
//
//
//    val api = retrofit.create(Api::class.java)
//
//    val response = runBlocking { api.getAllDoctors() }
//    for (i in response.value) {
//        println("ID: ${i.id}\tName: ${i.fullName}\tSpecialty: ${i.specialtyId}")
//    }
//}
//
//private fun getUnsafeOkHttpClient(): OkHttpClient {
//    return try {
//        // Create a trust manager that does not validate certificate chains
//        val trustAllCerts: Array<TrustManager> = arrayOf(
//            object : X509TrustManager {
//                @Throws(CertificateException::class)
//                override fun checkClientTrusted(
//                    chain: Array<X509Certificate?>?,
//                    authType: String?
//                ) {
//                }
//
//                @Throws(CertificateException::class)
//                override fun checkServerTrusted(
//                    chain: Array<X509Certificate?>?,
//                    authType: String?
//                ) {
//                }
//
//                override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
//
//            }
//        )
//
//        // Install the all-trusting trust manager
//        val sslContext: SSLContext = SSLContext.getInstance("SSL")
//        sslContext.init(null, trustAllCerts, SecureRandom())
//        // Create an ssl socket factory with our all-trusting manager
//        val sslSocketFactory: SSLSocketFactory = sslContext.getSocketFactory()
//        val builder = OkHttpClient.Builder()
//        builder.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
//        builder.hostnameVerifier(object : HostnameVerifier {
//            override fun verify(hostname: String?, session: SSLSession?): Boolean {
//                return true
//            }
//        })
//        builder.addInterceptor(loggingInterface).build()
//    } catch (e: Exception) {
//        throw RuntimeException(e)
//    }
//}
