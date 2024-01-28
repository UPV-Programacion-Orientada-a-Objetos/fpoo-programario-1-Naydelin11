package edu.upvictoria.fpoo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class sumaTest {

    @Test
    public void sumar_dos_numeros_negativos() {
        int a = -10;
        int b = -15;

        suma s = new suma();

        assertEquals(-25, s.sumar(a, b));
    }

    @Test
    public void sumar_dos_numeros_positivos() {
        int a = 10;
        int b = 15;

        suma s = new suma();
        assertEquals(25, s.sumar(a, b));
    }
}
