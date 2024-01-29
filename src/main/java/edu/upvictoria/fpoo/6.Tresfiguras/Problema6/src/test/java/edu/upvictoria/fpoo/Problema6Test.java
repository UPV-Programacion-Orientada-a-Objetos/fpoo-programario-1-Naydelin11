package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problema6Test {

    @Test
    public void testCalcularArea() {

        float H1 = 5.0f;
        float R1 = 3.0f;
        float expectedArea1 = (float) (Math.PI * Math.pow(R1, 2) / 2 + (H1 * R1) / 2);
        assertEquals(expectedArea1, operacion1_6.calcularArea(H1, R1), 0.001);

        float H2 = 8.0f;
        float R2 = 4.0f;
        float expectedArea2 = (float) (Math.PI * Math.pow(R2, 2) / 2 + (H2 * R2) / 2);
        assertEquals(expectedArea2, operacion1_6.calcularArea(H2, R2), 0.001);

    }
}
