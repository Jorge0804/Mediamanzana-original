package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Favoritos extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        findViewById(R.id.btn_home).setOnClickListener(this);
        findViewById(R.id.btn_foto1).setOnClickListener(this);
        findViewById(R.id.btn_foto2).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_home:
                Intent in = new Intent(this, Inicio.class);
                startActivity(in);
                break;
            case R.id.btn_foto1:
                Intent in2 = new Intent(this, FotoSelena.class);
                startActivity(in2);
                break;
            case R.id.btn_foto2:
                Intent in3 = new Intent(this, FotoSelena.class);
                startActivity(in3);
                break;
        }

    }
}
