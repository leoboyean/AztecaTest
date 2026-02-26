package com.test.aztecaevaluation.domain.usecases

import com.test.aztecaevaluation.domain.repository.ShowsRepository

class ShowByIdUseCase(
    private val showsRepository: ShowsRepository
) {
    suspend fun invoke(idShow: Long) =
        showsRepository.getShowById(idShow)
}