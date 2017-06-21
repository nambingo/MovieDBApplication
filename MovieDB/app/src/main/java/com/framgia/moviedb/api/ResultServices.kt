package com.framgia.moviedb.api

import retrofit2.Call

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

interface ResultServices {
  fun getResult(api_key: String, page: String): Call<MovieDBResponse>
}
