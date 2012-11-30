package cl.ateston.helloscala

import android.os.Bundle
import android.app.Activity
import android.view.Menu

class HelloActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hello)
  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater().inflate(R.menu.activity_hello, menu)
    return true
  }
}