//Creen un método que intente cambiar el valor de un número, y que observen cómo el valor fuera del método no cambia:

public class EjercMetodos1 {
    public static void main(String[] args) {
     int valor = 10;
     cambiarValor(valor);
     System.out.println("Valor despues de cambiarValor: " + valor); 
    }
    public static void cambiarValor(int valor) {
        valor = 20;
    }


}