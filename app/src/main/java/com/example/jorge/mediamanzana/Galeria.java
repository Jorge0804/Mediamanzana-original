package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Galeria extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

<<<<<<< HEAD

=======
        findViewById(R.id.btn_atras).setOnClickListener(this);
>>>>>>> 1a44fafcdddc0a843bafc1d409f9ee192a1adb44
        findViewById(R.id.btn_tres_fotos).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
<<<<<<< HEAD

=======
            case R.id.btn_atras:
                Intent in1 = new Intent(this, Perfilhombre.class);
                startActivity(in1);
                break;
>>>>>>> 1a44fafcdddc0a843bafc1d409f9ee192a1adb44
            case R.id.btn_tres_fotos:
                Intent in2 = new Intent(this, Publicar.class);
                startActivity(in2);
                break;
        }

    }
}
