package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String one = in.nextLine();
        String two = in.nextLine();
        int result = Integer.parseInt(one);
        int ressult2 = Integer.parseInt(two);

        if ((result % 2 == 0) | (ressult2 % 2 != 0)) {
            out.println("yes");
        } else {
            out.println("no");
        }
        out.flush();
    }
}