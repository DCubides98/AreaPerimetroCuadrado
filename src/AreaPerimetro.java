import java.util.Scanner;

public class AreaPerimetro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("POR FAVOR INGRESE EL LADO DE UN CUADRADO: ");

        double lado = scanner.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("El area del cuadrado es: " + area);
        System.out.println("El area del perimetro es: " + perimetro);

        scanner.close();
    }
}