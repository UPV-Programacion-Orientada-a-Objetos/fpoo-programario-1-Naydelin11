import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor del lado A: ");
        float a = scanner.nextFloat();
        System.out.println("Ingresa el valor del lado B: ");
        float b = scanner.nextFloat();
        System.out.println("Ingresa el valor del lado C: ");
        float c = scanner.nextFloat();

        if (c==0) {
            float A_T = (a * b) / 2; //triangulo rectangulo
            System.out.println("El area del terreno es: "+A_T);
        } else{

            float A_P = ((a+a-c)*c)/2; //trapecio

            System.out.println("El area del terreno es: "+A_P);
        }


        scanner.close();
    }
}