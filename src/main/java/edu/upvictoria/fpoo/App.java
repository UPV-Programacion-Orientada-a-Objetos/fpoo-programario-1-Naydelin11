package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

                                    System.out.println("Seleccione un problema:");
            System.out.println("1. Problema Uno");         System.out.println("2. Problema Dos");
            System.out.println("3. Problema Tres");        System.out.println("4. Problema Cuatro");
            System.out.println("5. Problema Cinco");       System.out.println("6. Problema Seis");
            System.out.println("7. Problema Siete");       System.out.println("8. Problema Ocho");
            System.out.println("9. Problema Nueve");       System.out.println("10. Problema Diez");
            System.out.println("11. Problema Once");       System.out.println("12. Problema Doce");
            System.out.println("13. Problema Trece");      System.out.println("14. Problema Catorce");
            System.out.println("15. Problema Quince");     System.out.println("16. Problema Dieciseis");
            System.out.println("17. Problema Diecisiete"); System.out.println("18. Problema Dieciocho");
            System.out.println("19. Problema Diecinueve"); System.out.println("20. Problema Veinte");
            System.out.println("21. Problema Veintiuno");  System.out.println("22. Problema Veintidos");
            System.out.println("23. Problema Veintitres"); System.out.println("24. Problema Veinticuatro");
            System.out.println("25. Problema Veinticinco");System.out.println("26. Problema Veintiseis");

                                          System.out.println("0. Salir");

            try {
                int opcion = Integer.parseInt(bufferedReader.readLine());

                if (opcion == 0) {
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                } else if (opcion >= 1 && opcion <= 26) {
                    ejecutarProblema(opcion);
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (IOException | NumberFormatException e) {
                System.err.println("Error de entrada: " + e.getMessage());
            }
        }
    }

    private static void ejecutarProblema(int numeroProblema) {
        switch (numeroProblema) {
            case 1:
                ProblemaUno problemaUno = new ProblemaUno();
                problemaUno.ejecutar();
                break;
            case 2:
                Problema2 problema2 = new ProblemaDos();
                problema2.ejecutar();
                break;
            case 3:
                Problema3 problema3 = new Problema3();
                problema3.ejecutar();
                break;
            case 4:
                Problema4 Problema4 = new Problema4();
                Problema4.ejecutar();
                break;
            case 5:
                Problema5 problema5 = new Problema5();
                problema5.ejecutar();
                break;
            case 6:
                Problema6 problema6 = new Problema6();
                problema6.ejecutar();
                break;
            case 7:
                Problema7 problema7 = new Problema7();
                problema7.ejecutar();
                break;
            case 8:
                ProblemaOcho problemaOcho = new ProblemaOcho();
                problemaOcho.ejecutar();
                break;
            case 9:
                ProblemaNueve problemaNueve = new ProblemaNueve();
                problemaNueve.ejecutar();
                break;
            case 10:
                ProblemaDiez problemaDiez = new ProblemaDiez();
                problemaDiez.ejecutar();
                break;
            case 11:
                ProblemaOnce problemaOnce = new ProblemaOnce();
                problemaOnce.ejecutar();
                break;
            case 12:
                ProblemaDoce problemaDoce = new ProblemaDoce();
                problemaDoce.ejecutar();
                break;
            case 13:
                ProblemaTrece problemaTrece = new ProblemaTrece();
                problemaTrece.ejecutar();
                break;
            case 14:
                Problema14 problema14 = new Problema14();
                problema14.ejecutar();
                break;
            case 15:
                Problema15 problema15 = new Problema15();
                problema15.ejecutar();
                break;
            case 16:
                Problema16 problema16 = new Problema16();
                problema16.ejecutar();
                break;
            case 17:
                Problema17 problema17 = new Problema17();
                problema17.ejecutar();
                break;
            case 18:
                Problema18 problema18 = new Problema18();
                problema18.ejecutar();
                break;
            case 19:
                Problema19 problema19 = new Problema19();
                problema19.ejecutar();
                break;
            case 20:
                Problema20 problema20 = new Problema20();
                problema20.ejecutar();
                break;
            case 21:
                Problema21 problema21 = new Problema21();
                problema21.ejecutar();
                break;
            case 22:
                Problema22 problema22= new Problema22();
                problema22.ejecutar();
                break;
            case 23:
                Problema23 problema23 = new Problema23();
                problema23.ejecutar();
                break;
            case 24:
                Problema24 problema24 = new Problema24();
                problema24.ejecutar();
                break;
            case 25:
                Problema25 problema25 = new Problema25();
                problema25.ejecutar();
                break;
            case 26:
                Problema26 problema26 = new Problema26();
                problema26.ejecutar();
                break;
            default:
                System.out.println("Número de problema no reconocido.");
        }
    }
}
