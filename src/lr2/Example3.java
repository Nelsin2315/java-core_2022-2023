package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целове число: ");

        int a = in.nextInt();

        if (a > 10) {
            if (a % 4 == 0) {
                System.out.println("Число делится на 4");
            } else {
                System.out.println("Число не делится 4");
            }
        } else {
            System.out.println("Число меньше 10");
        }
    }
}