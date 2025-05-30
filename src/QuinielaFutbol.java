import java.util.Scanner;

public class QuinielaFutbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPartidos = 15;

        String[][] equipos = new String[numPartidos][2];

        int[][] resultados = new int[numPartidos][2];

        System.out.println("Ingrese los equipos de los 15 partidos:");
        for (int i = 0; i < numPartidos; i++) {
            System.out.print("Equipo 1 del partido " + (i + 1) + ": ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Equipo 2 del partido " + (i + 1) + ": ");
            equipos[i][1] = scanner.nextLine();
        }

        System.out.println("\nIngrese los resultados (goles de cada equipo):");
        for (int i = 0; i < numPartidos; i++) {
            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
        }

        System.out.println("\nResultados de la quiniela de fútbol:");
        for (int i = 0; i < numPartidos; i++) {
            System.out.println(equipos[i][0] + " " + resultados[i][0] + " - " + resultados[i][1] + " " + equipos[i][1]);
        }

        scanner.close();
    }
}