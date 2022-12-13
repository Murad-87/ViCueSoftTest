package com.example.vicuesoft.data.api

import com.example.vicuesoft.data.model.ViCueSoftRemote
import retrofit2.Response
import retrofit2.http.GET

interface ViCueSoftApi {

    @GET("api/backgrounds/?group=video&category_id=1")
    suspend fun getVideoAndPoster(): Response<ViCueSoftRemote>

    companion object {

        const val BASE_URL = "https://dev.bgrem.deelvin.com/"
    }
}