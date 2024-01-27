
import java.util.Scanner;

public class tresfig{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;

        System.out.printf("\nAREA DE LA FIGURA\n");
        System.out.println("Ingrese el valor de la hipotenusa: ");
        float H = scanner.nextFloat();

        System.out.println("Ingrese el valor de uno de los catetos: ");
        float R = scanner.nextFloat();

        float area_triangulos = (H * R) / 2;
        float area_semicirculo = (float) (pi* (R *R) / 2);

        float area_total = area_semicirculo+area_triangulos;
        System.out.println("El area de la forma A es: " + area_total);


        scanner.close();

        }
}
