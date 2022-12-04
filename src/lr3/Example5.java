package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print ("Ввведите количество чисел в сумме: ");
        int a = in.nextInt();
        int result = 0;
        int sum = 0;
        Random random = new Random();

        System.out.println("While");

        int a1 = a;
        while (a1 > 0) {
            int nums = random.nextInt(100);
            if (nums % 5 == 2 || nums % 3 == 1) {
                System.out.printf ("%d, ", nums);
                result = result + nums;
                a1--;
            }
        }
        System.out.printf("Cумма чисел: %d", result);

        System.out.println("\nFor");
        for (int i = random.nextInt(100); a > 0;i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.printf("%d, ", i);
                sum = sum + i;
                a--;
            }
        }
        System.out.printf("Cумма чисел: %d", sum);


    }
}

/*
Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла
 */