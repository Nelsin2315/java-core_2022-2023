package lr7.Example2;

public class subClassTest extends superClassTest{
    private String str2;
    public int int1;
    subClassTest() {
        setStr1();
    }
    subClassTest(String str2) {
        setStr1(str2);
    }
    subClassTest(int int1) {
        setStr1(); this.setInt1(int1);
    }
    subClassTest(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "NotSub";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){
        return int1;
    }

    public String getStr1(){
        return str2;
    }

    public int getStr1length(){
        return str2.length();
    }

    @Override
    public String toString() {
        String ClassValue = "________________________________________\n" +
                "sub" + "\n" +
                "Str: " + getStr1() + "\n" +
                "String: " +"\""+getStr1length()+ "\n" +
                "Int: " + getInt1();
        return ClassValue;
    }
}
