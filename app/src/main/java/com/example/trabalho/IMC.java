package com.example.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);


        Intent intent = getIntent();
        Bundle pacote = intent.getExtras();
        Integer peso = pacote.getInt("pesopassar");
        Integer altura = pacote.getInt("alturapassar");

        TextView resultado = findViewById(R.id.Resultado);
        float alturanova = altura/10;
        float calculo = peso/ (alturanova* alturanova);


        if (calculo <= 18.5) {
            resultado.setText("Seu IMC é "+calculo + "  abaixo do normal!");
        }
        else if (calculo > 25.0 && calculo <= 30.0) {
            resultado.setText("Seu IMC é " +calculo + "  acima do normal!");
        }
        else if (calculo > 30) {
            resultado.setText("Seu IMC é " + calculo + "  obesidade!");
        }
    }








}