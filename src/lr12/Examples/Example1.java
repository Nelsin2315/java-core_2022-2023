package lr12.Examples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int arr[] = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println("Массив arr: " + Arrays.toString(arr));

        int [] arrResult = filterEvenNumbers(arr);

        System.out.println("Масссив arrResult: " + Arrays.toString(arrResult));
    }

    public static int [] filterEvenNumbers (int [] arr) {
        return Arrays.stream(arr).filter(x-> x%2 == 0).toArray();
    }
}
