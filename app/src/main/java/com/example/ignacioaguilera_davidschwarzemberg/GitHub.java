package com.example.ignacioaguilera_davidschwarzemberg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class GitHub extends AppCompatActivity {

    private Spinner spnLibros;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub);

        spnLibros = (Spinner)findViewById(R.id.spn);
        txt = (TextView)findViewById(R.id.tv1);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaLibros);

        spnLibros.setAdapter(adapt);
    }
    public void Precios(View v) {
        if (spnLibros.getSelectedItem().toString().equals("Farenheith")) {
            int valorFarenheith = 7000;
            txt.setTextColor(Color.GREEN);
            txt.setText("El valor de el libro es: " + valorFarenheith);
        } else if (spnLibros.getSelectedItem().toString().equals("Revival")) {
            int valorRevival = 22000;
            txt.setTextColor(Color.GREEN);
            txt.setText("El valor del libro es: " + valorRevival);
        } else if (spnLibros.getSelectedItem().toString().equals("El Alquimista")) {
            int valorElAlquimista = 45000;
            txt.setTextColor(Color.GREEN);
            txt.setText("El valor del libro es: " + valorElAlquimista);
        } else if (spnLibros.getSelectedItem().toString().equals("El Poder")) {
            int valorElPoder = 88000;
            txt.setTextColor(Color.GREEN);
            txt.setText("El valor del libro es: " + valorElPoder);
        } else if (spnLibros.getSelectedItem().toString().equals("Despertar")) {
            int valorDespertar = 156000;
            txt.setTextColor(Color.GREEN);
            txt.setText("El valor del libro es: " + valorDespertar);
        }
    }
}