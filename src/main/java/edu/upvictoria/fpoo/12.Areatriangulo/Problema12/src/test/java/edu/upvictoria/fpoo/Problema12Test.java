package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problema12Test {

    @Test
    public void testCalcularArea() {

        double base1 = 4.0;
        double altura1 = 5.0;
        double expectedArea1 = base1 * altura1 / 2;
        assertEquals(expectedArea1, operacion12.calcularArea(base1, altura1), 0.001);


        double base2 = 6.0;
        double altura2 = 8.0;
        double expectedArea2 = base2 * altura2 / 2;
        assertEquals(expectedArea2, operacion12.calcularArea(base2, altura2), 0.001);


    }
}
