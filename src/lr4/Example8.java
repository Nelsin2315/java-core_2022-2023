package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] textChar = text.toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            textChar[i] += key;
        }

        System.out.println("Зашифрованный текст: " + Arrays.toString(textChar));

        System.out.println("Выполнить обратное преобразование? (y/n)");

        while (true) {
            String prov = in.next();
            switch (prov) {
                case "y" -> System.out.println("Расшифрованный текст: " + text);
                case "n" -> System.out.println("До свидания!");
                default -> {
                    System.out.println("Введите корректный ответ");
                    continue;
                }
            }
            break;
        }
        }
}

