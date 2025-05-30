import java.util.Scanner;

public class VectorCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInverso = new String[5]; 
        System.out.println("Ingrese 5 cadenas de texto:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }

        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        System.out.println("\nVector original:");
        for (String elemento : vectorOriginal) {
            System.out.println(elemento);
        }

        System.out.println("\nVector en orden inverso:");
        for (String elemento : vectorInverso) {
            System.out.println(elemento);
        }

        scanner.close();
    }
}