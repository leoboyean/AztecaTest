package com.test.aztecaevaluation.domain.models

import com.test.aztecaevaluation.data.models.External
import com.test.aztecaevaluation.data.models.Image
import com.test.aztecaevaluation.data.models.Links
import com.test.aztecaevaluation.data.models.Network
import com.test.aztecaevaluation.data.models.Rating
import com.test.aztecaevaluation.data.models.Schedule

data class ShowDto(
    val summary: String?,
    val image: Image?,
    val averageRuntime: Long?,
    val links: Links?,
    val premiered: String?,
    val rating: Rating?,
    val runtime: Long?,
    val weight: Long?,
    val language: String?,
    val type: String?,
    val url: String?,
    val officialSite: String?,
    val network: Network?,
    val schedule: Schedule?,
    val genres: List<String>?,
    val name: String?,
    val ended: String?,
    val id: Long?,
    val externals: External?,
    val updated: Long?,
    val status: String?,
)





