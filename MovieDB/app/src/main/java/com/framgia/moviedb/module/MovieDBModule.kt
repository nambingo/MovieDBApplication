package com.framgia.moviedb.module

import com.framgia.moviedb.api.ApiServices
import com.framgia.moviedb.api.ListMovieApi
import com.framgia.moviedb.api.ResultServices
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */
@Module
class MovieDBModule{
  @Provides
  @Singleton
  fun provideResultAPI(apiServices: ApiServices): ResultServices = ListMovieApi(apiServices)

  @Provides
  @Singleton
  fun provideMovieApi(retrofit: Retrofit): ApiServices = retrofit.create(ApiServices::class.java)

}
