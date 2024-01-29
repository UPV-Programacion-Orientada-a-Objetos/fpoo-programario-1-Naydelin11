package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class operacion(1)6 {
    public static float calcularArea(float H, float R) {

        float area_triangulos = (H * R) / 2;

        double pi = Math.PI;
        float area_semicirculo = (float) (pi * (R * R) / 2);



        return area_semicirculo + area_triangulos;
    }
}
