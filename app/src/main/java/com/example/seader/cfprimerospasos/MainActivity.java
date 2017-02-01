package com.example.seader.cfprimerospasos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarMensajeCorto(){
        Toast.makeText(this, "Soy un toast corto", Toast.LENGTH_SHORT).show();
    }

    public void lanzarMensajeLargo(){
        Toast.makeText(this, "Soy un mensaje largo", Toast.LENGTH_LONG).show();
    }

    public void llamarSegundoActivity(View view){
        lanzarMensajeCorto();
        Intent intent = new Intent(this, SegundoActivity.class);
        //va a ser que arranque nuestra seunda pantallla
        startActivity(intent);

    }
}
