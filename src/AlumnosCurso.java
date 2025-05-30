import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        System.out.println("Ingrese el nombre y la edad de cada alumno (Ingrese '*' para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) {
                break; 
            }

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }

        if (!edades.isEmpty()) {
            int maxEdad = edades.get(0);
            String alumnoMayor = nombres.get(0);

            for (int i = 1; i < edades.size(); i++) {
                if (edades.get(i) > maxEdad) {
                    maxEdad = edades.get(i);
                    alumnoMayor = nombres.get(i);
                }
            }

            System.out.println("\nEl alumno más mayor es: " + alumnoMayor + " con " + maxEdad + " años.");
        } else {
            System.out.println("\nNo se ingresaron datos.");
        }

        scanner.close();
    }
}