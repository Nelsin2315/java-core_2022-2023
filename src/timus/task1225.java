package timus;

import java.util.Scanner;

public class task1225 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        long flag[] = new long[46];
        flag[1] = 2;
        flag[2] = 2;
        for (int i = 3; i <= a; i++) {
            flag[i] = flag[i - 1] + flag[i - 2];
        }
        System.out.println(flag[a]);
        in.close();
    }

}