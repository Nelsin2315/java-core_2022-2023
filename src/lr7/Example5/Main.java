package lr7.Example5;

public class Main {
    public static void main(String[] args) {

        superClass superClass = new superClass("Тест супер класса");
        superClass.PrintString();

        subClass subClass = new subClass ("Тест subclass", 123);
        subClass.PrintString();

        subsubClass subsubClass = new subsubClass("Тест subsubclass", 'H');
        subsubClass.PrintString();

        superClass superClassOutsubclass = new superClass(subClass.getStr1());
        superClassOutsubclass.PrintString();

        superClass superClassOutsubsubclass = new superClass(subsubClass.str1);
        superClassOutsubsubclass.PrintString();
    }
}
