//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero positivo de uno o dos digitos :");
        float num = scanner.nextFloat();

        if (num>=1 && num<10) {
            System.out.print("el numero tiene un solo digito");
        } else if(num>=10 && num<100) {
            System.out.println("el numero tiene dos digitos");
        }else {
            System.out.println("el numero no esta dentro del rango, tiene mas de dos digitos ");
        }
          
        scanner.close();
    }
}