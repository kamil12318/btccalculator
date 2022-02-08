package com.example.btccalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    private MaterialCardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cVkrypto);
        cardView.setOnClickListener(v -> Toast.makeText(MainActivity.this, "krypto clicked", Toast.LENGTH_SHORT).show());

        cardView = findViewById(R.id.cVklasyczne);
        cardView.setOnClickListener(v -> Toast.makeText(MainActivity.this, "klasyczne clicked", Toast.LENGTH_SHORT).show());

        cardView = findViewById(R.id.cVcredits);
        cardView.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Credits clicked", Toast.LENGTH_SHORT).show());







    }


}