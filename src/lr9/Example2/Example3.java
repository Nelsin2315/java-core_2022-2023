package lr9.Example2;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите длину массива: ");
            int leength = in.nextInt();

            byte Array[] = new byte[leength];
            System.out.println("Введите значения: ");
            int summa = 0;

            for (int i = 0; i < Array.length; i++) {
                Array[i] = in.nextByte();
                summa = summa + Array[i];
            }
            System.out.println("\nСумма элементов: " + summa + ", Массив: " + Arrays.toString(Array));

        }
        catch (InputMismatchException a) {
            System.out.println("ERROR: Ввод строки вместо числа, выход за границы массива");
        }
    }
}