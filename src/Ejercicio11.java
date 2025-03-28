import java.util.Scanner;
/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores.
*/
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notasMayoresIguales7 = 0;
        int notasMenores7 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            float nota = scanner.nextFloat();

            if (nota >= 7) {
                notasMayoresIguales7++;
            } else {
                notasMenores7++;
            }
        }

        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + notasMayoresIguales7);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + notasMenores7);

        scanner.close();
    }
}