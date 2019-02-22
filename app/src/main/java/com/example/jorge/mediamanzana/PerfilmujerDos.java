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
                Intent in1 = new Intent(PerfilmujerDos.this, Inicio.class);
                startActivity(in1);
                break;
            case R.id.btn_msj:
                Toast.makeText(this, "Solicitud enviada", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_foto:
                Intent in2 = new Intent(PerfilmujerDos.this, FotosMujer.class);
                startActivity(in2);
                break;

        }
    }
}
