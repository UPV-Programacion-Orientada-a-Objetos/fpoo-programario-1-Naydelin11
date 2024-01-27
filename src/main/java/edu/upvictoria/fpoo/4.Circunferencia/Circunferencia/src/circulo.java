import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double pi= Math.PI,radio;
    double area=0;

        System.out.printf("\nAREA DE UNA CIRCUNFERENCIA\n");

        System.out.println("Dame el radio");
        radio= scanner.nextInt();

        area= pi*(radio*radio);
        System.out.println("El area es: "+area);


    }
}