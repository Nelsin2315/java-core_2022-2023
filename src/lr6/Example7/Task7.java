package lr6.Example7;

import java.util.Arrays;

public class Task7 {

    public static int[] charArray(char[] charArray) {
        int[] arrayInt = new int[charArray.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = charArray[i];
        }
        System.out.print(Arrays.toString(arrayInt));
        return arrayInt;
    }

}