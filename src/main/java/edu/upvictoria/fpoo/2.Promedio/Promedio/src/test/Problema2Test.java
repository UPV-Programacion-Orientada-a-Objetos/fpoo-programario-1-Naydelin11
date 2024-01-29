package test;

import edu.upvictoria.fpoo.Problema2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Problema2Test {

    @Test
    public void testCalcularPromedio() {
        Problema2 instanciaProblema2 = new Problema2();
        double[] calificaciones = {85.0, 90.0, 75.0, 88.0};


        double resultado = instanciaProblema2.calcularPromedio(calcularSuma(calificaciones), calificaciones.length);

        assertEquals(84.5, resultado, 0.01);
    }


    private double calcularSuma(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma;
    }
}
