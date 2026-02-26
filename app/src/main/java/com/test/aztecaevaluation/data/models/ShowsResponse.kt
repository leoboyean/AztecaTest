// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.test.aztecaevaluation.data.sourses.remote

data class ShowsResponse (
    val score: Double,
    val show: Show
)

data class Show (
    val summary: String,
    val image: Image,
    val averageRuntime: Long,
    val links: Links,
    val premiered: String,
    val rating: Rating,
    val runtime: Long,
    val weight: Long,
    val language: String,
    val type: String,
    val url: String,
    val officialSite: String,
    val network: Network,
    val schedule: Schedule,
    val genres: List<String>,
    val name: String,
    val ended: String,
    val id: Long,
    val externals: Externals,
    val updated: Long,
    val status: String
)

data class Externals (
    val thetvdb: Long,
    val imdb: String,
    val tvrage: Long
)

data class Image (
    val original: String,
    val medium: String
)

data class Links (
    val self: Self,
    val previousepisode: Previousepisode
)

data class Previousepisode (
    val name: String,
    val href: String
)

data class Self (
    val href: String
)

data class Network (
    val country: Country,
    val name: String,
    val id: Long,
    val officialSite: String
)

data class Country (
    val code: String,
    val timezone: String,
    val name: String
)

data class Rating (
    val average: Double
)

data class Schedule (
    val days: List<String>,
    val time: String
)
