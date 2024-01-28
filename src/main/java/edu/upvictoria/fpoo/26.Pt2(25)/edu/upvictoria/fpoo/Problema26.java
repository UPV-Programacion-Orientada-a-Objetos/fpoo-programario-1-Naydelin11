package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema26 {

    public Problema26() {
        System.out.println("PROBLEMA 26");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema26 instanciaProblema26 = new Problema26();

        try {
            System.out.println("Ingrese el sueldo mensual del empleado: ");
            double sueldo = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Ingrese el número de días que el empleado estará en Monterrey: ");
            int diasEnMonterrey = Integer.parseInt(bufferedReader.readLine());

            DetallesCheque detallesCheque = operacion.CalcularMontoCheque(sueldo, diasEnMonterrey);

            System.out.println("Detalles del cheque:");
            System.out.println("Gastos diarios (hotel y comida): $" + detallesCheque.getGastosDiariosHotelComida());
            System.out.println("Otros gastos: $" + detallesCheque.getGastosOtros());
            System.out.println("Monto total del cheque: $" + detallesCheque.getMontoTotal());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
