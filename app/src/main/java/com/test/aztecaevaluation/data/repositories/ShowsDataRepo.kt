package com.test.aztecaevaluation.data.repositories

import android.util.Log
import com.test.aztecaevaluation.data.models.Show
import com.test.aztecaevaluation.data.models.toDto

import com.test.aztecaevaluation.data.sourses.remote.ShowsService
import com.test.aztecaevaluation.domain.models.ShowDto
import com.test.aztecaevaluation.domain.repository.ShowsRepository

class ShowsDataRepo(
    private val showsService: ShowsService,
//    private val showsLocal: ShowsLocal
) : ShowsRepository {

    override suspend fun getShows(): List<Show> {
        val shows = showsService.getShows(1)
        return shows.map {
            it.toDto()
        }
    }

    override suspend fun getShowById(id: Long): Show {
        TODO("Not yet implemented")
    }

    companion object {
        private const val TAG = "}"
    }

}