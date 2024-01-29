package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class operacion11 {

    public static double calcularPago(double altura, double ancho, double profundidad, double tarifa) throws IOException {
        double volumen = altura * ancho * profundidad;
        double pago = volumen * tarifa;
        return pago;
    }
}
