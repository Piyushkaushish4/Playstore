package com.example.playstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OONclickLocal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oonclick_local);
    }

    public void afgha(View view) {
        Intent intent = new Intent(OONclickLocal.this,
                Local_Afgan.class);
        startActivity(intent);
    }

    public void Bangladesh(View view) {
        Intent intent = new Intent(OONclickLocal.this,
                Local_Bangladesh.class);
        startActivity(intent);
    }

    public void Bhutan(View view) {
        Intent intent = new Intent(OONclickLocal.this,
                Local_Bhutan.class);
        startActivity(intent);
    }

    public void India(View view) {
        Intent intent = new Intent(OONclickLocal.this,
                Local_India.class);
        startActivity(intent);
    }

    public void Nepal(View view) {
        Intent intent = new Intent(OONclickLocal.this,
                Local_Nepal.class);
        startActivity(intent);
    }
}
