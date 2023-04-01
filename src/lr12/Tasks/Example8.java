package lr12.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        List<Integer> list = new ArrayList<Integer>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Список list: ");
        System.out.println(list);

        System.out.println("Введите число, с которым нужно сравнивать: ");
        int num = in.nextInt();

        List<Integer> listResult = filterNumbers(list, num);

        System.out.println("Список listResult: ");
        System.out.println(listResult);
    }

    public static List<Integer> filterNumbers(List<Integer> arr, int num) {
        return arr.stream().filter(x -> x > num).collect(Collectors.toList());
    }
}
