package com.test.aztecaevaluation.presentation.services

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {

    private val BASE_URL = "https://api.tvmaze.com"

    fun instance(): Retrofit {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
//            .client(getClient())
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

//    private fun getClient(): OkHttpClient {
//        val httpLoggingInterceptor =
//            HttpLoggingInterceptor().setLevel(
//                if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else
//                    HttpLoggingInterceptor.Level.NONE
//            )
//
//        return OkHttpClient().newBuilder() //httpLogging interceptor for logging network requests
//            .addInterceptor(AuthInterceptor())
//            .addInterceptor(ContentTypeInterceptor())
//            .build()
//    }

}