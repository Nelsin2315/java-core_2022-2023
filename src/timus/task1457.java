package timus;

import java.util.Scanner;

public class task1457 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a = 0;
        double j = in.nextLong();

        for (int i = 0; i < j; i++) {
            a = a + in.nextLong();
        }
        double k = a / j;
        System.out.print((k));
        in.close();

    }
}
