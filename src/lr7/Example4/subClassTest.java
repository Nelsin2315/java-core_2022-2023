package lr7.Example4;

public class subClassTest extends superClassTest {
    subClassTest(char ch1) {
        super(ch1);
    }

    public String str1;

    public void setCS(char ch1, String str1) {
        super.ch1 = ch1;
        this.str1 = str1;
    }

    subClassTest (char char1, String str1) {
        super(char1);
        this.setCS(char1, str1);
    }

    subClassTest (subClassTest copy) {
        super(copy.ch1);
        this.setCS(copy.ch1, copy.str1);
    }

    @Override
    public String toString() {
        String subValue =
                "\nСтрока: " + this.getStr();
        return super.toString()+subValue;
    }
    public String getStr() {
        return str1;
    }

}
