package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Perfilhombre extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfilhombre);

        findViewById(R.id.btn_cerrar_sesion).setOnClickListener(this);
        findViewById(R.id.btn_atras).setOnClickListener(this);
        findViewById(R.id.btn_camara).setOnClickListener(this);
        findViewById(R.id.btn_editar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_cerrar_sesion:
                Intent in = new Intent(this, MainActivity.class);
                startActivity(in);
                break;
            case R.id.btn_atras:
                Intent in2 = new Intent(this, activity_home.class);
                startActivity(in2);
                break;
            case R.id.btn_camara:
            Intent in3 = new Intent(this, Galeria.class);
            startActivity(in3);
            break;
            case R.id.btn_editar:
                Intent in4 = new Intent(this, activity_editar_perfil.class);
                startActivity(in4);
                break;
        }
    }
}
