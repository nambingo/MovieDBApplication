package com.framgia.moviedb.module

import android.app.Application
import android.content.Context
import com.framgia.moviedb.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

@Module
class AppModule(val app: MyApplication) {

  @Provides
  @Singleton
  fun provideContext(): Context = app

  @Provides
  @Singleton
  fun provideApplication() : Application = app

}
