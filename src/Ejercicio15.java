import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        int resultadoComparacion = nombre1.compareToIgnoreCase(nombre2);

        if (resultadoComparacion < 0) {
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (resultadoComparacion > 0) {
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Los nombres son iguales (ignorando mayúsculas/minúsculas).");
        }

        scanner.close();
    }
}