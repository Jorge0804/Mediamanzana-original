package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PerfilmujerDos extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfilmujer_dos);

        findViewById(R.id.btn_msj).setOnClickListener(this);
        findViewById(R.id.btn_foto).setOnClickListener(this);
        findViewById(R.id.btn_atras).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.atras:
<<<<<<< HEAD
                Intent in1 = new Intent(PerfilmujerDos.this, activity_home.class);
=======
                Intent in1 = new Intent(PerfilmujerDos.this, Inicio.class);
>>>>>>> 1a44fafcdddc0a843bafc1d409f9ee192a1adb44
                startActivity(in1);
                break;
            case R.id.btn_msj:
                Toast.makeText(this, "Solicitud enviada", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_foto:
<<<<<<< HEAD
                Intent in2 = new Intent(PerfilmujerDos.this, activity_fotos_mujer.class);
=======
                Intent in2 = new Intent(PerfilmujerDos.this, FotosMujer.class);
>>>>>>> 1a44fafcdddc0a843bafc1d409f9ee192a1adb44
                startActivity(in2);
                break;

        }
    }
}
