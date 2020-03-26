package com.karthick.radiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relativeLayout);
        webView = findViewById(R.id.webView);
    }

    public void onRadioColorClicked(View view) {

        switch (view.getId()) {

            case R.id.red:
                //CAN SET COLOR MENTIONED IN COLORS.XML
                relativeLayout.setBackgroundColor(getColor(R.color.red));
                break;

            case R.id.green:
                //CAN USE PREDEFINED COLORS FROM THE Color CLASS
                relativeLayout.setBackgroundColor(Color.GREEN);
                break;

            case R.id.blue:
                //CAN USE GETCOLOR(int) METHOD BUT IT IS DEPRECATED AS OF API 23
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                break;
        }
    }

    public void onRadioWebViewClicked(View view) {

        final String google = getResources().getString(R.string.google);
        final String yahoo = getResources().getString(R.string.yahoo);

        switch (view.getId()) {

            case R.id.google:
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(google);
                break;

            case R.id.yahoo:
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(yahoo);
                break;
        }
    }
}
