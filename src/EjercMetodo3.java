public class EjercMetodo3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        modificarPersona(persona);
        System.out.println("Nombre después de modificarPersona: " + persona.nombre);
    }

    public static void modificarPersona(Persona persona) {
        persona.nombre = "María";  
    }
}