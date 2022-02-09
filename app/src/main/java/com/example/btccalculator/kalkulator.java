package com.example.btccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }
    private void configureBackButton(){
        Button btnBack = (Button) findViewById(R.id.btnback);
        btnBack.setOnClickListener(v -> finish());
    }
}