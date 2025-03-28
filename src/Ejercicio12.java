import java.util.Scanner;
/*
En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
realizar un programa que lea los sueldos que cobra cada empleado e informe
cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
Además el programa deberá informar el importe que gasta la empresa en sueldos
al personal.
*/
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();

        int empleados100a300 = 0;
        int empleadosMas300 = 0;
        float totalSueldos = 0;

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            float sueldo = scanner.nextFloat();

            if (sueldo >= 100 && sueldo <= 300) {
                empleados100a300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                empleadosMas300++;
            } 

            totalSueldos += sueldo;
        }

        System.out.println("Empleados con sueldos entre $100 y $300: " + empleados100a300);
        System.out.println("Empleados con sueldos mayores a $300: " + empleadosMas300);
        System.out.println("Importe total de sueldos: $" + totalSueldos);

        scanner.close();
    }
}