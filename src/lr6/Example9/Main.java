package lr6.Example9;

public class Main {
    public static void main(String[] args) {

        char [] Array = new char[] {'a','b','c','d','e','f','s'};
        System.out.print("Символьный массив: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
        }
        System.out.print("\nМассив после попарной смены местами: ");
        System.out.println(Task9.ch1(Array));
    }
}
