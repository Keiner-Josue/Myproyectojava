public class IncrementoPorValor {
    public static int incrementar(int x) {
        x += 1; 
        System.out.println("Dentro del método incrementar: x = " + x);
        return x;
    }

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Antes de llamar a incrementar: x = " + x);

        incrementar(x);
        System.out.println("Después de llamar a incrementar sin usar el retorno: x = " + x);

        x = incrementar(x);
        System.out.println("Después de llamar a incrementar usando el retorno: x = " + x);
    }
}