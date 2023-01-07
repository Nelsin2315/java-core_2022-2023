package lr7.Example4;

public class subsubClassTest extends subClassTest {
    subsubClassTest(char ch1) {
        super(ch1);
    }

    public int int1;

    public void setCSI (char char1, String str1, int int1) {
        super.ch1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }

    subsubClassTest(char char1, String str1, int int1) {
        super(char1,str1);
        setCSI (super.ch1, super.str1, int1);
    }

    subsubClassTest(subsubClassTest copy) {
        super(copy.ch1, copy.str1);
        this.setCSI(copy.ch1, copy.str1, copy.int1);
    }

    public String toString() {
        String SubSubValue =
                "\nЦелое: " + this.getInt();
        return super.toString()+SubSubValue;
    }
    public int getInt() {
        return int1;
    }

}
