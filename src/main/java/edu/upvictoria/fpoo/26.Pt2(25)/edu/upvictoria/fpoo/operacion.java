package edu.upvictoria.fpoo;

public class operacion {

    public static DetallesCheque CalcularMontoCheque(double sueldo, int diasEnMonterrey) {
        double porcentajeHotelComida = 0.1; // 10% del sueldo
        int otrosGastosDiarios = 100;

        double gastosDiarios = sueldo * porcentajeHotelComida;
        double gastosOtros = otrosGastosDiarios * diasEnMonterrey;

        double montoCheque = gastosDiarios * diasEnMonterrey + gastosOtros;

        return new DetallesCheque(gastosDiarios * diasEnMonterrey, gastosOtros, montoCheque);
    }
}
