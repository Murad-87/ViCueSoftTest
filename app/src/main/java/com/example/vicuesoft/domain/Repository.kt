package com.example.vicuesoft.domain

import com.example.vicuesoft.domain.model.ViCueSoftModel

interface Repository {

    suspend fun getVideoAndPoster(): ViCueSoftModel
}