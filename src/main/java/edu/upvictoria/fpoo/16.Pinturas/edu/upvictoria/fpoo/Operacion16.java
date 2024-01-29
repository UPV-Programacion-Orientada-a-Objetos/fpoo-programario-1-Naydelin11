package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operacion {

    public Operacion() {
        System.out.println("Pinturas \"La brocha gorda\"");
    }

    public static double calcularCosto() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese el costo por metro cuadrado: ");
            double costoPorMetroCuadrado = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Ingrese la cantidad de metros cuadrados a pintar: ");
            double metrosCuadrados = Double.parseDouble(bufferedReader.readLine());

            return costoPorMetroCuadrado * metrosCuadrados;
        } catch (IOException | NumberFormatException e) {
            System.err.println("Datos incorrectos: " + e.getMessage());
            return 0.0;
        }
    }
}