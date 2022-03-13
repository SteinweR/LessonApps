package com.steinwer.anotherapp.utils

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelClass @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    var var1 by mutableStateOf("")
    var var2 by mutableStateOf("")
}