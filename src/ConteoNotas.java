import java.util.Scanner;

public class ConteoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorMayorIgual7 = 0;
        int contadorMenor7 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                contadorMayorIgual7++;
            } else {
                contadorMenor7++;
            }
        }

        System.out.println("Cantidad de alumnos con nota mayor o igual a 7: " + contadorMayorIgual7);
        System.out.println("Cantidad de alumnos con nota menor a 7: " + contadorMenor7);

        scanner.close();
    }
}