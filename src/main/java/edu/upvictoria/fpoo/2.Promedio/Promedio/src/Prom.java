import java.util.Scanner;

public class Prom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examen;
        double suma_calf=0;

        for (int i=1;i<5;i++) {
            System.out.print("Dame la calificacion de tu examen " +i);
            examen= scanner.nextInt();
           suma_calf += examen;

        }
        double promedio = suma_calf /4;

        System.out.println("Promedio final es: "+promedio);
        scanner.close();

        }
    }
