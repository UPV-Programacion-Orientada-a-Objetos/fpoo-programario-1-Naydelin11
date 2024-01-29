package edu.upvictoria.fpoo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problema5Test {

    @Test
    public void testCalcularAB() {
        double result = operacion5.CalcularAB(3.0, 4.0);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testCalcularC() {
        double result = C_op.CalcularC(3.0, 4.0, 2.0);
        assertEquals(5.0, result, 0.0001);
    }
}

