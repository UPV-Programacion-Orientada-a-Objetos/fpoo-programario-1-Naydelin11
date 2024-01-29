package edu.upvictoria.fpoo;

import java.io.IOException;

public class Operacion22{

    public static double calcularPago(double consumoKW, double tarifa) throws IOException {
        double pago = consumoKW * tarifa;
        return pago;
    }
}
