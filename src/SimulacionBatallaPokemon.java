import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; // Necesario para el daño aleatorio de los ataques

// Clase base: Pokemon (antes Personaje)
class Pokemon {
    String nombre;
    String tipo; // Nuevo atributo para el tipo de Pokémon
    int ataque; // Antes fuerza
    int defensa; // Antes resistencia
    int velocidad;
    int salud; // Nuevo atributo para la vida del Pokémon, antes resistencia

    public Pokemon(String nombre, String tipo, int ataque, int defensa, int velocidad, int salud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.salud = salud;
    }

    public void atacar(Pokemon oponente) {
        Random random = new Random();
        int danoBase = this.ataque;
        // Daño aleatorio para hacer las batallas más interesantes
        int danoReal = Math.max(0, danoBase - oponente.defensa / 2) + random.nextInt(10); // Ejemplo de cálculo de daño
        
        System.out.println(nombre + " usa Placaje contra " + oponente.nombre + " causando " + danoReal + " de daño.");
        oponente.salud -= danoReal;
        if (oponente.salud < 0) oponente.salud = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.salud + " puntos de salud.");
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas de " + nombre + " ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Salud: " + salud);
        System.out.println("-----------------------------------\n");
    }

    public void usarPocion() { // Antes recuperarse
        int recuperacion = 30; // Un valor fijo de recuperación
        salud += recuperacion;
        System.out.println(nombre + " usó una poción y recuperó " + recuperacion + " puntos de salud. Ahora tiene " + salud + " puntos de salud.");
    }
}

// Clase derivada: TipoFuego (antes SuperHeroe)
class TipoFuego extends Pokemon {
    public TipoFuego(String nombre, int ataque, int defensa, int velocidad, int salud) {
        super(nombre, "Fuego", ataque, defensa, velocidad, salud);
    }

    public void ataqueEspecial(Pokemon oponente) { // Ataque de tipo fuego
        Random random = new Random();
        int danoFuego = this.ataque + random.nextInt(20); // El daño del ataque de fuego se basa en el ataque base + aleatorio
        
        // Efectividad de tipo (ejemplo básico)
        if (oponente.tipo.equals("Planta") || oponente.tipo.equals("Hielo")) {
            danoFuego *= 2; // Doble daño contra tipo Planta/Hielo
            System.out.println("¡Es súper efectivo!");
        } else if (oponente.tipo.equals("Agua") || oponente.tipo.equals("Roca")) {
            danoFuego /= 2; // Medio daño contra tipo Agua/Roca
            System.out.println("No es muy efectivo...");
        }

        System.out.println(nombre + " usó Lanzallamas contra " + oponente.nombre + " causando " + danoFuego + " de daño.");
        oponente.salud -= danoFuego;
        if (oponente.salud < 0) oponente.salud = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.salud + " puntos de salud.");
    }
}

// Clase derivada: TipoAgua (antes Villano)
class TipoAgua extends Pokemon {
    public TipoAgua(String nombre, int ataque, int defensa, int velocidad, int salud) {
        super(nombre, "Agua", ataque, defensa, velocidad, salud);
    }

    public void ataqueEspecial(Pokemon oponente) { // Ataque de tipo agua
        Random random = new Random();
        int danoAgua = this.ataque + random.nextInt(15); // El daño del ataque de agua se basa en el ataque base + aleatorio

        // Efectividad de tipo (ejemplo básico)
        if (oponente.tipo.equals("Fuego") || oponente.tipo.equals("Tierra")) {
            danoAgua *= 2; // Doble daño contra tipo Fuego/Tierra
            System.out.println("¡Es súper efectivo!");
        } else if (oponente.tipo.equals("Planta") || oponente.tipo.equals("Dragón")) {
            danoAgua /= 2; // Medio daño contra tipo Planta/Dragón
            System.out.println("No es muy efectivo...");
        }

        System.out.println(nombre + " usó Pistola Agua contra " + oponente.nombre + " causando " + danoAgua + " de daño.");
        oponente.salud -= danoAgua;
        if (oponente.salud < 0) oponente.salud = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.salud + " puntos de salud.");
    }
}

