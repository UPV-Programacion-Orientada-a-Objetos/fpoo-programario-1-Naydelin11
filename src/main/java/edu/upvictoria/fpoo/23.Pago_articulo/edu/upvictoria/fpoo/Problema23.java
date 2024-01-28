package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problema23 {
    public Problema23() {
        System.out.println("PROBLEMA 23");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema23 instanciaProblema23 = new Problema23();

        try {
            System.out.println("Escriba el precio original del artículo: ");
            double articulo = Double.parseDouble(bufferedReader.readLine());


            int IVA = 15;
            int descuento = 20;

            double precioFinal = operacion.CalcularProducto(articulo, IVA, descuento);
            System.out.println("El precio final del producto es: $" + precioFinal);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
