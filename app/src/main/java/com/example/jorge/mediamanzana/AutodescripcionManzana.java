package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AutodescripcionManzana extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autodescripcion_manzana);

        findViewById(R.id.btn_siguiente).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent in = new Intent(this, activity_situacion_sentimental.class);
        startActivity(in);
    }
}
