package edu.upvictoria.fpoo;

public class Operacion21 {

    public static double calcularPago(double altura, double ancho, double profundidad, double tarifa) {
        double volumen = altura * ancho * profundidad;
        double pago = volumen * tarifa;
        return pago;
    }
}
