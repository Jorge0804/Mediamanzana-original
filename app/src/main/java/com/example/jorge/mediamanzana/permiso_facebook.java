package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class permiso_facebook extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permiso_facebook);

        findViewById(R.id.atras).setOnClickListener(this);
        findViewById(R.id.btn_iniciar_face).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.atras:
                finish();
                break;
            case R.id.btn_iniciar_face:
                Intent in = new Intent(this, activity_home.class);
                startActivity(in);
                break;
        }
    }
}
