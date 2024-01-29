package edu.upvictoria.fpoo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacionTest4 {

    @Test
    public void testCalcularArea() {

        double radio = 5.0;


        double resultado = operacion.calcularArea(radio);


        assertEquals(78.54, resultado, 0.01);
    }
}
