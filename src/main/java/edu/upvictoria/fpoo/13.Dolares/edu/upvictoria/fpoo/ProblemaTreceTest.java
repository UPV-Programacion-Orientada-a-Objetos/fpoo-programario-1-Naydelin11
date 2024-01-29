package edu.upvictoria.fpoo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemaTreceTest {

    @Test
    public void OP() {

        double pesos1 = 100.0;
        double expectedDolares1 = 0.058 * pesos1;
        assertEquals(expectedDolares1, Operacion13.DolarApesos(pesos1), 0.001);


        double pesos2 = 200.0;
        double expectedDolares2 = 0.058 * pesos2;
        assertEquals(expectedDolares2, Operacion13.DolarApesos(pesos2), 0.001);

    }
}
