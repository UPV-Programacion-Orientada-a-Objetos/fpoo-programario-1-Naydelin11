package edu.upvictoria.fpoo;

public class semanal {

    public static double calcularSueldoSemanal(int horasTrabajadas, int pagoPorHora, int sueldoMinimo) {

        int horasEstandar = 40;
        double tarifaEstandar = pagoPorHora;
        double tarifaHorasExtras = 1.5 * pagoPorHora;

        if (horasTrabajadas <= horasEstandar) {

            return horasTrabajadas * tarifaEstandar;
        } else {
            return horasEstandar * tarifaEstandar + (horasTrabajadas - horasEstandar) * tarifaHorasExtras;
        }
    }
}
