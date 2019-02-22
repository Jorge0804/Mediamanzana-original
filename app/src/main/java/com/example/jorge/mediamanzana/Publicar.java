package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Publicar extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);

        findViewById(R.id.btn_atras).setOnClickListener(this);
        findViewById(R.id.btn_publicar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_atras:
                Intent in1 = new Intent(this, Inicio.class);
                startActivity(in1);
                break;
            case R.id.btn_publicar:
                Intent in2 = new Intent(this, Perfilhombre.class);
                startActivity(in2);
                break;
        }
    }
}
