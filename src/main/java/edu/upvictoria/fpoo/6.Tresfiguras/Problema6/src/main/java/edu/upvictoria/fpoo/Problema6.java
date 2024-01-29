package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el valor de la hipotenusa: ");
        float H = Float.parseFloat(reader.readLine());

        System.out.println("Ingrese el valor de uno de los catetos: ");
        float R = Float.parseFloat(reader.readLine());

        reader.close();

        float area_total = operacion1_6.calcularArea(H, R);


        System.out.println("El área total de la forma A es: " + area_total);
    }
}
