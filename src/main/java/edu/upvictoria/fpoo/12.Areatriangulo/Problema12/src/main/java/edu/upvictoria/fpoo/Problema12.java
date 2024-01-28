package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema12 {
    public Problema12() {
        System.out.println("PROBLEMA 12");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Problema12 instanciaProblema12 = new Problema12();
     try{
         System.out.println("Dame la base del triangulo: ");
         double b= Double.parseDouble(bufferedReader.readLine());
         System.out.println("Dame la altura del triangulo: ");
         double h= Double.parseDouble(bufferedReader.readLine());

         double area= operacion.calcularArea(b,h);
         System.out.println("El area del triangulo es: "+area);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
    }
}

