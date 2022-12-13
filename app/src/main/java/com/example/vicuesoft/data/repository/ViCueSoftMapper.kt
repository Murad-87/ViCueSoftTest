package com.example.vicuesoft.data.repository

import com.example.vicuesoft.data.model.ViCueSoftRemote
import com.example.vicuesoft.domain.model.ViCueSoftModel
import com.example.vicuesoft.utils.Mapper
import javax.inject.Inject

class ViCueSoftMapper @Inject constructor() : Mapper<ViCueSoftRemote, ViCueSoftModel> {

    override fun map(input: ViCueSoftRemote): ViCueSoftModel =
        ViCueSoftModel(
            fileUrl = input.fileUrl,
            smallThumbnailUrl = input.smallThumbnailUrl
        )
}