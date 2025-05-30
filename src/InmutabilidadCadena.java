public class InmutabilidadCadena {
    public static void modificarCadena(String texto) {
        texto = texto.toUpperCase(); 
        System.out.println("Dentro del método modificarCadena: " + texto);
    }

    public static void main(String[] args) {
        String texto = "Hola, mundo"; 
        
        System.out.println("Antes de llamar a modificarCadena: " + texto);

        modificarCadena(texto);

        System.out.println("Después de llamar a modificarCadena: " + texto);
    }
}