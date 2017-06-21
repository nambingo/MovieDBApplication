package com.framgia.moviedb.module

import com.framgia.moviedb.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

@Singleton
@Component(modules = arrayOf(
    AppModule::class,
    MovieDBModule::class,
    NetworkModule::class)
)
interface MovieDBComponent {

  fun inject(mainActivity: MainActivity)

}
