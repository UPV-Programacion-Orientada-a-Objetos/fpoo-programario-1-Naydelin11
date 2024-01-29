package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemaDiezTest {

    @Test
    public void testCalcular() {

        double mts1 = 2.0;
        double expectedPulgadas1 = mts1 / 0.0254;
        assertEquals(expectedPulgadas1, operacion10.calcular(mts1), 0.001);

        double mts2 = 5.0;
        double expectedPulgadas2 = mts2 / 0.0254;
        assertEquals(expectedPulgadas2, operacion10.calcular(mts2), 0.001);

    }
}
