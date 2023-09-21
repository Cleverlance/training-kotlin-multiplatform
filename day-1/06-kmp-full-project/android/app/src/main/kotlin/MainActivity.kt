package app.android

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import hello
import platform

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            TextView(this).apply {
                text = hello(platform)
            }
        )
    }
}