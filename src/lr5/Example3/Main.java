package lr5.Example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);

        System.out.println("Введите первый аргумент: ");
        int int1 = id.nextInt();

        System.out.println("Введите второй аргумент: ");
        int int2 = id.nextInt();

        Task3 zero = new Task3();
        System.out.println("\n _____________________________________ \n");
        Task3 one = new Task3(int1);
        System.out.println("\n _____________________________________ \n");
        Task3 two = new Task3(int1,int2);
    }
}
