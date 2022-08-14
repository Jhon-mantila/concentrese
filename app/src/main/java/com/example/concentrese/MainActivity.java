package com.example.concentrese;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;
import java.util.Vector;

public class MainActivity extends Activity {

    private Button play, salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.btnJugar);

        salir = findViewById(R.id.btnSalir);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Inciando Juego....");
                iniciarJuego();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private void iniciarJuego(){
        Intent i = new Intent(this, Concentrese.class);

        startActivity(i);
    }
}