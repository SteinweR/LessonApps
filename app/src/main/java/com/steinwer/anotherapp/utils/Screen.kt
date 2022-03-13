package com.steinwer.anotherapp.utils

import androidx.annotation.StringRes
import com.steinwer.anotherapp.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object MainScreen : Screen("profile", R.string.MS)
    object TextScreen : Screen("friendslist", R.string.TS)
}