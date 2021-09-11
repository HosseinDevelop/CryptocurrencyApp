package com.hd.cryptocurrencyapp.domain.use_case.get_coin

import android.util.Log
import com.hd.cryptocurrencyapp.common.Resource
import com.hd.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.hd.cryptocurrencyapp.domain.model.CoinDetail
import com.hd.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(private val repository: CoinRepository) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {

        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("couldn't reach server. check your internet connection"))
        }

    }

}