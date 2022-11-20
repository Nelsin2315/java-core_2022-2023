package lr1;

import java.util.Date;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите Ваш возраст: ");
        int age = in.nextInt();

        int year  = (new Date()).getYear() + 1900 - age;
        System.out.printf("Ваш год рождения: " + year);
        in.close();
    }
}
