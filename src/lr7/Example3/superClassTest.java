package lr7.Example3;

public class superClassTest {
    public int int1;

    public void setNumb(int int1) {
        this.int1 = int1;
    }
    public superClassTest (int int2){
        this.int1=int2;
    }

    @Override
    public String toString() {
        return "SuperClassTest(" +
                "int1: " + int1 +
                ')';
    }

}
