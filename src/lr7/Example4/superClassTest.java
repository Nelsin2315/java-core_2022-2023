package lr7.Example4;

public class superClassTest {
    public char ch1;

    public void setChar1(char ch1) {
        this.ch1 = ch1;
    }

    superClassTest(char ch1){
        this.setChar1(ch1);
    }

    superClassTest(superClassTest copy){
        this.setChar1(copy.ch1);
    }

    @Override
    public String toString() {
        String superClass;
        superClass =
                "Наименование класса:" + this.getClass().getSimpleName() + "\n" +
                        "Символ:  " + this.getCh1();
        return superClass;
    }

    public char getCh1() {
        return ch1;
    }

}
