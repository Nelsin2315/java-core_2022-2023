package lr12.Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массивов: ");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(100);
            arr2[i] = random.nextInt(100);
        }

        System.out.println("Массив arr1:\n" + Arrays.toString(arr1));
        System.out.println("Массив arr2:\n" + Arrays.toString(arr2));

        int [] arrResult = filterCommonElements(arr1, arr2);

        System.out.println("Массив arrResult:\n" + Arrays.toString(arrResult));

    }

    public static int[] filterCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x)).toArray();
    }
}
