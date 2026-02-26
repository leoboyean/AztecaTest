package com.test.aztecaevaluation.data.sourses.remote

import com.test.aztecaevaluation.data.models.Show
import com.test.aztecaevaluation.data.models.ShowResponseWeb
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ShowsService {

    @GET("shows")
    suspend fun getShows(@Query("page") page: Long): List<ShowResponseWeb>

    @GET("shows/{id}")
    suspend fun getShowById(@Path("id") id: Long): Show
}