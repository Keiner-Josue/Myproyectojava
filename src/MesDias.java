import java.util.Scanner;

public class MesDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                 "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes es " + nombresMeses[mes - 1] + " y tiene " + diasMeses[mes - 1] + " días.");
        } else {
            System.out.println("Error: El número ingresado no corresponde a un mes válido.");
        }

        scanner.close();
    }
}