package com.example.kmm.android

import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kmm.Greeting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val commonClass = Greeting()

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = commonClass.greeting()

        val wbHome: WebView = findViewById(R.id.wb_home)
        wbHome.loadUrl(commonClass.getUrl())

    }
}
