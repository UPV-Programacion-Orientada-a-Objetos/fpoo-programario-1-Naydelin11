package edu.upvictoria.fpoo;

public class Operacion {

    public static double calcularPago(double altura, double ancho, double profundidad, double tarifa) {
        double volumen = altura * ancho * profundidad;
        double pago = volumen * tarifa;
        return pago;
    }
}
