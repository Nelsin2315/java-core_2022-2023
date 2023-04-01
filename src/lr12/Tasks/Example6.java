package lr12.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example6 {
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

        System.out.println("Введите число, на которое нужно делить: ");
        int divider = in.nextInt();

        List<Integer> listResult = filterDivisibleNumbers(list, divider);

        System.out.println("Список listResult: ");
        System.out.println(listResult);
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> arr, int divider) {
        return arr.stream()
                .filter(x -> x % divider == 0)
                .collect(Collectors.toList());

    }
}
