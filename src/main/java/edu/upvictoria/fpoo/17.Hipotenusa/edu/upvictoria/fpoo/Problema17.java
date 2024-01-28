package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problema17 {

    public Problema17() {
        System.out.println("PROBLEMA 17");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema17 instanciaProblemaDiecisiete = new Problema17();

        double a, b;

        try {
            System.out.println("Valor del cateto A:__");
            String inputA = bufferedReader.readLine();
            a = Double.parseDouble(inputA);

            System.out.println("Valor del cateto B:__");
            String inputB = bufferedReader.readLine();
            b = Double.parseDouble(inputB);

            double hipotenusa = operacion.calcularTriangulo(a,b);

            System.out.println("La hipotenusa del triángulo es: " + hipotenusa);

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
