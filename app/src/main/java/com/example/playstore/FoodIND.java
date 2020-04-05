package com.example.playstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class FoodIND extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_ind);
    }

    public void foodpanda(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDfoodpanda.class);
        startActivity(intent);


    }

    public void zomato(View view) {

        Intent intent = new Intent(FoodIND.this,
                INDzomato.class);
        startActivity(intent);
    }

    public void Swiggy(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDswiggy.class);
        startActivity(intent);
    }

    public void UberEats(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDuberEats.class);
        startActivity(intent);
    }

    public void freshmenu(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDfreshmenu.class);
        startActivity(intent);

    }

    public void BOX8(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDbox8.class);
        startActivity(intent);

    }

    public void faasos(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDfaasos.class);
        startActivity(intent);


    }

    public void innerchef(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDinnerchef.class);
        startActivity(intent);



    }

    public void Domonios(View view) {
        Intent intent = new Intent(FoodIND.this,
                INDdominos.class);
        startActivity(intent);
    }
}
