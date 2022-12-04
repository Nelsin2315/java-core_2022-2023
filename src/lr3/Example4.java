package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();

        System.out.println("For");

        if (a > b) {
            for (int b1 = b; b1 <= a; b1++) {
                System.out.printf ("%d ", b1);
            }
        } else {
            for (int a1 = a; a1 <= b; a1++) {
                System.out.printf ("%d ", a1);
            }
        }

        System.out.println(" ");
        System.out.println("While");

        int x = a;
        int y = b;

        if (x > y) {
            while (y <= x) {
                System.out.printf("%d ", y);
                y++;
            }
        }
        else {
            while (x <= y) {
                System.out.printf("%d ", x);
                x++;
            }
        }
    }
}