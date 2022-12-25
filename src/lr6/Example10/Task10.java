package lr6.Example10;

import java.util.Arrays;

public class Task10 {

    public static int[] intArray(int... n) {

        Arrays.sort(n);
        int [] arrayInt = new int[2];
        arrayInt[0] = n[0];
        arrayInt[1]=n[n.length-1];
        System.out.println("Минимальное число массива: "  + arrayInt[0]);
        System.out.println("Максимальное число массива: "+ arrayInt[1]);
        return arrayInt;
    }
}
