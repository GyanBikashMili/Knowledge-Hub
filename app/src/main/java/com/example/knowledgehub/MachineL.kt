package com.example.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MachineL : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_l)

        val webViewVariable = findViewById<WebView>(R.id.MLwebview);
        webviewSetUp(webViewVariable);
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://developers.google.com/machine-learning/crash-course/ml-intro")
        }

    }
}
