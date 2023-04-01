package lr12.Tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и" +
                "возвращает новый список, содержащий только те строки, которые" +
                "начинаются с большой буквы.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\nСтрока после считывания: \n");
        for(String s : strings){
            System.out.println(s);
        }
        List<String> stringAfter = filterCapitalizedStrings(strings);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String s : stringAfter){
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> strings){
        return strings.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
