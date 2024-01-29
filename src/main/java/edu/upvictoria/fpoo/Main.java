package edu.upvictoria.fpoo;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

public class Main {
    public void openFile (int choice) {
        String[] filePaths = {
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/1.Suma_numeros/edu/upvictoria/fpoo/ProblemaUno.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/2.Promedio/Promedio/src/edu/upvictoria/fpoo/Problema2.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/3.Area_rectangulo/rectangulo/src/edu/upvictoria/fpoo/Problema3.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/4.Circunferencia/Circunferencia/src/edu/upvictoria/fpoo/Problema4.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/5.Terrenos/Terrenos/src/edu/upvictoria/fpoo/Problema5.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/6.Tresfiguras/Problema6/src/main/java/edu/upvictoria/fpoo/Problema6.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/7.Leche/edu/upvictoria/fpoo/Problema7.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/8.Dospuntos/8.Dospuntos/edu/upvictoria/fpoo/ProblemaOcho.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/9.SueldoSemanal/edu/upvictoria/fpoo/ProblemaNueve.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/10.Modista/edu/upvictoria/fpoo/ProblemaDiez.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/11.Conagua/edu/upvictoria/fpoo/ProblemaOnce.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/12.Areatriangulo/Problema12/src/main/java/edu/upvictoria/fpoo/Problema12.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/13.Dolares/edu/upvictoria/fpoo/ProblemaTrece.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/14.Contratarpersonal/edu/upvictoria/fpoo/Problema14.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/15.Estacionamiento/edu/upvictoria/fpoo/Problema15.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/16.Pinturas/edu/upvictoria/fpoo/Problema16.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/17.Hipotenusa/edu/upvictoria/fpoo/Problema17.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/18.Autobuses/edu/upvictoria/fpoo/Problema18.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/19.Tiempo_bicicleta/edu/upvictoria/fpoo/Problema19.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/20.Llamada/edu/upvictoria/fpoo/Problema20.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/21.CONAGUA/edu/upvictoria/fpoo/Problema21.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/22.CLS/edu/upvictoria/fpoo/Problema22.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/23.Pago_articulo/edu/upvictoria/fpoo/Problema23.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/24.DineroAhorrado/edu/upvictoria/fpoo/Problema24.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/25.Monto_Cheque/edu/upvictoria/fpoo/Problema25.java",
                "/home/naydelinpink/Escritorio/PROGRAMARIO1/src/main/java/edu/upvictoria/fpoo/26.Pt2(25)/edu/upvictoria/fpoo/Problema26.java"
        };


        if (choice < 1 || choice > filePaths.length) {
            System.out.println("Opción no válida.");
            return;
        }
        try {
            Desktop.getDesktop().open(new File(filePaths[choice - 1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
