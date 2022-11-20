package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Last name: ");
        String last = in.nextLine();

        System.out.println("Input Name: ");
        String name = in.nextLine();

        System.out.println("Input Middle name: ");
        String middle = in.nextLine();

        System.out.printf("Hello %s, %s, %s", last, name, middle);
        in.close();
    }
}
