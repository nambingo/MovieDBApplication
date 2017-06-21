package com.framgia.moviedb.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

interface ApiServices {
  @GET("/now_playing?api_key")
  fun getNowPlaying(@Query("api_key") api_key: String,
      @Query("page") page: String): Call<MovieDBResponse>
}
