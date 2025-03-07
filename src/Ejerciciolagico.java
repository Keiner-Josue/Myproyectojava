import java.util.Scanner;
public class Ejerciciolagico {
    public static void main(String[] args) {
        System.out.println("Ingrese tres numeros");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        int Num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int Num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int Num3 = scanner.nextInt();

        System.out.println("Num1 > Num2 && Num2 < Num3: " + (Num1 > Num2 && Num2 < Num3));
        System.out.println("¿ numero1 es igual a numero2 ? " + (Num1 == Num2));


        scanner.close();
    }
}
