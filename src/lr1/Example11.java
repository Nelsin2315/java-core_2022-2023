package lr1;

import java.util.Date;
import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите своё Имя: ");
        String name = in.nextLine();

        System.out.printf("Введите свой год рождения: ");
        int year = in.nextInt();

        int age  = (new Date()).getYear() + 1900 - year;

        System.out.printf("Ваше имя: %s, Возраст: %d ", name, age);
        in.close();
    }

}
