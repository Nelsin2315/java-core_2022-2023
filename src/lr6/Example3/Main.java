package lr6.Example3;

import lr6.Example2.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Task3 task3 = new Task3();

        int [] max = {6,4,6,3,2,1,4};
        System.out.print("\nМассив чисел для метода вычисленяи максимального числа: " + Arrays.toString(max));
        System.out.println("\nМаксимальное значение: " + Task3.arraymax(max));

        int [] min = {5,6,4,6,32,243,25};
        System.out.print("\nМассив чисел для метода вычисления минимального числа: " + Arrays.toString(min));
        System.out.println("\nМинимальное значение: " + Task3.arraymin(min));

        int [] average = {6,34,3,5,6,2};
        System.out.print("\nМассив чисел для метода вычисления среднего значения чисел: " + Arrays.toString(average));
        System.out.println("\nСреднее значение: " + Task3.aver(average));

    }
}