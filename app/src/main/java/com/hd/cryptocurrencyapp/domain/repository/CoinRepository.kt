package com.hd.cryptocurrencyapp.domain.repository

import com.hd.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.hd.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}