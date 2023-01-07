package lr7.Example1;

public class superClassTest {
    private String str1;
    superClassTest(String strEx){
        this.str1 = strEx;
    }
    superClassTest() {
    }

    @Override
    public String toString() {
        String superClassName;
        superClassName = "super" + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Текстовое 1: " + this.getStr1();
        return superClassName;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }

}
