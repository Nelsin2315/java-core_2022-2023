package timus;

import java.util.Scanner;

public class task1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int ur = Integer.MAX_VALUE;
        for (int c = 0; c < 1 << n; c++) {

            int one = 0;
            int two = 0;
            int k = c;

            for (int i = 0; i < n; i++) {
                if ((k & 1) > 0)
                    one += a[i];
                else
                    two += a[i];

                k >>= 1;
            }
            ur = Math.min(ur, Math.abs(one - two));
        }

        System.out.println(ur);

    }
}
