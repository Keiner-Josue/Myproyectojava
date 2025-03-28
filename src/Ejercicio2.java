import java.util.Scanner;
public class PromedioAlumno {
    //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Primera nota ");
    float nota1 = scanner.nextFloat();
    System.out.print("segunda nota:");
    float nota2 = scanner.nextFloat();
    System.out.print("tercera nota:");
    float nota3 = scanner.nextFloat();

    float promedio = (nota1 + nota2 + nota3)/3;

    if (promedio>=7) {
        System.out.println("promocionado");
        
    }

    scanner.close();
}

}