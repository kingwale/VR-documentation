package com.zybooks.myapplication;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);

        // Enable JavaScript (optional)
        webView.getSettings().setJavaScriptEnabled(true);

        // Load local HTML file from assets
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/Untitled-3.html");
    }
}
