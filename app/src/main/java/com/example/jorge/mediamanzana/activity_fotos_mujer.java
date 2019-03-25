package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_fotos_mujer extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos_mujer);
        findViewById(R.id.imagen).setOnClickListener(this);
        findViewById(R.id.imagen2).setOnClickListener(this);
        findViewById(R.id.imagen3).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent in = new Intent(activity_fotos_mujer.this, activity_fotos_laselena.class);
        startActivity(in);
    }

}
