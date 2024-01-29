package edu.upvictoria.fpoo;

public class ProblemaUno {
    private String color;

    public static void main(String[] args) {

        {
            System.out.println("\nPROBLEMA 1\n");
            System.out.println("Sumar dos números");

            edu.upvictoria.fpoo.suma s = new edu.upvictoria.fpoo.suma();


            int numero1 = 10;
            int numero2 = 20;


            int resultado = s.sumar(numero1, numero2);
            System.out.println("El resultado de la suma es: " + resultado);
        }
    }
}
