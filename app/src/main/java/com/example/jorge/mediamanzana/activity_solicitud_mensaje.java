package com.example.jorge.mediamanzana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_solicitud_mensaje extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_mensaje);

        findViewById(R.id.btn_rechazar).setOnClickListener(this);
        findViewById(R.id.btn_aceptar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn_rechazar:
                Toast.makeText(this, "Se ha rechazado la solicitud", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_aceptar:
                Toast.makeText(this, "Se ha aceptado la solicitud", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
