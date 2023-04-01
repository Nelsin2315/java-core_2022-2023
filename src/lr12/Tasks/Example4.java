package lr12.Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        List<Integer> list = new ArrayList<Integer>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Список list: " + list);

        List<Integer> Result = filterSquareNumbers(list);

        System.out.println("Список listResult: " + Result);

    }

    public static List<Integer> filterSquareNumbers(List<Integer> arr) {
        return arr.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
