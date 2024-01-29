package edu.upvictoria.fpoo;

import java.io.IOException;

public class Operacion {

    public static double DolarApesos(double peso) {
        // Utiliza una tasa de cambio fija (0.058) para la conversión
        double tasaCambio = 0.058;
        return tasaCambio * peso;
    }
}
