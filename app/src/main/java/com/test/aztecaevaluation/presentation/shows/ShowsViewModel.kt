package com.test.aztecaevaluation.presentation.shows

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.aztecaevaluation.data.models.Show
import com.test.aztecaevaluation.domain.usecases.ShowUseCase
import kotlinx.coroutines.launch

class ShowsViewModel(
    private val showsUseCase: ShowUseCase,
) : ViewModel() {


    private val _data = mutableStateOf<List<Show>>(emptyList())
    val data: State<List<Show>> = _data
//    private val _dataChannel = Channel<List<ShowDto>>()
//    val dataShowsFlow = _dataChannel.receiveAsFlow()

    fun fetchData() {
        viewModelScope.launch {
            Log.i(TAG, "shows preeee /*/*/--*-*-* ")
            val result = showsUseCase.invoke()
            _data.value = result
            Log.i(TAG, "shows SETTEDD :/*/*/*/* $result")
        }
    }

    init {
        viewModelScope.launch {
            Log.i(TAG, "shows preeee /*/*/--*-*-* ")
            val result = showsUseCase.invoke()
            _data.value = result
            Log.i(TAG, "shows SETTEDD :/*/*/*/* $result")
        }
    }

//    init {
//        viewModelScope.launch {
//            try {
//                val shows = showsUseCase.invoke()
//                Log.i(TAG, "shows downloaded: $shows")
//
//            } catch (e: Exception) {
//                Log.e(TAG, "An error has occurred: $e", )
//            }
//        }
//    }
}