package lr6.Example6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int[] array = new int[a];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Числа массива: " + Arrays.toString(array));

        System.out.print("Введите ограничения: ");
        int n = in.nextInt();
        System.out.print("После вычисления: ");
        Task6.arrayInt(array,n);
    }
}
