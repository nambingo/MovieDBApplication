package com.framgia.moviedb.data

import com.framgia.moviedb.api.ResultServices
import java.util.*
import javax.inject.Inject
import rx.Observable

/**
 * Created by FRAMGIA\pham.duc.nam on 21/06/2017.
 */

class ResultManage @Inject constructor(private val resultServices: ResultServices) {
  fun getResult(api_key: String, page: String): Observable<MovieDBResult> {
    return Observable.create {
      subscriber ->
      val callResponse = resultServices.getResult(api_key, page)
      val response = callResponse.execute()

      if (response.isSuccessful) {
        val resultResponse = response.body().result.map {
          val item = it.title
          MovieDBItems(item)
        }
        val movieDBResult = MovieDBResult(resultResponse)
        subscriber.onNext(movieDBResult)
        subscriber.onCompleted()
      } else {
        subscriber.onError(Throwable(response.message()))
      }
    }
  }

}
