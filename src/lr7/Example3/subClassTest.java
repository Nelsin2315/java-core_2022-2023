package lr7.Example3;

public class subClassTest extends superClassTest {
    public char ch1;

    public subClassTest(int int2,char chnum1) {
        super(int2);
        this.ch1=chnum1;
    }

    public subClassTest (int int2) {
        super(int2);
    }

    @Override
    public String toString() {
        return "subClassTest" +
                "str1: " + ch1 + '\'' +
                ", int1: " + int1;
    }

}

