package com.framgia.moviedb.api

import android.text.method.MovementMethod
import retrofit2.Call
import javax.inject.Inject

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

class ListMovieApi @Inject constructor(private val movieApi: ApiServices) : ResultServices {
  override fun getResult(api_key: String, page: String): Call<MovieDBResponse> {
    return movieApi.getNowPlaying(api_key, page)
  }
}
