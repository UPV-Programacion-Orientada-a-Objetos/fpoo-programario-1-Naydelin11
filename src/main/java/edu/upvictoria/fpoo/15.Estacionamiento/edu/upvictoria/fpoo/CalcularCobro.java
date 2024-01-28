package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularCobro {

    public static double calcularCobro(int horasDeUso) {
        double tarifaPorHora;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingresa la tarifa por hora: ");
            tarifaPorHora = Double.parseDouble(bufferedReader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer la tarifa por hora: " + e.getMessage());
            return 0;
        }

        return horasDeUso * tarifaPorHora;
    }
}

