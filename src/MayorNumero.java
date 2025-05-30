import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Verificar que los números sean distintos
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
        } else {
            // Mostrar el número mayor
            double mayor = (num1 > num2) ? num1 : num2;
            System.out.println("El número mayor es: " + mayor);
        }

        scanner.close();
    }
}