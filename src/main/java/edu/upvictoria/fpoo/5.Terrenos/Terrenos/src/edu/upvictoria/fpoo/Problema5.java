package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema5 {
    public Problema5() {
        System.out.println("PROBLEMA 5");
        System.out.println(" AREA DE LA FIGURA FORMA A");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema5 instanciaProblema5 = new Problema5();

        try {
            System.out.println("Ingrese el valor de A: ");
            double A = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Ingrese el valor de B: ");
            double B = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Ingrese el valor de C: ");
            double C = Double.parseDouble(bufferedReader.readLine());

            double area;
            if (C == 0) {

                area = operacion.CalcularAB(A, B);
            } else {

                area = C_op.CalcularC(A, B, C);
            }

            System.out.println("El área de la figura es: " + area);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
