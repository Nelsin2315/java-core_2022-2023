package lr6.Example8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int [] result = new int [a];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100);
            }
        System.out.println("Рандомные числа массива: " + Arrays.toString(result));
        System.out.print("Среднее значение для элементов массива: " + Task8.arrayInt(result));
    }
}