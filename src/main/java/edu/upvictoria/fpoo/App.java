
package edu.upvictoria.fpoo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


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

        int choice = scanner.nextInt();


        Main main = new Main();
        main.openFile(choice);
    }
}
