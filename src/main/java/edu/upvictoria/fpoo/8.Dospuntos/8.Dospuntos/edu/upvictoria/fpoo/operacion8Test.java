package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacionTest {

    @Test
    void testCalcularDistancia() {
        Coordenadas punto1 = new Coordenadas(1.0, 2.0);
        Coordenadas punto2 = new Coordenadas(4.0, 6.0);

        try {
            double distancia = operacion8.calcularDistancia(punto1, punto2);

            assertEquals(5.0, distancia, 0.0001);

        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
    }

}