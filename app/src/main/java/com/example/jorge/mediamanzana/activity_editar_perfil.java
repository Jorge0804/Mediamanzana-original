package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_editar_perfil extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);
        findViewById(R.id.btn_editar_intereses).setOnClickListener(this);
        findViewById(R.id.btn_guardar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_guardar:
                Intent in = new Intent(this, Perfilhombre.class);
                startActivity(in);
                break;

            case R.id.btn_editar_intereses:
                Intent ini = new Intent(this, activity_cambiar_intereses.class);
                startActivity(ini);
                finish();
                break;
        }
    }
}
