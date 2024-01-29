package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaDiez {
    public ProblemaDiez() {
        System.out.println("PROBLEMA DIEZ");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ProblemaDiez instanciaProblemaDiez = new ProblemaDiez();

        try {
            System.out.println("Metros de tela: ");
            double mts = Double.parseDouble(bufferedReader.readLine());

            double pulgadas = operacion10.calcular(mts);
            System.out.println("En total son " + pulgadas + " pulgadas");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
