package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InteresesManzana1 extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intereses_manzana1);

        findViewById(R.id.btn_continuar2).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent in = new Intent(InteresesManzana1.this, PreferenciasManzana.class);
        startActivity(in);
    }

}
