package com.framgia.moviedb.api

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

class MovieDBResponse(val result: List<MovieItemResponse>)

class MovieItemResponse(
    val title: String
)
