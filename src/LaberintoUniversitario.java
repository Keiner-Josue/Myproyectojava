import java.util.Random;
import java.util.Scanner;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar el laberinto con valores aleatorios del 1 al 9
        for (int fila = 0; fila < laberinto.length; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        // Instrucciones del reto
        System.out.println(" ¡Bienvenido al Laberinto Universitario!\r\n" + //
                        "        Este sistema representa los pasillos secretos de tu facultad.\r\n" + //
                        "        Cada número indica un nivel de energía en ese punto.\r\n" + //
                        "        Tu misión es explorar este laberinto cumpliendo los siguientes desafíos:\r\n" + //
                        "\r\n" + //
                        "        1. Contar cuántos números pares hay mayores a 4. ⚡\r\n" + //
                        "        2. Calcular el promedio de los números impares. 🎯\r\n" + //
                        "        3. Calcular la suma de los valores de cada fila. 🧮\r\n" + //
                        "        4. BONUS: Encuentra la posición del mayor número del laberinto. 👑");
        promedioImpares(laberinto);
        sumaValoresPorFila(laberinto);
        posicionMayorNumero(laberinto);
        contarParesMayoresA4(laberinto);

        // Aquí puedes invocar los métodos para cada uno de los puntos anteriores
        // Por ejemplo:
        // contarParesMayoresA4(laberinto);
        // promedioImpares(laberinto);
        // etc...

        scanner.close();
    }
    public static void contarParesMayoresA4(int[][] matriz) {
    int contador = 0;
    for (int[] fila : matriz) {
        for (int valor : fila) {
            if (valor % 2 == 0 && valor > 4) {
                contador++;
            }
        }
    }
    System.out.println("Cantidad de números pares mayores a 4: " + contador);
}

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void promedioImpares(int[][] matriz) {
        int suma = 0;
        int contador = 0;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    contador++;
                }
            }
        }

        double promedio = (contador == 0) ? 0 : (double) suma / contador;
        System.out.println("Promedio de números impares: " + promedio);
    }
    public static void sumaValoresPorFila(int[][] matriz){
    for (int i = 0; i < matriz.length; i++) {
        int suma = 0;
        for (int j = 0; j < matriz[i].length; j++) {
            suma += matriz[i][j];
        }
        System.out.println("La suma de los valores de la fila " + (i + 1) + " es: " + suma);
    }
}
    public static void posicionMayorNumero(int[][] matriz) {
    int max = matriz[0][0];
    int filaMax = 0;
    int colMax = 0;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] > max) {
                max = matriz[i][j];
                filaMax = i;
                colMax = j;
            }
        }
    }
    System.out.println("El mayor número es " + max + " y está en la posición: [" + filaMax + "][" + colMax + "]");
}
    // Aquí puedes agregar los métodos necesarios para resolver el laberinto
    // Ejemplo:
    // public static void contarParesMayoresA4(int[][] matriz) { ... }

}