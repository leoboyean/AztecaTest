package com.test.aztecaevaluation.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import com.test.aztecaevaluation.data.repositories.ShowsDataRepo
import com.test.aztecaevaluation.data.sourses.remote.ShowsService
import com.test.aztecaevaluation.domain.repository.ShowsRepository
import com.test.aztecaevaluation.domain.usecases.ShowUseCase
import com.test.aztecaevaluation.presentation.services.RetrofitFactory
import com.test.aztecaevaluation.presentation.shows.ShowsViewModel

class DetailsRegister {

    private fun getShowsService(): ShowsService =
        RetrofitFactory.instance().create(ShowsService::class.java)

//    private fun getShowsLocal()



    private val showsRepo: ShowsRepository by lazy {
        ShowsDataRepo(getShowsService(), )
    }

    private val showUseCase: ShowUseCase by lazy {
        ShowUseCase(showsRepo)
    }

    fun provide() = ShowsViewModel(showUseCase)
}