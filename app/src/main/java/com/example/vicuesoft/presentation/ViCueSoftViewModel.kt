package com.example.vicuesoft.presentation

import androidx.lifecycle.ViewModel
import com.example.vicuesoft.domain.GetVideosAndPostersUseCase
import javax.inject.Inject

class ViCueSoftViewModel @Inject constructor(
    private val getVideosAndPostersUseCase: GetVideosAndPostersUseCase
) : ViewModel() {
}