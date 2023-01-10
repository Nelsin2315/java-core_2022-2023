package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int num = in.nextInt();

        if (num >= 12 - 5){
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
    }
}
