package lr5.Example6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый аргумент:");
        int a = in.nextInt();
        System.out.println("Введите второй аргумент:");
        int b = in.nextInt();

        System.out.println("Один аргумент:");
        Task6 task6one = new Task6();
        task6one.Check(a);
        task6one.printMin();
        task6one.printMax();

        System.out.println("\nДва аргумента:");
        Task6 task6second = new Task6();
        task6second.Check(a,b);
        task6second.printMin();
        task6second.printMax();

    }
}

