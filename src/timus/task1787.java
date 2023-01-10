package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int cars = in.nextInt();
        int min = in.nextInt();
        int sum = 0;

        for (int i = 0; i < min; i++) {
            sum += in.nextInt();
            sum = Math.max(sum - cars, 0);
        }

        out.println(sum);
        out.flush();
    }
}
