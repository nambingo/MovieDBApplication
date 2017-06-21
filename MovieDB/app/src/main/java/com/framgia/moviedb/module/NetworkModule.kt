package com.framgia.moviedb.module

import com.framgia.moviedb.common.Constant
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

class NetworkModule{
  @Provides
  @Singleton
  fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl(Constant.URL_BASE)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
  }
}
