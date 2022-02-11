package com.example.btccalculator;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;

import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCardView cardView = findViewById(R.id.cVkrypto);
        cardView.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "krypto", LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,kalkulator.class));
        });


        cardView = findViewById(R.id.cVklasyczne);
        cardView.setOnClickListener(v -> {
            makeText(MainActivity.this, "klasyczne clicked", LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, kalklasyczne.class));

        });

        cardView = findViewById(R.id.cVcredits);
        cardView.setOnClickListener(v -> {
            makeText(MainActivity.this, "Credits clicked", LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, creddits.class));
        });






    }
    mnozene bb = new mnozene();

    public int add(int a, int b) {
        return 0;
    }




}