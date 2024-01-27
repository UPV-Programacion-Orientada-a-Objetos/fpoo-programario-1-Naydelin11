import  java.util.Scanner;

public class area_rectangulo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        int b,h;

        System.out.printf(" \nAREA RECTANGULO \n");

            System.out.print("Dame la base: ");
            b = scanner.nextInt();
            System.out.print("Dame la altura: ");
            h = scanner.nextInt();

        double area = b*h;
        System.out.println("El area del rectangulo es: " +area + " m\u00B2");
    }
}