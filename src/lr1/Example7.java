package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Name: ");
        String name = in.nextLine();

        System.out.println("Input Age: ");
        int age = in.nextInt();

        System.out.printf("Your Name: %s, Your Age: %d", name, age);
        in.close();
    }
}
