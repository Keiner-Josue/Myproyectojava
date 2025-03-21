//Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrse su primer numero: ");
        int num1 = input.nextInt();
        System.out.print("ingrese su segundo numero: ");
        int num2 = input.nextInt();
        if (num1>num2) {
            System.out.print("El numero mayor es: " + num1);
        } else if (num2>num1) {
            System.out.print("El numero mayor es: " + num2);
            
        }else {
            System.out.print("Error los numero son iguales");
        }
        input.close();

    }
}
