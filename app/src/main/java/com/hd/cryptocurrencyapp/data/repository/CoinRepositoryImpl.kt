package com.hd.cryptocurrencyapp.data.repository

import android.util.Log
import com.hd.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.hd.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.hd.cryptocurrencyapp.data.remote.dto.CoinDto
import com.hd.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinPaprikaApi) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}