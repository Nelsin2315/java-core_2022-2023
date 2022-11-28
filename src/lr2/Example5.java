package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целове число: ");

        int a = in.nextInt();
        int b = a / 1000;

        if (a >= 1000) {
            System.out.println("Во введёном числе " + b + " тыс.");
        } else {
            System.out.println("Введёное число меньше тысячи");
        }
    }
}
