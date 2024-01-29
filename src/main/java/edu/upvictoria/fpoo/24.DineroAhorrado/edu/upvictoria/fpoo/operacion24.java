package edu.upvictoria.fpoo;

import java.io.IOException;

public class operacion24 {

    public static double CalcularAhorro(double sueldo, int porcentaje) throws IOException {
        porcentaje = 15;

        double ahorroSemanal = sueldo * (porcentaje / 100.0);
        double ahorroAnual = ahorroSemanal * 52;

        return ahorroAnual;
    }
}
