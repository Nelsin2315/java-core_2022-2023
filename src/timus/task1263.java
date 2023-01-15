package timus;

import java.util.Scanner;

public class task1263 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int int1 = 0;
        int res = 0;

        int n = in.nextInt();
        int m = in.nextInt();
        int [] massiv = new int [n];
        for(int i = 0; i < m; i++) {
            int1 = in.nextInt();
            res = res + 1;
            massiv[int1-1] = massiv[int1-1] + 1;
        }
        for(int i = 0; i < n; i++){
            System.out.println(String.format("%.2f", massiv[i]/(res*0.01))+"%");
        }
        in.close();
    }
}
