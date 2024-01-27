package edu.upvictoria.fpoo;

import junit.framework.Assert;
import junit.framework.Assert.*;
import org.example.*;
import org.junit.Test;


import static junit.framework.Assert.asser
public class sumaTest {
    public void sumar_dos_numeros_negativos(){

        int a=-10;
        int b=-15;

        suma s=new suma();

        assertEquals(-25, s.sumar(a,b));

    }

    @Test
    public void sumar_dos_numeros_positivos() {
        int a=10;
        int b=15;

        suma s=new suma();
        assertEquals(25,s.sumar (a,b));
        
    }
}