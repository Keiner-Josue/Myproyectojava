import java.util.Scanner;

public class ClubCasiSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentosPermitidos = 3;
        int intentos = 0;

        System.out.println("🔐 Bienvenido al Club Casi Secreto™");

        while (intentos < intentosPermitidos) {
            System.out.println("\nIntento #" + (intentos + 1));

            System.out.print("📅 ¿Cuál es tu edad? - : ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            System.out.print("🔑 Ingresa la clave secreta: ");
            String clave = scanner.nextLine();

            System.out.print("🗣️ Di la frase secreta: ");
            String frase = scanner.nextLine();

            if (edad > 18 && clave.equals("1234") && frase.equalsIgnoreCase("la matrix vive")) {
                System.out.println("✅ ¡Acceso concedido! Bienvenido al Club Casi Secreto™ 🎉");
            } else {
                System.out.println("❌ Acceso denegado. No cumples con los requisitos.");
            }

            intentos++;
        }

        System.out.println("\n🚪 Fin de los intentos. El club permanece oculto... 🕵️‍♂️");
        scanner.close();
    }
}
