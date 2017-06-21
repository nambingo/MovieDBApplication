package com.framgia.moviedb.data

import com.framgia.moviedb.api.MovieItemResponse

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */
data class MovieDBResult(
    val result: List<MovieDBItems>
)

data class MovieDBItems(
    val title: String
)