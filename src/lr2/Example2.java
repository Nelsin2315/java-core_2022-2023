package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int a = in.nextInt();

        if (a % 5 == 2) {
            System.out.println("Число при делении на 5 имеет остаток 2");
        } else {
            System.out.println("Число при делении на 5 не имеет остаток 2");
        }

        if (a % 7 == 1) {
            System.out.println("Число при делении на 7 имеет остаток 1");
        } else {
            System.out.println("Число при делении на 7 не имеет остаток 1");
        }

    }
}
