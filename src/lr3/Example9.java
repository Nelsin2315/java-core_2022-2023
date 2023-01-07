package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int count = in.nextInt();
        int[] arrayInt = new int[count];

        Random random = new Random();
        System.out.println("Числа массива:");
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100);
            System.out.print(arrayInt[i] + ",");
        }

        System.out.println("\nНаименьшие цифры массива:");
        int mini = arrayInt[0];
        for (int j = 0; j< count; j++) {
            if (arrayInt[j] < mini) {
            mini = arrayInt [j];
            }
        }

        for (int i = 0; i < count; i++) {
            if (arrayInt[i] == mini) {
                System.out.println("Наименьшее число " + mini + " Индекс: " + i);
            }
        }


    }
}
