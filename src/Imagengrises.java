public class Imagengrises {
    public static void main(String[] args) {
        int[][] imagenGris = {
            {255, 128, 0, 64},
            {64, 255, 128, 0},
            {0, 64, 255, 128},
            {128, 0, 64, 255}
        };
        for (int i = 0; i < imagenGris.length; i++) {
            for (int j = 0; j < imagenGris[i].length; j++) {
                imagenGris[i][j] = 255 - imagenGris[i][j]; // Invertir el brillo
            }
        }
    }
}
