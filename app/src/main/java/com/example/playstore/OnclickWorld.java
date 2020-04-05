package com.example.playstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OnclickWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclick_world);
    }

    public void groupong(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                GroupPon.class);
        startActivity(intent);
    }

    public void amazon(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Amazon.class);
        startActivity(intent);
    }

    public void ebay(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Ebay.class);
        startActivity(intent);
    }

    public void walmart(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Wlamart.class);
        startActivity(intent);
    }

    public void alibaba(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Alibaba.class);
        startActivity(intent);
    }

    public void target(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Target.class);
        startActivity(intent);
    }

    public void bestbuy(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                BestBuy.class);
        startActivity(intent);
    }

    public void flipcart(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Flipcart.class);
        startActivity(intent);
    }

    public void shop(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Shop.class);
        startActivity(intent);
    }

    public void ikea(View view) {
        Intent intent = new Intent(OnclickWorld.this,
                Ikea.class);
        startActivity(intent);
    }
}
