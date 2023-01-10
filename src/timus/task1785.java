package timus;

import java.io.PrintWriter;
import java.util.Scanner;



public class task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int num = in.nextInt();

        if (num <= 4) {
            out.println("few");
        } else if (num <= 9) {
            out.println("several");
        }else if (num <= 19) {
            out.println("pack");
        }else if (num <= 49) {
            out.println("lots");
        }else if (num <= 99) {
            out.println("horde");
        }else if (num <= 249) {
            out.println("throng");
        }else if (num <= 499) {
            out.println("swarm");
        }else if (num <= 999) {
            out.println("zounds");
        } else {
            out.println("legion");
        }
        out.flush();
    }
}