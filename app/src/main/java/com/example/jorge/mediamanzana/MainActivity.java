package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.txtsus);
        t.setText(Html.fromHtml("<p>¿No tienes cuenta? <u>Ir al registro</u></p>").toString());
        findViewById(R.id.iniciarface).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.iniciarface:
                Intent in = new Intent(this, InicioFaceActivity.class);
                startActivity(in);
                break;
        }
    }
}
