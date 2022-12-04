package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int count = in.nextInt();
        int [] arrayInt = new int[count];
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = random.nextInt(100);
            System.out.print(arrayInt[i] + ",");
        }
        int[] arraysize = new int[count];
        int[] arraymin = new int[count];
        int min = arrayInt[0];

        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < arrayInt.length; b++) {
                if (min >= arrayInt[b]) {
                    arraysize[b] = b;
                    min = arrayInt[b];
                    arraymin[b] = arrayInt[b];

                }
            }
        }

        System.out.println("\n");
        for (int j = 0; j < arrayInt.length; j++) {
            if (arraymin[j] == min && arraysize[j] != 0) {
                System.out.print(arraymin[j] + ", ");
            }
        }
        System.out.print("- минимальное значение");
    }
}


/* Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов
 */