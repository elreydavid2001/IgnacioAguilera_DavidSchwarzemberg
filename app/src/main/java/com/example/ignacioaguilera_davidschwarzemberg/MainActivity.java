package com.example.ignacioaguilera_davidschwarzemberg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText Usuario, Contraseña;
    private ProgressBar progressBar;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText) findViewById(R.id.usuario);
        Contraseña = (EditText) findViewById(R.id.contraseña);
        progressBar = (ProgressBar) findViewById(R.id.pb);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Task().execute();
            }
        });


        progressBar.setVisibility(View.INVISIBLE);
    }
    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {

            progressBar.setVisibility(View.VISIBLE);
        }


        @Override
        protected String doInBackground(String... strings) {

            for(int i = 1; i < 10; i++)
            {
                try {
                    Thread.sleep(1000);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override
        protected void onPostExecute(String s) {

            progressBar.setVisibility(View.INVISIBLE);

            Intent i = new Intent(getBaseContext(), GitHub.class);
            startActivity(i);

        }

    }
    public void Libros(View v)
    {
        ArrayList<String> libros = new ArrayList<String>();

        libros.add("Farenheith");
        libros.add("Revival");
        libros.add("El Alquimista");

        Intent i = new Intent(getBaseContext(), GitHub.class);
        i.putExtra("listaLibros", libros);
        startActivity(i);
    }
}