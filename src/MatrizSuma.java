import java.util.Scanner;

public class MatrizSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5]; 
        System.out.println("Ingrese los valores para la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }

        scanner.close();
    }
}