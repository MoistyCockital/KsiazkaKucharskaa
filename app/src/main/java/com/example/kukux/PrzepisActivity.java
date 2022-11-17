package com.example.kukux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrzepisActivity extends AppCompatActivity {
    TextView tytul;
    TextView skladniki;
    ImageView obrazek;
    Button share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int ktoryPrzepis = getIntent().getExtras().getInt(ListaPrzepisowActivity.EXTRA_IDPRZEPISU, 0);
        int kategoria = getIntent().getExtras().getInt(ListaPrzepisowActivity.EXTRA_KATEGORIA, 0);
        Przepis przepis = RepozytoriumPrzepisow.wybierzPrzepisy(kategoria).get(ktoryPrzepis);

        tytul = findViewById(R.id.tytul);
        skladniki = findViewById(R.id.skladniki);
        obrazek = findViewById(R.id.imageView);
        share = findViewById(R.id.button);

        obrazek.setImageResource(przepis.getIdObrazka());
        tytul.setText(przepis.getNazwa());
        skladniki.setText(przepis.getListaSkladnikow());

    }
}