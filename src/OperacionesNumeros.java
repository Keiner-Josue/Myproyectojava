import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            System.out.println("El primer número es mayor.");
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
        } else {
            double producto = num1 * num2;
            if (num2 != 0) {
                double division = num1 / num2;
                System.out.println("El segundo número es mayor o igual.");
                System.out.println("Producto: " + producto);
                System.out.println("División: " + division);
            } else {
                System.out.println("El segundo número es cero, no se puede realizar la división.");
                System.out.println("Producto: " + producto);
            }
        }
        
        scanner.close();
    }
}