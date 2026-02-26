package com.test.aztecaevaluation.domain.repository

import com.test.aztecaevaluation.data.models.Show

interface ShowsRepository {
    suspend fun getShows(): List<Show>
    suspend fun getShowById(id: Long): Show
}