package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sesionfacebook extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesionfacebook);

        findViewById(R.id.atras).setOnClickListener(this);
        findViewById(R.id.iniciarsesion).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.atras:
                finish();
                break;
            case R.id.iniciarsesion:
                Intent in = new Intent(this, permiso_facebook.class);
                startActivity(in);
                break;
        }
    }
}
