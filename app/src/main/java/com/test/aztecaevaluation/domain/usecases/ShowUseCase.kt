package com.test.aztecaevaluation.domain.usecases

import com.test.aztecaevaluation.data.models.Show
import com.test.aztecaevaluation.domain.repository.ShowsRepository

class ShowUseCase(
    private val showsRepository: ShowsRepository,
) {
    suspend fun invoke(): List<Show> =
        showsRepository.getShows()

}