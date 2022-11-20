package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите наименование текущего месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int date = in.nextInt();

        System.out.printf("%s месяц содержит %d дней", month, date);
        in.close();
    }
}
