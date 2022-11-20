package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        int a = in.nextInt();

        System.out.printf("Введите второе число: ");
        int b = in.nextInt();

        int c = a + b;
        System.out.println("Сумма равняется " +c);

        int d = a-b;
        System.out.println("Разница равняется " +d);

    }
}
