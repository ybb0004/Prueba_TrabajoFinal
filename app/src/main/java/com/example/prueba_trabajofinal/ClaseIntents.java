package com.example.prueba_trabajofinal;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

public class ClaseIntents {

    public static void siguientePagina( TextView textView, Context context) {
        obtener.setCorrecto(esCorrecto);  // Asegúrate de que 'obtener' esté definido y accesible
        int contador=0;
        contador++;
        if (esCorrecto == true &&contador<=1) {
            botonCorrecto.setBackgroundColor(botonCorrecto.getContext().getResources().getColor(R.color.verde)); // Cambia a verde
            botonError1.setEnabled(false);
            botonError2.setEnabled(false);
            botonCorrecto.setEnabled(false);

            String mensaje1 = context.getString(R.string.animo1, nombre); // Combina el string con la variable
            textView.setText(mensaje1); // Establece el texto en el TextView

            respuestas.add(esCorrecto);

        } else if (esCorrecto == false &&contador<=1) {
            botonCorrecto.setBackgroundColor(botonCorrecto.getContext().getResources().getColor(R.color.verde)); // Cambia a verde
            botonError1.setBackgroundColor(botonError1.getContext().getResources().getColor(R.color.rojo));
            botonError2.setBackgroundColor(botonError2.getContext().getResources().getColor(R.color.rojo));
            botonError1.setEnabled(false);
            botonError2.setEnabled(false);
            botonCorrecto.setEnabled(false);

            String mensaje2 = context.getString(R.string.animo2, nombre); // Combina el string con la variable
            textView.setText(mensaje2); // Establece el texto en el TextView
        }


    }
}
