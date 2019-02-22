package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioFaceActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciofacebook);

        findViewById(R.id.atras).setOnClickListener(this);
        findViewById(R.id.btn_sesion).setOnClickListener(this);
        findViewById(R.id.usuarios).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.atras:
                finish();
                break;
        }

        if(v.getId() != R.id.atras)
        {
            Intent in = new Intent(this, Sesionfacebook.class);
            startActivity(in);
        }
    }
}
