import java.util.Scanner;
//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        float num1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        float num2 = scanner.nextFloat();

        if (num1>num2) {
            float Suma = num1 +num2;
            float Resta = num1 - num2;
            System.out.println("el resultado de la suma de los dos numeros es: "+Suma);
            System.out.print("el resultado de la resta de los dos numeros es: "+Resta);
         } else if(num2>num1) {
            float multiplicacion = num2 * num1;
            float division = num2 / num1;
            System.out.println("el resultado de la multiplicacion es: "+ multiplicacion);
            System.out.println("el resultado de la division es: "+ division);


            
        }

       scanner.close(); 
    }
}