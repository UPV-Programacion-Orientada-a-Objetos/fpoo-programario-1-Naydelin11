package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class resta {

    public static int calcularDistancia(int age) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int resta = 0;
        boolean opc;

        System.out.println("¿Cumple años en Enero?\n 1.Si 0.No  ");
        opc = Boolean.parseBoolean(bufferedReader.readLine());

        if (opc=true) {
            resta = 2024;
        } else {
            resta = 2023;
        }

        int edad = resta - age;

        return edad;
    }
}
