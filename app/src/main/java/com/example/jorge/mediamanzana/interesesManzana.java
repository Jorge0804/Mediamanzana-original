package com.example.jorge.mediamanzana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class interesesManzana extends AppCompatActivity  {

    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intereses_manzana);

        img = findViewById(R.id.imagen);
        btn = findViewById(R.id.btnManzana);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.imagen:
                        img.setImageResource(R.drawable.gustos2);
                        break;
                }
            }
        };

        img.setOnClickListener(click);
    }
}
