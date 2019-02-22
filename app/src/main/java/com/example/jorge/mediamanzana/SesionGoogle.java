package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SesionGoogle extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_google);

        findViewById(R.id.atras).setOnClickListener(this);
        findViewById(R.id.btn_atras).setOnClickListener(this);
        findViewById(R.id.btn_siguiente).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.atras:
                finish();
                break;
            case R.id.btn_atras:
                finish();
                break;
            case R.id.btn_siguiente:
                Intent in = new Intent(this, ContrasenaGoogle.class);
                startActivity(in);
                break;
        }
    }
}
