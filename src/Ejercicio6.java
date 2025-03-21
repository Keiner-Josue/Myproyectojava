//Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero)
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su numero: ");
        int num = input.nextInt();
        if (num>0) {
            System.out.print("El numero " + num + " es positivo");

        }else if (num<0) {
            System.out.print("El numero "+ num + " es negativo");
        }else {
            System.out.print("El numero es nulo");
        }
        input.close();

    }

}
