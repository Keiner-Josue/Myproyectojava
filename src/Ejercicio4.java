//Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
//mensaje en pantalla indicando que debe abonar impuestos.
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Ingrese su sueldo: ");
        float sueldo = input.nextFloat();
        if (sueldo>3000) {
            System.out.print("Debe abonar impuestos");
            input.close();
            return;
            
        }
        System.out.print("No debe abonar impuestos");
        input.close();
    }
}
