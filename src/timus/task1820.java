package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int res;

        if( a >= b){
            if((2*a)%b ==0){
                res = (2*a)/b;
                out.println(res);
                out.flush();
            }
            else {
                res = (2*a)/b+1;
                out.println(res);
                out.flush();
            }
        }
        else {
            res = 2;
            out.println(res);
            out.flush();

        }
    }
}
