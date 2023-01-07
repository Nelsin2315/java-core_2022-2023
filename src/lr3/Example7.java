package lr3;

import java.util.Arrays;

public class Example7 {

    public static void main(String[] args) {

        int count = 10;
        char[] array = new char[count];

        char i = 's';

        for (int x = 0; x < count; i--) {
            if (i % 2 == 1) {
                array[x] = i;
                System.out.printf(array[x]+ ",");
                x++;
            }
        }

        Arrays.sort(array);
        System.out.println("\nМассив в обратном порядке:");

        for (int x = 0; x < array.length; x++) {
            System.out.printf(array[x]+ ",");
        }
    }

}
