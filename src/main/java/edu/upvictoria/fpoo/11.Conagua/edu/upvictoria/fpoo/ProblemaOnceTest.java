package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemaOnceTest {

    @Test
    public void testCalcularPago() throws IOException {

        double altura1 = 3.0;
        double ancho1 = 5.0;
        double profundidad1 = 2.0;
        double tarifa1 = 0.05;
        double expectedPago1 = altura1 * ancho1 * profundidad1 * tarifa1;
        assertEquals(expectedPago1, operacion11.calcularPago(altura1, ancho1, profundidad1, tarifa1), 0.001);


        double altura2 = 4.0;
        double ancho2 = 6.0;
        double profundidad2 = 3.0;
        double tarifa2 = 0.08;
        double expectedPago2 = altura2 * ancho2 * profundidad2 * tarifa2;
        assertEquals(expectedPago2, operacion11.calcularPago(altura2, ancho2, profundidad2, tarifa2), 0.001);

    }
}
