package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemaNueveTest {

    @Test
    public void testCalcularSueldoSemanal() {

        int horasTrabajadas1 = 35;
        int pagoPorHora1 = 10;
        int sueldoMinimo1 = 249;
        double expectedSueldo1 = horasTrabajadas1 * pagoPorHora1;
        assertEquals(expectedSueldo1, semanal.calcularSueldoSemanal(horasTrabajadas1, pagoPorHora1, sueldoMinimo1), 0.001);

        int horasTrabajadas2 = 45;
        int pagoPorHora2 = 12;
        int sueldoMinimo2 = 249;
        double expectedSueldo2 = 40 * pagoPorHora2 + (horasTrabajadas2 - 40) * 1.5 * pagoPorHora2;
        assertEquals(expectedSueldo2, semanal.calcularSueldoSemanal(horasTrabajadas2, pagoPorHora2, sueldoMinimo2), 0.001);

    }
}
