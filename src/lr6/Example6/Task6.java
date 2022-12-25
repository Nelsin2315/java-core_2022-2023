package lr6.Example6;

import java.util.Arrays;

public class Task6 {

    public static int[] arrayInt(int[] array, int n) {

        if (n > array.length) {
            System.out.println(Arrays.toString(array));
            System.out.println("Число указано больше длинны массива.");
            return array;
        }
        int[] arrayCopy = new int[n];
        for (int i = 0; i < n; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println(Arrays.toString(arrayCopy));
        return arrayCopy;

    }

}
