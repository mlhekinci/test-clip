package com.free.esportsclips



import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface TwitchService{
    @Headers("Accept: application/vnd.twitchtv.v5+json", "$=Client-ID: uo6dggojyb8d6soh92zknwmi5ej1q2")

@GET("search")
fun search(@Query("game") q:String, @Query("limit") limit: Int): Deferred<Result<API.UrlResult>>
}