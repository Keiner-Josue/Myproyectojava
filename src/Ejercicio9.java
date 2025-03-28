/*
Confeccionar un programa que pida por teclado tres notas de un alumno,
calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
*/

import java.util.Scanner;

public class PromedioEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera nota del estudiante: ");
        float Nota1 = scanner.nextFloat();
        System.out.print("Ingrese la segunda nota del estudiante: ");
        float Nota2 = scanner.nextFloat();
        System.out.print("Ingrese la tercera nota del estudiante: ");
        float Nota3 = scanner.nextFloat();

        float Promedio = (Nota1 +Nota2+Nota3) /3;

        if (Promedio>=7) {
            System.out.println("Promocionado");
        } else if (Promedio>=4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado ");
        }
        scanner.close();
    }
}