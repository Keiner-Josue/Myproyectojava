public class ControlLaboratorio {

    // 1. Contar temperaturas mayores a 60 grados
    public static int contarTemperaturasAltas(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int temp : fila) {
                if (temp > 60) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // 2. Calcular el promedio de temperaturas menores a 30 grados
    public static double promedioTemperaturasBajas(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int temp : fila) {
                if (temp < 30) {
                    suma += temp;
                    contador++;
                }
            }
        }
        if (contador == 0) return 0; // Para evitar división por cero
        return (double) suma / contador;
    }

    // 3. Imprimir temperaturas mayores a 75 grados
    public static void imprimirTemperaturasPeligrosas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 75) {
                    System.out.println("Temperatura crítica en [" + i + "][" + j + "]: " + matriz[i][j] + " grados");
                }
            }
        }
    }

    // 4. Retornar la posición del equipo con mayor temperatura
    public static int[] equipoMasCaliente(int[][] matriz) {
        int maxTemp = matriz[0][0];
        int[] posicion = {0, 0};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxTemp) {
                    maxTemp = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    // BONUS: Contar temperaturas fuera del rango seguro [20, 70]
    public static int contarTemperaturasFueraDeRango(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int temp : fila) {
                if (temp < 20 || temp > 70) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Método de prueba (opcional)
    public static void main(String[] args) {
        int[][] temperaturas = {
            {22, 65, 78, 30, 15},
            {45, 88, 29, 19, 73},
            {25, 70, 80, 60, 32},
            {10, 55, 67, 40, 90}
        };

        System.out.println("Temperaturas > 60: " + contarTemperaturasAltas(temperaturas));
        System.out.println("Promedio < 30: " + promedioTemperaturasBajas(temperaturas));
        imprimirTemperaturasPeligrosas(temperaturas);

        int[] pos = equipoMasCaliente(temperaturas);
        System.out.println("Equipo más caliente está en: [" + pos[0] + "][" + pos[1] + "]");
        System.out.println("Temperaturas fuera de rango: " + contarTemperaturasFueraDeRango(temperaturas));
    }
}