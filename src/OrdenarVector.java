import java.util.Arrays;
import java.util.Random;

public class OrdenarVector {
    public static void main(String[] args) {
        int[] vector = new int[10]; 
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100) + 1; 
        }

        System.out.println("Vector antes de ordenar: " + Arrays.toString(vector));

        Arrays.sort(vector);

        System.out.println("Vector después de ordenar: " + Arrays.toString(vector));
    }
}