package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_mostrar_mensajes extends AppCompatActivity implements
        View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_mensajes);
        findViewById(R.id.btn_continuar).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent in = new Intent(this, interesesManzana.class);
        startActivity(in);
    }
}
