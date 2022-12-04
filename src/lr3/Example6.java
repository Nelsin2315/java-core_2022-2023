package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int count = in.nextInt();

            if (count > 0) {

                int[] array = new int[count];
                int a = 0;
                int i = 0;

                while (a<count) {
                    i++;
                    if (i % 5 == 2) {
                        array[a] = i;
                        System.out.print(array[a] + ", ");
                        a++;
                    }
                }
            }
            else {
                System.out.println("Число должно быть положительное.");
            }
    }

}


/*
Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения
 */