// Clase principal: SimulacionBatallaPokemon (antes SimulacionBatalla)
public class SimulacionBatallaPokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear lista de Pokémon tipo Fuego disponibles
        List<TipoFuego> pokemonFuegoDisponibles = new ArrayList<>();
        pokemonFuegoDisponibles.add(new TipoFuego("Charmander", 35, 25, 20, 80));
        pokemonFuegoDisponibles.add(new TipoFuego("Vulpix", 30, 20, 25, 70));
        pokemonFuegoDisponibles.add(new TipoFuego("Magmar", 45, 30, 15, 95));

        // Crear lista de Pokémon tipo Agua disponibles
        List<TipoAgua> pokemonAguaDisponibles = new ArrayList<>();
        pokemonAguaDisponibles.add(new TipoAgua("Squirtle", 30, 30, 18, 85));
        pokemonAguaDisponibles.add(new TipoAgua("Psyduck", 28, 22, 22, 75));
        pokemonAguaDisponibles.add(new TipoAgua("Gyarados", 50, 25, 12, 110));

        // --- Selección del Pokémon del jugador ---
        System.out.println("--- Elige tu Pokémon de Fuego ---");
        for (int i = 0; i < pokemonFuegoDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonFuegoDisponibles.get(i).nombre + " (Ataque: " + pokemonFuegoDisponibles.get(i).ataque + ", Defensa: " + pokemonFuegoDisponibles.get(i).defensa + ", Salud: " + pokemonFuegoDisponibles.get(i).salud + ")");
        }
        System.out.print("Ingresa el número de tu Pokémon: ");
        int seleccionJugador = scanner.nextInt();
        TipoFuego pokemonJugador;
        if (seleccionJugador > 0 && seleccionJugador <= pokemonFuegoDisponibles.size()) {
            pokemonJugador = pokemonFuegoDisponibles.get(seleccionJugador - 1);
        } else {
            System.out.println("Selección inválida. Se usará Charmander por defecto.");
            pokemonJugador = new TipoFuego("Charmander", 35, 25, 20, 80);
        }

        // --- Selección del Pokémon oponente (CPU) ---
        System.out.println("\n--- Elige el Pokémon oponente (Agua) ---");
        for (int i = 0; i < pokemonAguaDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonAguaDisponibles.get(i).nombre + " (Ataque: " + pokemonAguaDisponibles.get(i).ataque + ", Defensa: " + pokemonAguaDisponibles.get(i).defensa + ", Salud: " + pokemonAguaDisponibles.get(i).salud + ")");
        }
        System.out.print("Ingresa el número del Pokémon oponente: ");
        int seleccionOponente = scanner.nextInt();
        TipoAgua pokemonOponente;
        if (seleccionOponente > 0 && seleccionOponente <= pokemonAguaDisponibles.size()) {
            pokemonOponente = pokemonAguaDisponibles.get(seleccionOponente - 1);
        } else {
            System.out.println("Selección inválida. Se usará Squirtle por defecto.");
            pokemonOponente = new TipoAgua("Squirtle", 30, 30, 18, 85);
        }

        System.out.println("\n¡La batalla Pokémon entre " + pokemonJugador.nombre + " y " + pokemonOponente.nombre + " ha comenzado!\n");

        // Mostrar estadísticas iniciales
        pokemonJugador.mostrarEstadisticas();
        pokemonOponente.mostrarEstadisticas();

        // Interacción del usuario para la batalla
        int opcion;
        do {
            System.out.println("--- Turno de " + pokemonJugador.nombre + " ---");
            System.out.println("1. Atacar (Placaje)");
            System.out.println("2. Usar ataque especial (Lanzallamas)");
            System.out.println("3. Usar Poción");
            System.out.println("4. Mostrar estadísticas");
            System.out.println("5. Huir de la batalla"); // Opción para terminar
            System.out.println("------------------------------");

            System.out.print("Elige una acción: ");
            opcion = scanner.nextInt();
            System.out.println("------------------------------");

            switch (opcion) {
                case 1:
                    pokemonJugador.atacar(pokemonOponente);
                    break;
                case 2:
                    pokemonJugador.ataqueEspecial(pokemonOponente);
                    break;
                case 3:
                    pokemonJugador.usarPocion();
                    break;
                case 4:
                    pokemonJugador.mostrarEstadisticas();
                    pokemonOponente.mostrarEstadisticas();
                    break;
                case 5:
                    System.out.println("¡Has huido de la batalla!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    continue; // Volver a pedir la acción del jugador
            }

            // Comprobar si el Pokémon oponente ha sido derrotado
            if (pokemonOponente.salud <= 0) {
                System.out.println("\n¡" + pokemonOponente.nombre + " se ha debilitado! ¡" + pokemonJugador.nombre + " ha ganado la batalla!");
                break;
            }

            // Turno del Pokémon oponente (CPU)
            if (opcion != 5 && pokemonOponente.salud > 0) { // Si el jugador no huyó y el oponente sigue vivo
                System.out.println("\n--- Turno de " + pokemonOponente.nombre + " ---");
                int accionOponente = random.nextInt(3); // 0: atacar, 1: ataque especial, 2: usar poción (si la necesita)

                if (accionOponente == 0) {
                    pokemonOponente.atacar(pokemonJugador);
                } else if (accionOponente == 1) {
                    pokemonOponente.ataqueEspecial(pokemonJugador);
                } else { // Intenta usar poción si la salud es baja
                    if (pokemonOponente.salud < (pokemonOponente.defensa + pokemonOponente.ataque)/2 ) { // Lógica simple para usar poción
                        pokemonOponente.usarPocion();
                    } else {
                        pokemonOponente.atacar(pokemonJugador); // Ataca si no necesita poción
                    }
                }

                // Comprobar si el Pokémon del jugador ha sido derrotado
                if (pokemonJugador.salud <= 0) {
                    System.out.println("\n¡" + pokemonJugador.nombre + " se ha debilitado!");
                    System.out.println("------------------------------");
                    System.out.println("¡" + pokemonOponente.nombre + " ha ganado la batalla!");
                    System.out.println("------------------------------");
                    break;
                }
            }

        } while (opcion != 5 && pokemonJugador.salud > 0 && pokemonOponente.salud > 0);

        scanner.close();
    }
}