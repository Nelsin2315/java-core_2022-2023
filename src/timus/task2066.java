package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2066 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b==0 || b == 1 || c == 1) {
            out.println(a - b - c);
        } else {
            out.println(a - b * c);
        }

        out.flush();
    }
}