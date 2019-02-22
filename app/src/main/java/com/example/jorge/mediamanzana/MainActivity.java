package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.iniciarface).setOnClickListener(this);
        findViewById(R.id.iniciargoogle).setOnClickListener(this);
        findViewById(R.id.btnManzana).setOnClickListener(this);
        findViewById(R.id.registrar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent in;

        switch (v.getId())
        {
            case R.id.iniciarface:
                in = new Intent(this, InicioFaceActivity.class);
                startActivity(in);
                break;
            case R.id.iniciargoogle:
                in = new Intent(this, SesionGoogle.class);
                startActivity(in);
                break;
            case R.id.btnManzana:
                //in = new Intent(this, InicioManzana.class);
                //startActivity(in);
                //break;
            case R.id.registrar:
                in = new Intent(this, CuentaManzana.class);
                startActivity(in);
                break;
        }
    }
}
