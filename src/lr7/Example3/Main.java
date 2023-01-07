package lr7.Example3;

public class Main {

    public static void main(String[] args) {

        superClassTest Test1 = new superClassTest(10);
        System.out.println (Test1.toString());

        subClassTest Test2 = new subClassTest(15,'T');
        System.out.println (Test2.toString());

        subSubClassTeset Test3 = new subSubClassTeset(20,'E',"Test");
        System.out.println (Test3.toString());

    }

}