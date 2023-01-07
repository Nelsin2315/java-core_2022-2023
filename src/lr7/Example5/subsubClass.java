package lr7.Example5;

public class subsubClass extends subClass {
    protected char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    subsubClass(String str1, char ch1) {
        super(str1);
        this.setCh1(ch1);
    }

    @Override
    public void PrintString() {
        String SubSubPrint =
                "Символ: " + this.getCh1();
        super.PrintString();
        System.out.println(SubSubPrint);
    }
    public char getCh1() {
        return ch1;
    }
}
