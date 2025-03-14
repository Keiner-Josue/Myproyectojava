import java.util.Scanner;
public class Ejercicioquiz {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("ingresa un numero");
        int num = input.nextInt();
        System.out.println("El numero es: " + num);
        if (num<=0) {
            System.out.println("numero no valido");
            input.close();
            return;
        }
        for (int k = 1 ; k<=num ; k++){
            for (int j=1 ; j<=k ; j++){
                if (j % 2 == 1) {
                    System.out.print(k);
                } else{
                    System.out.print(k*-1);
                }
                if (j<k) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}