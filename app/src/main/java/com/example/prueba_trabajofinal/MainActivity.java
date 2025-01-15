package com.example.prueba_trabajofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //creamos los atributos/variables que vaya a necesitar para interactuar
    private EditText num1;
    private EditText num2;

    private Button botonSuma;
    private Button botonResta;
    private Button botonMultiplicacion;
    private Button botonDivision;


    private TextView textoResultado;


    // el oncreate es el main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // lo primero que hacemos es asociar los elementos de la interfa con las variables creadas
        num1 = findViewById(R.id.editTextText);
        num2 = findViewById(R.id.editTextText2);

        textoResultado = findViewById(R.id.textViewResultado);

        botonSuma = findViewById(R.id.btnSumar);
        botonDivision = findViewById(R.id.btnDividir);
        botonMultiplicacion = findViewById(R.id.btnMultiplicar);
        botonResta = findViewById(R.id.btnRestar);


        // los eventos de los botones
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            //el onclick es lo que se va a ejecutar cuando hagamos click
            public void onClick(View view) {
                int suma = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                textoResultado.setText(String.valueOf(suma));
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resta = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                textoResultado.setText(String.valueOf(resta));
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int MULT = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                textoResultado.setText(String.valueOf(MULT));
            }
        });
        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int div = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                textoResultado.setText(String.valueOf(div));
            }
        });


    }
}

