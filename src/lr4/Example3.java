package lr4;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int fig = 7;
        int figure = 9;
        int i ;
        int j ;
        int z=0;

        int[][] arr = new int[fig][figure];
        for (i = 0 ; i < fig; i++){
            z=0;
            for (j = 0; j < figure; j++){
                arr[i][j] = 2;
                z++;
            }
        }
        for (i = 0 ; i < fig; i++){
            System.out.println(Arrays.toString(arr[i])+ " Строка: " + (i+1) + ", Количество символов в строке: " + z);
        }
    }
}
