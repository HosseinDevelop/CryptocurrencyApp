package com.hd.cryptocurrencyapp.presentation.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun Toolbar(
    title: String="",
    backIcon: @Composable (() -> Unit)? = null,
) {
    TopAppBar(
        elevation = 4.dp,
        title = { Text(text = title) },
        backgroundColor = MaterialTheme.colors.primarySurface,
        navigationIcon = backIcon
    )


}