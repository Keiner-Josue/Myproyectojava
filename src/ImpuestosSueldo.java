import java.util.Scanner;

public class ImpuestosSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su sueldo en dólares: ");
        double sueldo = scanner.nextDouble();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos.");
        } else {
            System.out.println("No necesita abonar impuestos.");
        }

        scanner.close();
    }
}