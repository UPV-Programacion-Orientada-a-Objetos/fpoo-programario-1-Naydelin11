package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema2 {

    public Problema2() {
        System.out.println("PROBLEMA 2");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema2 instanciaProblema2 = new Problema2();

        try {
            double suma_calf = 0;
            for (int i = 1; i < 5; i++) {
                System.out.print("Dame la calificación de tu examen " + i + ": \n");
                double examen = Double.parseDouble(bufferedReader.readLine());
                suma_calf += examen;
            }

            double promedio = calcularPromedio(suma_calf, 4);

            System.out.println("Promedio final es: " + promedio);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static double calcularPromedio(double suma, int cantidadExamenes) {
        return suma / cantidadExamenes;
    }
}
