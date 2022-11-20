package lr1;

import java.util.Scanner;

public class Example13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите первое слагаемое: ");
        int a = in.nextInt();

        System.out.printf("Введите второе слагаемое: ");
        int b = in.nextInt();

        int c = a + b;

        System.out.printf("Сумма слагаемых %d и %d равна %d", a, b, c);
        in.close();

    }
}
