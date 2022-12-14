package com.example.kukux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {

    ArrayAdapter<Przepis> adapterPrzepisy;
    ListView listViewPrzepisy;
    public static final String EXTRA_IDPRZEPISU = "id_przepisu";
    public static final String EXTRA_KATEGORIA = "id_kategorii";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        int kategoria = (int)getIntent().getExtras().getInt(MainActivity.EXTRA_KATEGORIA);
        Toast.makeText(this, Integer.toString(kategoria), Toast.LENGTH_SHORT).show();

        ArrayList<Przepis> wybranePrzepisty = RepozytoriumPrzepisow.wybierzPrzepisy(kategoria);
        adapterPrzepisy = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, wybranePrzepisty);

        listViewPrzepisy = findViewById(R.id.listViewPrzepisow);
        listViewPrzepisy.setAdapter(adapterPrzepisy);

        listViewPrzepisy.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intencja = new Intent(ListaPrzepisowActivity.this, PrzepisActivity.class);
                        intencja.putExtra(EXTRA_IDPRZEPISU, i);
                        intencja.putExtra(EXTRA_KATEGORIA, kategoria);
                        startActivity(intencja);
                    }
                }
        );

    }

}