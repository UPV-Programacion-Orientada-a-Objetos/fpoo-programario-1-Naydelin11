package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema18 {

    public Problema18(){
        System.out.println("PROBLEMA 18");
    }
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese la distancia del viaje en kilómetros: ");
            String Distancia = bufferedReader.readLine();
            double distancia = Double.parseDouble(Distancia);

            System.out.println("Ingrese el costo por kilómetro: ");
            String CostoxKilometro = bufferedReader.readLine();
            double costoPorKilometro = Double.parseDouble(CostoxKilometro);


            double costoTotal = operacion18.calcularCosto(distancia, costoPorKilometro);

            System.out.println("El costo total del boleto es: $" + costoTotal);

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("Error al ingresar los datos.", e);
        }
    }
}
