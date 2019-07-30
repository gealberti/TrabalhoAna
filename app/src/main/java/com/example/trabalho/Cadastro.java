package com.example.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void onClique(View view){
        EditText peso = (EditText) findViewById(R.id.peso);
        EditText altura = (EditText)findViewById(R.id.altura);


        Intent intent = new Intent(getBaseContext(),IMC.class);
        int pesoint =Integer.parseInt(peso.getText().toString());
        int alturaint =Integer.parseInt(altura.getText().toString());
        Bundle pacote = new Bundle();
        pacote.putInt("pesopassar", pesoint);
        pacote.putInt("alturapassar", alturaint);
        intent.putExtras(pacote);
        Toast.makeText(
                getApplicationContext(),
                "Cadastro realizado com sucesso",
                Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }





    }



