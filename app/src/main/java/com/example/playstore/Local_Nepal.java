package com.example.playstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Local_Nepal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local__nepal);
    }

    public void daraj(View view) {
        Intent intent = new Intent(Local_Nepal.this,
                NEPdaraj.class);
        startActivity(intent);
    }

    public void sastodeal(View view) {
        Intent intent = new Intent(Local_Nepal.this,
                Nepsastodeal.class);
        startActivity(intent);

    }

    public void nepbay(View view) {
        Intent intent = new Intent(Local_Nepal.this,
                Nepnepbay.class);
        startActivity(intent);
    }

    public void socheko(View view) {
        Intent intent = new Intent(Local_Nepal.this,
                Nepsocheko.class);
        startActivity(intent);

    }

    public void hamrobazar(View view) {
        Intent intent = new Intent(Local_Nepal.this,
                Nephamrobazar.class);
        startActivity(intent);


    }
}
