import java.util.Scanner;

public class ContadorCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo de hasta tres cifras: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else {
            System.out.println("Error: El número tiene más de 3 cifras.");
        }

        scanner.close();
    }
}