package lr9.Example2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Введите кол-во строк для матрицы: ");
            int stroka = in.nextInt();
            System.out.print("Ввежите кол-во столбцов для матрицы: ");
            int stolb = in.nextInt();

            int Array[] [] = new int[stroka][stolb];

            System.out.println("Матрица из случайных чисел: ");
            for (int i = 0; i < stroka; i++){
                for(int j = 0; j < stolb; j++){
                    Array[i][j] = random.nextInt(100);
                    System.out.print(Array[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nУкажите номер столбца для вывода: ");
            int num = in.nextInt();
            System.out.println("\nСтолбец: ");
            for(int i = 0; i < stroka; i++){
                System.out.println(Array[i][num-1]);
            }
        } catch (InputMismatchException a) {
            System.out.println("ERROR: Несоответствие числового типа данных");
        } catch (ArrayIndexOutOfBoundsException b ){
            System.out.println("ERROR: Несуществующий столбец");
        }
    }
}