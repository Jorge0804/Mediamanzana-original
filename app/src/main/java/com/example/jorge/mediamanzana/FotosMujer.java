package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FotosMujer extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos_mujer);

        findViewById(R.id.btn_fotosSelena).setOnClickListener(this);

        findViewById(R.id.btn_atras).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(FotosMujer.this, Inicio.class);
                startActivity(in);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent in = new Intent(FotosMujer.this, FotoSelena.class);
        startActivity(in);
    }
}
