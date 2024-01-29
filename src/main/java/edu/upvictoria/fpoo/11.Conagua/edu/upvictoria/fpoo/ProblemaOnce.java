package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaOnce {
    public ProblemaOnce() {
        System.out.println("PROBLEMA 11");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ProblemaOnce instanciaProblemaOnce = new ProblemaOnce();

        try {
            System.out.println("Ingrese la altura de la alberca en metros: ");
            double altura = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Ingrese la base de la alberca en metros: ");
            double base = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Ingrese la profundidad de la alberca en metros: ");
            double profundidad = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Tarifa por metro cúbico de agua: ");
            double tarifa = Double.parseDouble(bufferedReader.readLine());

            double pago = operacion11.calcularPago(altura, base, profundidad, tarifa);


            System.out.println("El pago por el consumo de agua es: $" + pago);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

