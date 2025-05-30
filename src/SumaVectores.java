import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Ingrese 5 valores para vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese 5 valores para vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("\nVector1: ");
        for (int num : vector1) {
            System.out.print(num + " ");
        }

        System.out.println("\nVector2: ");
        for (int num : vector2) {
            System.out.print(num + " ");
        }

        System.out.println("\nVector3 (suma de Vector1 + Vector2): ");
        for (int num : vector3) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}