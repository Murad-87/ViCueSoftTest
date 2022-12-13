package com.example.vicuesoft.domain

import com.example.vicuesoft.domain.model.ViCueSoftModel
import javax.inject.Inject

class GetVideosAndPostersUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend fun getVideoAndPoster() : ViCueSoftModel {
        return repository.getVideoAndPoster()
    }
}