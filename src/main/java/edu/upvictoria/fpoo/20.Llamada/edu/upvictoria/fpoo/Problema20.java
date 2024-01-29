package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problema20 {
    public Problema20() {
        System.out.println("PROBLEMA 20");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("¿Cuántos minutos duró en llamada? (NO HORAS NI SEGUNDOS)");
            String inLlamada = bufferedReader.readLine();
            double llamada = Double.parseDouble(inLlamada);

            System.out.println("¿Costo por minuto? ");
            String incosto = bufferedReader.readLine();
            double costo = Double.parseDouble(incosto);

            double total = Operacion20.Calcularllamada(llamada, costo);

            System.out.println("El costo de la llamada es:  " + total);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer la entrada. Asegúrate de ingresar valores válidos.");
        }
    }
}
