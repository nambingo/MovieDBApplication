package com.framgia.moviedb

import android.app.Application
import com.framgia.moviedb.module.AppModule
import com.framgia.moviedb.module.MovieDBComponent
import com.framgia.moviedb.module.DaggerMovieDBComponent

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

class MyApplication : Application(){
  companion object {
    lateinit var movieDBComponent: MovieDBComponent
  }

  override fun onCreate() {
    super.onCreate()
    movieDBComponent = DaggerMovieDBComponent.builder()
        .appModule(AppModule(this))
        //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
        .build()
  }
}
