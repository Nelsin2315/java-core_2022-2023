package lr6.Example7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c', 'd', 'f', 'g', 'z', 'a','m',};
        System.out.println("Символьный массив: " + Arrays.toString(chars));
        System.out.print("Коды символов из массива chars: ");
        Task7.charArray(chars);
    }
}