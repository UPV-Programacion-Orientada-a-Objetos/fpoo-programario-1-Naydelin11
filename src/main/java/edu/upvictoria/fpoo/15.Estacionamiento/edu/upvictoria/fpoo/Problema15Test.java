package edu.upvictoria.fpoo;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problema15Test {
    @Test
    public void testCalcularCobro() {

        String input = "10.0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));


        double result = CalcularCobro.calcularCobro(5);

        assertEquals(50.0, result, 0.001);

        System.setIn(System.in);
    }
}
