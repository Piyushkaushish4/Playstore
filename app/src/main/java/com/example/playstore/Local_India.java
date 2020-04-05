package com.example.playstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Local_India extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local__india);
    }

    public void snapdeal(View view) {
        Intent intent = new Intent(Local_India.this,
                INDsnapdeal.class);
        startActivity(intent);
    }

    public void jabong(View view) {
        Intent intent = new Intent(Local_India.this,
                INDjabong.class);
        startActivity(intent);
    }

    public void Myntra(View view) {
        Intent intent = new Intent(Local_India.this,
                INDmyntra.class);
        startActivity(intent);

    }

    public void localbanya(View view) {
        Intent intent = new Intent(Local_India.this,
                INDlocalbanya.class);
        startActivity(intent);

    }

    public void homeshop18(View view) {
        Intent intent = new Intent(Local_India.this,
                INDhomeshp18.class);
        startActivity(intent);
    }

    public void shopclues(View view) {
        Intent intent = new Intent(Local_India.this,
                INDshopclues.class);
        startActivity(intent);

    }

    public void Lenskart(View view) {
        Intent intent = new Intent(Local_India.this,
                INDlenskart.class);
        startActivity(intent);
    }

    public void voonik(View view) {
        Intent intent = new Intent(Local_India.this,
                INDvoonik.class);
        startActivity(intent);

    }

    public void urbanclap(View view) {
        Intent intent = new Intent(Local_India.this,
                INDurbanclap.class);
        startActivity(intent);
    }

    public void zivame(View view) {
        Intent intent = new Intent(Local_India.this,
                INDzivame.class);
        startActivity(intent);

    }
}
