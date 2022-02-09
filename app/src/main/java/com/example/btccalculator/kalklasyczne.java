package com.example.btccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
            Toast.makeText(kalklasyczne.this, "Euro wybrane", Toast.LENGTH_SHORT).show();
            waluta.kurs = 0.88;
        });

        cardViewSF.setOnClickListener(v -> {
            waluta.kurs = 0.93;
            Toast.makeText(kalklasyczne.this, "Frank Szwajcarski wybrany", Toast.LENGTH_SHORT).show();
        });

        cardViewUSD.setOnClickListener(v -> {
            waluta.kurs = 1.0;
            Toast.makeText(kalklasyczne.this, "Dolar wybran", Toast.LENGTH_SHORT).show();
        });

        cardViewGBP.setOnClickListener(v -> {
            waluta.kurs = 0.74;
            Toast.makeText(kalklasyczne.this, "Funt Brytyjski wybrany", Toast.LENGTH_SHORT).show();
        });

        cardViewPLN.setOnClickListener(v -> {
            waluta.kurs = 3.97;
            Toast.makeText(kalklasyczne.this, "Polski Złoty wybrany", Toast.LENGTH_SHORT).show();
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


        listawalut.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch ((int) position) {
                    case 0:
                        waluta.kurs2 = 0.88;
                        break;
                    case 1:
                        waluta.kurs2 = 1;
                        break;
                    case 2:
                        waluta.kurs2 = 0.93;
                        break;
                    case 3:
                        waluta.kurs2 = 0.74;
                        break;
                    case 4:
                        waluta.kurs2 = 3.97;
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
        String temp = txtIn.getText().toString();
        if (!"".equals(temp)) {
            waluta.b = Integer.parseInt(temp);
            waluta.c = (float) ((waluta.b) / waluta.kurs);
            waluta.wynik = (float) ((waluta.c) * waluta.kurs2);

        }
        TextView txtout = findViewById(R.id.txtout);
        txtout.setText("Wynik to: " + waluta.wynik);
//        Toast.makeText(kalklasyczne.this,  waluta.b +"sfa", Toast.LENGTH_SHORT).show();

//        co się dzieje po wcisniece przycisku

    }
}