import java.util.Scanner;

public class DigitosNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("El número tiene un dígito.");
            } else {
                System.out.println("El número tiene dos dígitos.");
            }
        } else {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 99.");
        }

        scanner.close();
    }
}