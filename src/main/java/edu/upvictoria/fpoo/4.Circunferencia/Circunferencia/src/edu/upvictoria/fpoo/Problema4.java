package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema4 {
    public Problema4() {
        System.out.println("PROBLEMA 4");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema4 instanciaProblema4 = new Problema4();

        double radio, area = 0;

        try {
            System.out.println("Ingrese el radio: ");
            radio = Double.parseDouble(bufferedReader.readLine());


            area = operacion.calcularArea(radio);

            System.out.println("El área de una circunferencia es: " + area);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
