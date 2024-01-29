package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema24 {

    public Problema24() {
        System.out.println("PROBLEMA 24");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema24 instanciaProblema24 = new Problema24();

        int porcentaje = 15;

        try {
            System.out.println("Ingrese su sueldo mensual: ");
            double sueldo = Double.parseDouble(bufferedReader.readLine());

            double ahorro = operacion24.CalcularAhorro(sueldo, porcentaje);

            System.out.println("El ahorro por año es de: " + ahorro);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
