package com.example.jorge.mediamanzana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContrasenaGoogle extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrasena_google);

        findViewById(R.id.atras).setOnClickListener(this);
        findViewById(R.id.btn_atras).setOnClickListener(this);
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
        }
    }
}
