import java.util.Scanner;

public class TransporteConductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numConductores = 3; 
        int diasSemana = 7;

        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][diasSemana];
        int[] total_kms = new int[numConductores];

        System.out.println("Ingrese el nombre y los kilómetros recorridos cada día por los conductores:");
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            for (int j = 0; j < diasSemana; j++) {
                System.out.print("Kilómetros recorridos el día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                total_kms[i] += kms[i][j]; 
            }
            scanner.nextLine();
        }

        System.out.println("\nLista de conductores y kilómetros recorridos:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + " recorrió un total de " + total_kms[i] + " km.");
        }

        scanner.close();
    }
}