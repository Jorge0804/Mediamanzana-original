package com.example.jorge.mediamanzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        findViewById(R.id.btn_atras).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                Intent in = new Intent(Chat.this, activity_home.class);
=======
                Intent in = new Intent(Chat.this, Inicio.class);
>>>>>>> 1a44fafcdddc0a843bafc1d409f9ee192a1adb44
                startActivity(in);
            }
        });
    }
}
