package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problema14Test {

    @Test
    public void testCalcularDistancia() throws IOException {

        int age1 = 1990;
        int expectedEdad1 = 2023 - age1;
        assertEquals(expectedEdad1, resta.calcularDistancia(age1));

        int age2 = 1985;
        int expectedEdad2 = 2023 - age2;
        assertEquals(expectedEdad2,resta.calcularDistancia(age2));

    }
}
