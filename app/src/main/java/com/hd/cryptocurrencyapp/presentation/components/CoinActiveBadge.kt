package com.hd.cryptocurrencyapp.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.hd.cryptocurrencyapp.presentation.ui.theme.Green500
import com.hd.cryptocurrencyapp.presentation.ui.theme.Red500

@Composable
fun CoinActiveBadge(isActive: Boolean, modifier: Modifier) {
    Surface(
        shape = RoundedCornerShape(
            corner = CornerSize(50.dp)
        ), color = if (isActive) Green500 else Red500,
        modifier = Modifier
            .width(70.dp)
            .padding(8.dp)
    ) {
        Text(

            text = if (isActive) "active" else "inactive",
            color = if (isActive) Color.White else Color.White,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.caption,
            modifier = modifier
        )
    }


}