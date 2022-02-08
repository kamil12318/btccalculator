package com.example.btccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class creddits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creddits);

        configureBackButton();
    }
    private void configureBackButton(){
        Button btnBack = (Button) findViewById(R.id.btnback);
        btnBack.setOnClickListener(v -> finish());
    }
}