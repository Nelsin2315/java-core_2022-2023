package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        out.println(String.format("%d %d", a1-a3, b1-b2));
        out.flush();

    }

}
