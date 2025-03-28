/*
De un operario se conoce su sueldo y los años de antigüedad. Se pide
confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de sus sueldo: ");
        float Sueldo = scanner.nextFloat();
        System.out.print("Ingrese sus años de antiguedad: ");
        float Antiguedad = scanner.nextFloat();

        if (Sueldo<500) {
            if ( Antiguedad>=10) {
                float Aumento = (Sueldo * 20/100)+Sueldo;
                System.out.println("el sueldo a pagar es:"+(int) Aumento);
            }else if (Antiguedad<10 ) {
                float Aumento2 = (Sueldo*5/100)+Sueldo;
                System.out.println("el sueldo a pagar es: "+(int)Aumento2);
            } 
        }else {
            System.out.println("El sueldo no tendra ningun cambio: "+ (int)Sueldo);
        }
        scanner.close();
    }
}