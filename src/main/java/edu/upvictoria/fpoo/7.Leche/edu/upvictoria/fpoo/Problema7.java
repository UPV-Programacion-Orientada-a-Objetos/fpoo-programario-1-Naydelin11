package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema7 {
    public Problema7() {
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema7 instanciaProblema7 = new Problema7();

        double galon = 3.785;

        try {
            System.out.println("¿Cuántos litros de leche son tu producción de un día?  ");
            double litros = Double.parseDouble(bufferedReader.readLine());

            double pago = operacion7.CalcularGalones(litros, galon);

            String formattedPago = String.format("%.2f", pago);
            System.out.println("El pago de tu producción es de: $" + formattedPago);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
