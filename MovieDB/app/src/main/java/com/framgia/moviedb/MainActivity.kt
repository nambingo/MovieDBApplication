package com.framgia.moviedb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.framgia.moviedb.common.Constant
import com.framgia.moviedb.data.ResultManage
import kotlinx.android.synthetic.main.activity_main.*
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject lateinit var resultManage: ResultManage
  protected var subscriptions = CompositeSubscription()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    MyApplication.movieDBComponent.inject(this)
    subscriptions = CompositeSubscription()
    getData()
  }

  private fun getData() {
    val subscription = resultManage.getResult(Constant.API_KEY, "1")
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread()).subscribe(
        { retrievedNews ->
          textview.setText(retrievedNews.result.get(0).title)
        },
        { e ->
          Snackbar.make(lnView, e.message ?: "", Snackbar.LENGTH_LONG).show()
        }
    )

    subscriptions.add(subscription)
  }

  override fun onPause() {
    super.onPause()
    subscriptions.clear()
  }
}
