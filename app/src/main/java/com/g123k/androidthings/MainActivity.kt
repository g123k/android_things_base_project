package com.g123k.androidthings

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(TextView(this).apply {
      val localIpAddress = Utils.getLocalIpAddress()
      text = localIpAddress
      Log.d("MYIP", localIpAddress)
    })
  }

  override fun onDestroy() {
    super.onDestroy()
  }
}
