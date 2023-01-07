package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int count = in.nextInt();
        int[] arrayInt = new int[count];
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = random.nextInt(200);
            System.out.print(arrayInt[i] + ",");
        }

        System.out.println("");

        for(int i = arrayInt.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayInt[j] < arrayInt[j + 1]) {
                    int tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = tmp;
                }
            }
        }
        System.out.println("Числа по убыванию:");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + ",");
        }
        }
    }
