package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class activity_cambiar_intereses extends AppCompatActivity  {


    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_intereses);
        btn = findViewById(R.id.btnManzana);
        img = findViewById(R.id.imagen);



        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.btnManzana:
                        Intent in = new Intent(activity_cambiar_intereses.this, activity_editar_perfil.class);
                        startActivity(in);
                        break;

                    case R.id.imagen:
                        img.setImageResource(R.drawable.gustos2);
                        break;
                }
            }
        };

        btn.setOnClickListener(click);
        img.setOnClickListener(click);
    }



}
