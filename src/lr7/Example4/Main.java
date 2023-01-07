package lr7.Example4;

public class Main {
    public static void main(String[] args) {

        superClassTest superClass = new superClassTest('b');
        System.out.println(superClass.toString());
        System.out.println("________________________________________\n");

        superClassTest superClassCopy = new superClassTest(superClass);
        System.out.println("Копия: " + "\n" + superClassCopy.toString());
        System.out.println("________________________________________\n");

        subClassTest subClass = new subClassTest('H',"Привеееет!");
        System.out.println(subClass.toString());
        System.out.println("________________________________________\n");

        subClassTest subClassCopy = new subClassTest(subClass);
        System.out.println("Копия: " + "\n" + subClassCopy.toString());
        System.out.println("________________________________________\n");

        subsubClassTest subsubClass = new subsubClassTest('J',"Hello!",1232311);
        System.out.println(subsubClass.toString());
        System.out.println("________________________________________\n");


        subsubClassTest subsubClassCopy = new subsubClassTest(subsubClass);
        System.out.println("Копия: " + "\n" + subsubClassCopy.toString());
        System.out.println("________________________________________\n");

    }
}
