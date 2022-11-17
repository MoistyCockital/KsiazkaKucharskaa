package com.example.kukux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ListViewKategorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListViewKategorie = findViewById(R.id.ListView);
        ListViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                        String kategoria = adapterView.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this, kategoria+" pod indeksem "+i, Toast.LENGTH_SHORT).show();
                    }

        }
        );
    }
}