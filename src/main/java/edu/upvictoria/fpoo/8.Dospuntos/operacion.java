package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class operacion {

    public static double calcularDistancia(Coordenadas punto1, Coordenadas punto2) throws IOException {
        double distancia = Math.sqrt(Math.pow(punto2.x - punto1.x, 2) + Math.pow(punto2.y - punto1.y, 2));

        if (esOrigen(punto1) && esOrigen(punto2)) {
            System.out.println("Ambos puntos están en el origen. La distancia es 0.");
            System.out.println("El resultado es 0");
            return distancia;
        }


        return distancia;
    }

    private static boolean esOrigen(Coordenadas punto) {
        return punto.x == 0 && punto.y == 0;
    }
}
