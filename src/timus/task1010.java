package timus;

import java.util.Scanner;

public class task1010 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long a = 0;
        int n1 = 0;
        int n2 = 0;
        int N = in.nextInt();

        long prev = in.nextLong();

        for (int i = 2; i <= N; i++) {
            long current = in.nextLong();
            if (Math.abs(current - prev) > a) {
                a = Math.abs(current - prev);
                n1 = i - 1;
                n2 = i;
            }
            prev = current;
        }

        System.out.println(n1 + " " + n2);

    }
}
