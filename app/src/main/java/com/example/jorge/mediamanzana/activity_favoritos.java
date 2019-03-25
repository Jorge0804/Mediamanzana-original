package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_favoritos extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        findViewById(R.id.btn_home).setOnClickListener(this);
        findViewById(R.id.btn_foto1).setOnClickListener(this);
        findViewById(R.id.btn_foto2).setOnClickListener(this);
        findViewById(R.id.btn_perfil).setOnClickListener(this);
        findViewById(R.id.btn_fperfil).setOnClickListener(this);
        findViewById(R.id.btn_mensaje).setOnClickListener(this);
        findViewById(R.id.btn_solicitud_mensaje).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent in;

        switch (v.getId())
        {
            case R.id.btn_home:
                in = new Intent(this, activity_home.class);
                startActivity(in);
                break;
            case R.id.btn_foto1:
                in = new Intent(this, PerfilmujerActivity.class);
                startActivity(in);
                break;
            case R.id.btn_foto2:
                in = new Intent(this, PerfilmujerDos.class);
                startActivity(in);
                break;
            case R.id.btn_perfil:
                in = new Intent(this, Perfilhombre.class);
                startActivity(in);
                break;
            case R.id.btn_fperfil:
                in = new Intent(this, Perfilhombre.class);
                startActivity(in);
                break;
            case R.id.btn_mensaje:
                in = new Intent(this, activity_bandeja_mensajes.class);
                startActivity(in);
                break;
            case R.id.btn_solicitud_mensaje:
                in = new Intent(this, activity_solicitud_mensaje.class);
                startActivity(in);
                break;

        }


    }
}
