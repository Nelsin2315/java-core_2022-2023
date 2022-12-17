package lr4;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int ryd;
        int nryd = 4;
        int str;
        int nstr = 4;
        int count = 0;

        int[][] array = new int[nstr][nryd];
        for (str = 0 ; str < nstr; str++) {
            for (ryd = 0; ryd < nryd; ryd++) {
                count++;
                if (str % 2 != 0) {
                    array [str][nryd - 1 - ryd] = count;
                    continue;
                }
                array [str][ryd] = count;
            }

            System.out.println(Arrays.toString(array [str]));
        }
    }
}