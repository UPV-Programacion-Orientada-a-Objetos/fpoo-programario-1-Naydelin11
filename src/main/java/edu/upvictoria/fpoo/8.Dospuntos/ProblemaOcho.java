package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Coordenadas {
    double x;
    double y;

    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class ProblemaOcho {

    public ProblemaOcho() {
        System.out.println("PROBLEMA 8");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ProblemaOcho instanciaProblemaOcho = new ProblemaOcho();

        try {
            System.out.println("Ingrese las coordenadas del primer punto:");
            System.out.print("Coordenada x: ");
            double x1 = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Coordenada y: ");
            double y1 = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Ingrese las coordenadas del segundo punto:");
            System.out.print("Coordenada x: ");
            double x2 = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Coordenada y: ");
            double y2 = Double.parseDouble(bufferedReader.readLine());

            Coordenadas punto1 = new Coordenadas(x1, y1);
            Coordenadas punto2 = new Coordenadas(x2, y2);

           double distancia= operacion.calcularDistancia(punto1, punto2);
            System.out.println("La distancia entre los puntos es: " +distancia);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Datos incorrectos" + e.getMessage());
        }
    }
}
