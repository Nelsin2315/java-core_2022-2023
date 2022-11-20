package lr1;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.println("Input height: ");
        float height = in.nextFloat();

        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        in.close();
    }
}
