package edu.upvictoria.fpoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problema7Test {

    @Test
    public void testCalcularGalones() {

        double litros1 = 10.0;
        double galon1 = 3.785;
        double expectedPago1 = 10.0 / 3.785;
        assertEquals(expectedPago1, edu.upvictoria.fpoo.operacion7.CalcularGalones(litros1, galon1), 0.001);


        double litros2 = 20.0;
        double galon2 = 3.785;
        double expectedPago2 = 20.0 / 3.785;
        assertEquals(expectedPago2, edu.upvictoria.fpoo.operacion7.CalcularGalones(litros2, galon2), 0.001);

    }
}
