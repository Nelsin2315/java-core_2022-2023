package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите наименование дня недели с заглавнйо буквы:");
        String day = in.nextLine();

        switch (day) {
            case "Понедельник":
                System.out.println("1 день недели");
                break;
            case "Вторник":
                System.out.println("2 день недели");
                break;
            case "Среда":
                System.out.println("3 день недели");
                break;
            case "Четверг":
                System.out.println("4 день недели");
                break;
            case "Пятница":
                System.out.println("5 день недели");
                break;
            case "Суббота":
                System.out.println("6 день недели");
                break;
            case "Воскресенье":
                System.out.println("7 день недли");
                break;

            default:
                System.out.println("Неверное наименование недели.");
        }
    }
}
