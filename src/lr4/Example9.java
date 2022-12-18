package lr4;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования (Символы для использования: абвгдеёжзийклмнопрстуфхцчшщъыьэюя): ");
        String text = in.nextLine();

        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        String alfivit = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        StringBuilder crypt = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            crypt.append(alfivit.charAt((alfivit.indexOf(text.charAt(i)) + key) % alfivit.length()));
        }

        String crypttext = new String (crypt.toString());

        System.out.println(crypttext);

        System.out.println("Выполнить обратное преобразование? (y/n)");

        while (true) {

            String pr = in.next();
            switch (pr) {
                case "y" -> System.out.println(text);
                case "n" -> System.out.println("До свидания");
                default -> {
                    System.out.println("Введите корректный ответ");
                    continue;
                }
            }
            break;
        }
    }
}
