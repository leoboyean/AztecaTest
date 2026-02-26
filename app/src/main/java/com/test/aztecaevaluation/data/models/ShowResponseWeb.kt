// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.test.aztecaevaluation.data.models

data class ShowResponseWeb(
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
    val webChannel: Network,
    val genres: List<String>,
    val name: String,
    val ended: String,
    val id: Long,
    val externals: External,
    val updated: Long,
    val status: String,
)

fun ShowResponseWeb.toDto(): Show = Show(
    summary = summary ?: "",
    image = image ?: Image("", ""),
    averageRuntime = averageRuntime ?: 0L,
    links = links ?: Links(Self(""), Previousepisode("", "")),
    premiered = premiered ?: "",
    rating = rating ?: Rating(0.0),
    weight = weight ?: 0L,
    language = language ?: "",
    type = type ?: "",
    url = url ?: "",
    officialSite = officialSite ?: "",
    name = name ?: "",
    id = id ?: 0
)

data class Show(
    val summary: String?,
    val image: Image?,
    val averageRuntime: Long?,
    val links: Links?,
    val premiered: String?,
    val rating: Rating?,
    val weight: Long?,
    val language: String?,
    val type: String?,
    val url: String?,
    val officialSite: String?,
    val name: String?,
    val id: Long?,
)

data class External(
    val thetvdb: Long,
    val imdb: String,
    val tvrage: Long,
)

data class Image(
    val original: String,
    val medium: String,
)

data class Links(
    val self: Self,
    val previousepisode: Previousepisode,
)

data class Previousepisode(
    val name: String,
    val href: String,
)

data class Self(
    val href: String,
)

data class Network(
    val country: Country,
    val name: String,
    val id: Long,
    val officialSite: String? = null,
)

data class Country(
    val code: String,
    val timezone: String,
    val name: String,
)

class Rating(
    val average: Double
)

data class Schedule(
    val days: List<String>,
    val time: String,
)
