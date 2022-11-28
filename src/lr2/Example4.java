package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целове число: ");

        int a = in.nextInt();

            if (5<= a & a <= 10) {
                    System.out.println("Число попадает в предел 5 <= a <= 10");
                } else {
                    System.out.println("Число не попадает в предел 5 <= a <= 10");
                }

            }
}
