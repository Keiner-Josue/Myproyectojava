
class Rectangulo {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class PasarPorReferencia {
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 20;
        r.alto = 40;
        System.out.println("Dentro del método modificarRectangulo: ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 30);
        
        System.out.println("Antes de llamar a modificarRectangulo: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
        
        modificarRectangulo(miRectangulo);
        
        System.out.println("Después de llamar a modificarRectangulo: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
}