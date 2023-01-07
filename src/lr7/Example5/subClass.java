package lr7.Example5;

public class subClass extends superClass {

    protected int int1;

    subClass(String str1) {
        super(str1);
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    subClass(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }
    @Override
    public void PrintString() {
        String PrintSub =
                "Число: " + this.getInt1();
        super.PrintString();
        System.out.println(PrintSub);
    }

    public int getInt1() {
        return int1;
    }
}
