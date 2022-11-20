package lr1;

import java.util.Date;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш год рождения: ");
        int year = in.nextInt();

        int age  = (new Date()).getYear() + 1900 - year;
        System.out.println("Ваш возраст: " + age);
        in.close();
    }
}
