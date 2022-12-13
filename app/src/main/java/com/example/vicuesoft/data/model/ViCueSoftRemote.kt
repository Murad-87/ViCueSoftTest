package com.example.vicuesoft.data.model

import com.google.gson.annotations.SerializedName

data class ViCueSoftRemote(
    @SerializedName("file_url")
    val fileUrl: String,
    @SerializedName("small_thumbnail_url")
    val smallThumbnailUrl: String
)
