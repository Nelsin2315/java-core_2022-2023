package lr4;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int figure = 8;
        int i ;
        int j ;

        int[][] treug = new int[figure][];
        for (i = 0 ; i < figure; i++){
            treug [i] = new int[i+1];
            for (j = 0; j <= i; j++){
                treug[i][j] = 2;
            }
            System.out.println(Arrays.toString(treug[i]) + " Количество символов в строке " + (i+1));
        }
    }
}

