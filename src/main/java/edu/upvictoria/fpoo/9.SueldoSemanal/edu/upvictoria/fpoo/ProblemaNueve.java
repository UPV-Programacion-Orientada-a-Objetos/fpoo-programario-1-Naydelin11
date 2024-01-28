package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProblemaNueve {
    public ProblemaNueve() {
        System.out.println("PROBLEMA 9");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ProblemaNueve instanciaProblemaNueve = new ProblemaNueve();

        int sueldo_minimo = 249;

        try {
            System.out.println("¿Cuántas horas trabaja a la semana?");
            String input = bufferedReader.readLine();
            int horasSemana = Integer.parseInt(input);

            System.out.println("Pago por hora: ");
            String input2 = bufferedReader.readLine();
            int pagoPorHora = Integer.parseInt(input2);

            // Llamada al método calcularSueldoSemanal de la clase Semanal
            double sueldo_semanal = semanal.calcularSueldoSemanal(horasSemana, pagoPorHora, sueldo_minimo);

            // Mostrar el sueldo semanal
            System.out.println("El sueldo semanal del trabajador es: $" + sueldo_semanal);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
