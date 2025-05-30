import java.util.Scanner;

public class SueldoOperario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = scanner.nextDouble();

        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = scanner.nextInt();

        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldo *= 1.20; 
                System.out.println("Se otorga un aumento del 20%.");
            } else {
                sueldo *= 1.05;
                System.out.println("Se otorga un aumento del 5%.");
            }
        } else {
            System.out.println("El sueldo permanece sin cambios.");
        }

        System.out.println("Sueldo final a pagar: " + sueldo);

        scanner.close();
    }
}