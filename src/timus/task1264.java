package timus;

import java.io.PrintWriter;
import java.util.Scanner;


public class task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int i = in.nextInt();
        int j = in.nextInt();

        out.println(i * (j + 1));
        out.flush();
    }
}

