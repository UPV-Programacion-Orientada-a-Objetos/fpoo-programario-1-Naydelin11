package edu.upvictoria.fpoo;

import java.io.*;

public class ProblemaTrece {
    public ProblemaTrece() {
        System.out.println("PROBLEMA 13");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ProblemaTrece instanciaProblemaTrece = new ProblemaTrece();

        try {
            System.out.println("Cantidad de su dinero (MXN): ");
            double peso = Double.parseDouble(bufferedReader.readLine());


            double dolares = Operacion13.DolarApesos(peso);

            System.out.println(peso + " pesos mexicanos equivalen a " + dolares + " dólares.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

