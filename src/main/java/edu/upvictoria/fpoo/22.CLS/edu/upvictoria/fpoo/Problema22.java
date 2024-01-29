package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problema22 {
    public Problema22() {
        System.out.println("PROBLEMA 11");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema22 instanciaProblemaOnce = new Problema22();

        try {
            System.out.println("Ingrese el consumo de energía en kilowatts (KW): ");
            double consumoKW = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Tarifa por kilowatt: ");
            double tarifa = Double.parseDouble(bufferedReader.readLine());

            double pago = Operacion22.calcularPago(consumoKW, tarifa);

            System.out.println("El pago por el consumo de energía es: $" + pago);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
