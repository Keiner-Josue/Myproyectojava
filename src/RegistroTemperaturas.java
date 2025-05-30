import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 5;
        double[] tempMin = new double[dias];
        double[] tempMax = new double[dias];

        for (int i = 0; i < dias; i++) {
            System.out.print("Ingrese la temperatura mínima del día " + (i + 1) + ": ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            tempMax[i] = scanner.nextDouble();
        }

        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < dias; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media + "°C");
        }

        double menorTemp = tempMin[0];
        int diaMenor = 1;
        for (int i = 1; i < dias; i++) {
            if (tempMin[i] < menorTemp) {
                menorTemp = tempMin[i];
                diaMenor = i + 1;
            }
        }
        System.out.println("\nEl día con menor temperatura mínima fue el día " + diaMenor + " con " + menorTemp + "°C.");

        System.out.print("\nIngrese una temperatura máxima para buscar: ");
        double tempBuscar = scanner.nextDouble();
        boolean encontrado = false;

        System.out.println("Días con temperatura máxima igual a " + tempBuscar + "°C:");
        for (int i = 0; i < dias; i++) {
            if (tempMax[i] == tempBuscar) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay días con esa temperatura máxima.");
        }

        scanner.close();
    }
}