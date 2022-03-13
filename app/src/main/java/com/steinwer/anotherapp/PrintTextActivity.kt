package com.steinwer.anotherapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.steinwer.anotherapp.utils.ViewModelClass

@Composable
fun PrintTextActivity(viewModel : ViewModelClass = hiltViewModel()) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = viewModel.var1)
        Text(text = viewModel.var2)
    }
}