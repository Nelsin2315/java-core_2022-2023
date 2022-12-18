package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {

        Random rand = new Random();
        int d = 5;
        int h = 6;

        int i; // символы в строке
        int j; // столбцы

        int[][] one = new int[h][d];

        for (i = 0; i < h; i++) {
            for (j = 0; j < d; j++) {
                one[i][j] = rand.nextInt(10);
            }
            System.out.println(Arrays.toString(one[i]) + " Количество символов в строке: " + j + ", Количество столбцов: " + (i+1));
        }

        System.out.println("___________________________________");
        System.out.println("Строки и стобцы меняются местами...");
        System.out.println("___________________________________");

        int[][] two = new int[d][h];

        for (j = 0; j < d; j++) {
            for (i = 0; i < h; i++) {
                two[j][i] = one[i][j];
            }
            System.out.println(Arrays.toString(two[j])  + " Количество символов в строке: " + i + ", Количество столбцов: " + (j+1));
        }
    }
}

