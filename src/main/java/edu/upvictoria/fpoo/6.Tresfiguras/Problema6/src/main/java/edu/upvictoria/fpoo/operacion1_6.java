package edu.upvictoria.fpoo;

public class operacion1_6 {
    public static float calcularArea(float H, float R) {

        float area_triangulos = (H * R) / 2;

        double pi = Math.PI;
        float area_semicirculo = (float) (pi * (R * R) / 2);



        return area_semicirculo + area_triangulos;
    }
}
