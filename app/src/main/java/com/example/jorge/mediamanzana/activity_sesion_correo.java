



package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_sesion_correo extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_correo);
        findViewById(R.id.olvidar).setOnClickListener(this);
        findViewById(R.id.iniciar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent in;
        switch (v.getId())
        {
            case R.id.olvidar:
                in = new Intent(this, CorreoManzana.class);
                startActivity(in);
                break;

            case R.id.iniciar:
                in = new Intent(this, activity_home.class);
                startActivity(in);
                break;
        }
    }
}
