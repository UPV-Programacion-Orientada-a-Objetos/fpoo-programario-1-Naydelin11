package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema16 {

    public Problema16() {
        System.out.println("PROBLEMA 16");
    }

    public static void main(String[] args) {
        Operacion16 instanciaProblemaPintura = new Operacion16();

        double costoTotal = Operacion16.calcularCosto();

        System.out.println("El costo total por la pintura es: $" + costoTotal);
    }

}