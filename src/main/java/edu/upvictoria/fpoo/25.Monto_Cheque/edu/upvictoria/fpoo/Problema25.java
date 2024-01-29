package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema25 {

    public Problema25() {
        System.out.println("PROBLEMA 25");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema25 instanciaProblema25 = new Problema25();

        try {
            System.out.println("Ingrese el sueldo mensual del empleado: ");
            double sueldo = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Ingrese el número de días que el empleado estará en Monterrey: ");
            int diasEnMonterrey = Integer.parseInt(bufferedReader.readLine());

            double montoCheque = operacion25.CalcularMontoCheque(sueldo, diasEnMonterrey);

            System.out.println("El monto del cheque a proporcionar es de: $" + montoCheque);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
