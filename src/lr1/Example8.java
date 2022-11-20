package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите наименование текущего дня недели: ");
        String week = in.nextLine();

        System.out.println("Введите наименование текущего месяца: ");
        String month = in.nextLine();

        System.out.println("Введите дату в текущем месяце: ");
        int date = in.nextInt();

        System.out.printf("День недели: %s, Дата: %d, Месяц: %s", week, date, month);
        in.close();
    }
}
