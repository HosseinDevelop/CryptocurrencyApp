package com.hd.cryptocurrencyapp.presentation.coin_detail.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.hd.cryptocurrencyapp.presentation.ui.theme.Grey300
import com.hd.cryptocurrencyapp.presentation.ui.theme.Grey700
import com.hd.cryptocurrencyapp.presentation.ui.theme.Grey800
import com.hd.cryptocurrencyapp.presentation.ui.theme.Grey900


@Composable
fun CoinTag(tag: String) {
    Surface(
        shape = RoundedCornerShape(
            corner = CornerSize(50.dp)
        ), color = Grey300,
        modifier = Modifier
            .padding(2.dp)
    ) {
        Text(
            text = tag,
            color = Grey800,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            style = MaterialTheme.typography.caption,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}