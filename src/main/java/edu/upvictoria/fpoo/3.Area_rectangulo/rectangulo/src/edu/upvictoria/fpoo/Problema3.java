package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema3 {
    public Problema3() {
        System.out.println("PROBLEMA 3");
    }

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema3 instanciaProblema3 = new Problema3();

        try {
            System.out.println("Ingrese la base: ");
           double b= Integer.parseInt(bufferedReader.readLine());

            System.out.println("Ingrese la altura: ");
            double h = Integer.parseInt(bufferedReader.readLine());

            double Area = Operacion3.CalcularArea(b,h);

            System.out.println("El are del rectangulo es: " + Area+"m\u00B2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
