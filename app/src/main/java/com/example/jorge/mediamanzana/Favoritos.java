package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Favoritos extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        findViewById(R.id.btn_home).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent in;

        switch (v.getId())
        {
            case R.id.btn_home:
                in = new Intent(this, Inicio.class);
                startActivity(in);
                break;
        }

    }
}
