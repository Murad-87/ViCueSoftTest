package com.example.vicuesoft.data.repository

import com.example.vicuesoft.data.api.ViCueSoftApi
import com.example.vicuesoft.domain.Repository
import com.example.vicuesoft.domain.model.ViCueSoftModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: ViCueSoftApi,
    private val mapper: ViCueSoftMapper
) : Repository {

    override suspend fun getVideoAndPoster(): ViCueSoftModel {
        TODO("Not yet implemented")
    }
}