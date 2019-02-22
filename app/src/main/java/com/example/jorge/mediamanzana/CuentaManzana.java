package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CuentaManzana extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_manzana);

        findViewById(R.id.btn_registrar).setOnClickListener(this);
        findViewById(R.id.btn_cancelar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_registrar)
        {
            Intent in = new Intent(this, SaludoManzana.class);
            startActivity(in);
        }
        else
        {
            finish();
        }
    }
}
