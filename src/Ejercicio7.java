//Confeccionar un programa que permita cargar un número entero positivo
//de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
//Mostrar un mensaje de error si el número de cifras es mayor.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un numero entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 999) {
            if (numero >= 1 && numero<10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero >=10 && numero<100) {
                System.out.println("El número tiene 2 cifras.");
            } else {
                System.out.println("El número tiene 3 cifras.");
            }
        } else {
            System.out.println("Error: El número ingresado tiene más de 3 cifras o no es positivo.");
        }

        
      scanner.close();
    }
}