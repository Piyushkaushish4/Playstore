package com.example.playstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView W;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void world(View view) {
        Intent intent = new Intent(MainActivity.this,
                OnclickWorld.class);
        startActivity(intent);



    }

    public void local(View view) {
        Intent intent = new Intent(MainActivity.this,
                OONclickLocal.class);
        startActivity(intent);


    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity.this,
                FoodIND.class);
        startActivity(intent);


    }
}


