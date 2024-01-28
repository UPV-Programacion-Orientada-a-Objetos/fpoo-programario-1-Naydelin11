package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

    public class Problema19 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("PROBLEMA 19");
            System.out.println("Ingrese la distancia en kilómetros:");
            String innDistancia = bufferedReader.readLine();
            double distancia = Double.parseDouble(innDistancia);

            System.out.println("Ingrese la velocidad en kilómetros por hora:");
            String innVelocidad = bufferedReader.readLine();
            double velocidad = Double.parseDouble(innVelocidad);

            
            double tiempo = CalculoTiempo.calcularTiempo(distancia, velocidad);

            System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas");
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
