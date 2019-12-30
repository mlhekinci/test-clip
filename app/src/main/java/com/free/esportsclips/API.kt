package com.free.esportsclips

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object API{

    val retrofit: Retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(Constants.API_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    data class UrlResult(val result:List<UrlResult>)


    fun getService() :TwitchService {
        return retrofit.create(TwitchService::class.java)
    }
}