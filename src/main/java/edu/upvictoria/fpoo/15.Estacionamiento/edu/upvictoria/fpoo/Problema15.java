package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problema15 {

    public Problema15() {
        System.out.println("PROBLEMA 15");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Problema15 instanciaProblema15 = new Problema15();

        try {
            System.out.println("Ingrese la hora de entrada (en formato militar, sin minutos)\n ejemplo 9:00 --> 0900: ");
            int horaEntrada = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Ingrese la hora de salida (en formato militar, sin minutos): ");
            int horaSalida = Integer.parseInt(bufferedReader.readLine());

            int horasDeUso = CalcularHoras.calcularHorasDeUso(horaEntrada, horaSalida);
            double cobro = CalcularCobro.calcularCobro(horasDeUso);

            System.out.println("Horas de uso: " + horasDeUso);
            System.out.println("Cobro total: $" + cobro);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Datos incorrectos" + e.getMessage());
        }
    }

}