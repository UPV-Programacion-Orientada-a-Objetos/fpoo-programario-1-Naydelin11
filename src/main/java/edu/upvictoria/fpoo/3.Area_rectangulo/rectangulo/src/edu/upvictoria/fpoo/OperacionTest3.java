package edu.upvictoria.fpoo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacionTest3 {

    @Test
    public void testCalcularArea_PositiveValues() {
        double base = 5.0;
        double altura = 10.0;
        double resultado = Operacion3.CalcularArea(base, altura);
        double resultadoEsperado = base * altura;
        assertEquals(resultadoEsperado, resultado, 0.001);
    }

    @Test
    public void testCalcularArea_NegativeValues() {
        double base = -3.0;
        double altura = 15.0;

    }

    @Test
    public void testCalcularArea_ZeroValues() {
        double base = 0.0;
        double altura = 20.0;

    }


}
