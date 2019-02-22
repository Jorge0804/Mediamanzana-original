package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PerfilmujerActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView btn_mg;
    Boolean verificar =  true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfilmujer);

        btn_mg = findViewById(R.id.btn_mg);
        btn_mg.setOnClickListener(this);
        findViewById(R.id.btn_atras).setOnClickListener(this);
        findViewById(R.id.btn_foto).setOnClickListener(this);
        findViewById(R.id.btn_msj).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.btn_atras:
                Intent in = new Intent(this, Inicio.class);
                startActivity(in);
                break;
            case R.id.btn_mg:
                //Toast.makeText(this, "Se ha agregado a favoritos", Toast.LENGTH_SHORT).show();
                if (verificar)
                {
                    btn_mg.setImageResource(R.drawable.boton_dgm);
                    Toast.makeText(this, "Se ha eliminado a favoritos", Toast.LENGTH_SHORT).show();
                    verificar = false;
                }
                else
                {
                    btn_mg.setImageResource(R.mipmap.boton_mg);
                    Toast.makeText(this, "Se ha agregado a favoritos", Toast.LENGTH_SHORT).show();
                    verificar = true;
                }
                break;
            case R.id.btn_foto:
                Intent in2 = new Intent(PerfilmujerActivity.this, FotosMujer.class);
                startActivity(in2);
                break;
            case R.id.btn_msj:
                Intent in3 = new Intent(PerfilmujerActivity.this, Chat.class);
                startActivity(in3);
                break;

        }

    }
}
