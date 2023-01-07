package lr7.Example1;

public class Main {

    public static void main(String[] args) {
        superClassTest superClassObject = new superClassTest("передал в конструктор суперкласса");
        System.out.println(superClassObject.toString());

        subClassTest subClassObject1 = new subClassTest("передал в конструктор подкласса");
        System.out.println(subClassObject1.toString());

        subClassTest subClassObject2 = new subClassTest("передал в конструктор подкласса", "где два параметра");
        System.out.println(subClassObject2.toString());
    }

}
