package com.test.aztecaevaluation.presentation.models

import com.test.aztecaevaluation.data.models.Rating

data class ShowModel(
    val summary: String,
    val image: ImageModel,
    val premiered: String,
    val rating: RatingModel,
    val runtime: Long,
    val weight: Long,
    val language: String,
    val type: String,
    val officialSite: String,
    val genres: List<String>,
    val name: String,
    val ended: String,
    val id: Long,
    val updated: Long,
    val status: String
)