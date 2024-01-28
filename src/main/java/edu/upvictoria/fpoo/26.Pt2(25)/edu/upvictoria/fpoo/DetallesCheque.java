package edu.upvictoria.fpoo;

public class DetallesCheque {
    private double gastosDiariosHotelComida;
    private double gastosOtros;
    private double montoTotal;

    public DetallesCheque(double gastosDiariosHotelComida, double gastosOtros, double montoTotal) {
        this.gastosDiariosHotelComida = gastosDiariosHotelComida;
        this.gastosOtros = gastosOtros;
        this.montoTotal = montoTotal;
    }

    public double getGastosDiariosHotelComida() {
        return gastosDiariosHotelComida;
    }

    public double getGastosOtros() {
        return gastosOtros;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
}
