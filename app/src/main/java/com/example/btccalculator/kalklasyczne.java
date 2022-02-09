package com.example.btccalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class kalklasyczne extends AppCompatActivity {

    Liczenie Euro = new Liczenie();

    private MaterialCardView cardViewEUR;
    private MaterialCardView cardViewSF;
    private MaterialCardView cardViewUSD;
    private MaterialCardView cardViewPLN;
    private MaterialCardView cardViewGBP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalklasyczne);

        cardViewSF = findViewById(R.id.sf);
        cardViewEUR = findViewById(R.id.cVeur);



        cardViewEUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kalklasyczne.this, "sdfasdfsadfsd", Toast.LENGTH_SHORT).show();
                Euro.kurs = 0.88;
            }
        });











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


        listawalut.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch((int) position){
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

}