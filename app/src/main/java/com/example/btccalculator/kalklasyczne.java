package com.example.btccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class kalklasyczne extends AppCompatActivity {

    Liczenie waluta = new Liczenie();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalklasyczne);

        MaterialCardView cardViewSF = findViewById(R.id.sf);
        MaterialCardView cardViewEUR = findViewById(R.id.cVeur);
        MaterialCardView cardViewUSD = findViewById(R.id.cVusd);
        MaterialCardView cardViewGBP = findViewById(R.id.cVgbp);
        MaterialCardView cardViewPLN = findViewById(R.id.cVpln);

        cardViewEUR.setOnClickListener(v -> {
            Toast.makeText(kalklasyczne.this, "sdfasdfsadfsd", Toast.LENGTH_SHORT).show();
            waluta.kurs = 0.88;
        });

        cardViewSF.setOnClickListener(v -> {
            waluta.kurs = 0.93;
            Toast.makeText(kalklasyczne.this, waluta.kurs + "", Toast.LENGTH_SHORT).show();
        });

        cardViewUSD.setOnClickListener(v -> {
            waluta.kurs = 1.0;
            Toast.makeText(kalklasyczne.this, waluta.kurs + "", Toast.LENGTH_SHORT).show();
        });

        cardViewGBP.setOnClickListener(v -> waluta.kurs = 0.74);

        cardViewPLN.setOnClickListener(v -> waluta.kurs = 3.97);


        Spinner listawalut = findViewById(R.id.spinner);

        ArrayList<String> waluty = new ArrayList<>();
        waluty.add("Euro");
        waluty.add("Dolar");
        waluty.add("Frank");
        waluty.add("Funt");
        waluty.add("Złoty");

        ArrayAdapter<String> walutyAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                waluty
        );
        listawalut.setAdapter(walutyAdapter);


        listawalut.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch ((int) position) {
                    case 0:

                    case 1:
                        Toast.makeText(kalklasyczne.this, " asdfasdfsdafsadfsdafsadf", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });








    }

    public void btnClicked(View view) {
        EditText txtIn = findViewById(R.id.txtIn);
        String temp=txtIn.getText().toString();
        if(!"".equals(temp)){
            waluta.b = Integer.parseInt(temp);

        }
        Toast.makeText(kalklasyczne.this,  waluta.b +"sfa", Toast.LENGTH_SHORT).show();
//        co się dzieje po wcisniece przycisku
    }
}