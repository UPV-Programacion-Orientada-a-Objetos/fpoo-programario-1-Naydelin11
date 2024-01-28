package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema14 {

    public Problema14() {
        System.out.println("PROBLEMA 14");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema14 instanciaProblemaCatorce = new Problema14();

        try {
            System.out.println("Ingrese el año de nacimiento del empleado: ");
            int age = Integer.parseInt(bufferedReader.readLine());


            int Edad = resta.calcularDistancia(age);


            System.out.println("Su edad es de: " + Edad + " años.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Datos incorrectos" + e.getMessage());
        }
    }
}
