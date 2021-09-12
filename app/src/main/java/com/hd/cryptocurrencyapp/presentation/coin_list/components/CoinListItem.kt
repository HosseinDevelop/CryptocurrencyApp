package com.hd.cryptocurrencyapp.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.hd.cryptocurrencyapp.domain.model.Coin
import com.hd.cryptocurrencyapp.presentation.components.CoinActiveBadge

@Composable
fun CoinListItem(coin: Coin, onItemClick: (coin: Coin) -> Unit) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { onItemClick(coin) }
        .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {

        Row(
            modifier = Modifier
                .weight(1f)
                .padding(0.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    //.height(35.dp)
                    .width(50.dp)
                    .padding(2.dp)
                    ,

                //shape = RoundedCornerShape(100.dp),
                shape = CircleShape,
                color = MaterialTheme.colors.primary
            ) {
                Text( modifier = Modifier
                    .align(CenterVertically)
                    //.height(35.dp)
                    .width(50.dp)
                    .padding(4.dp),
                    text = "${coin.rank}",
                    textAlign= TextAlign.Center,
                    style = MaterialTheme.typography.caption,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
            }

            Text(
                text = ". ${coin.name} (${coin.symbol})",
                style = MaterialTheme.typography.body1,
                overflow = TextOverflow.Ellipsis
            )

        }

        CoinActiveBadge(
            isActive = coin.isActive!!, modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(4.dp)
        )
    }
}