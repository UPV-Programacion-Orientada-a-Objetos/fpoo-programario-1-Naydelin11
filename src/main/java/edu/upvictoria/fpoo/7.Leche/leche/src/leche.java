import java.util.Scanner;

public class leche {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double galon= 3.785;

        System.out.println("¿Cuántos litros de leche son tu producción de un dia?  ");
        double litros= scanner.nextDouble();

        double pago= litros/galon;

        System.out.printf("Su ganancia es lo de %.2f galones\n", pago);


        }
    }
