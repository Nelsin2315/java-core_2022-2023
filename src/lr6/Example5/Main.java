package lr6.Example5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите число для вычисления суммы квадратов натуральных чисел: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int trues = (a*(a+1)*(2*a+1)/6);
        boolean testrelust;

        int sumFor = Task5.getFactorialRec(a);
        System.out.println("Сумма квадраторв натурального числа " + a + " равна(вычисление c рекурсией): " + sumFor);
        testrelust = trues == sumFor;
        System.out.println("Проверка вычисления: " + testrelust);


        int sumFor1 = Task5.getFactorialFor(a);
        System.out.println("Сумма квадраторв натурального числа " + a + " равна(без рекурсии): " + sumFor1);
        testrelust = trues == sumFor1;
        System.out.println("Проверка вычисления: " + testrelust);

    }

}
