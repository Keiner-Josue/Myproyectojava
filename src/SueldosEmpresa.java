import java.util.Scanner;

public class SueldosEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();

        int contador100a300 = 0;
        int contadorMas300 = 0;
        double totalSueldos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo >= 100 && sueldo <= 300) {
                contador100a300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                contadorMas300++;
            } else {
                System.out.println("Error: El sueldo debe estar entre $100 y $500.");
                i--; 
                continue;
            }

            totalSueldos += sueldo;
        }

        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + contador100a300);
        System.out.println("Cantidad de empleados que cobran más de $300: " + contadorMas300);
        System.out.println("Total gastado en sueldos: $" + totalSueldos);

        scanner.close();
    }
}