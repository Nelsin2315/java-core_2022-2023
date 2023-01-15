package timus;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class task1001 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] sqrt = new double[256*1000];
        int a = 0;

        while (in.hasNextLong()) {
            sqrt[a++] = sqrt(in.nextLong());
        }

        for (int i = a - 1; i >= 0; i--)
            System.out.printf("%.4f\n", sqrt[i]);
    }



}
