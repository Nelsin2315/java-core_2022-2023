package lr7.Example2;

public class superClassTest {

    private String str1;

    superClassTest() {setStr1();}
    superClassTest (String str1){setStr1(str1);}
    public void setStr1 (){
        this.str1 = "Не содержит";
    }
    public void setStr1 (String str1){
        this.str1 = str1;
    }
    public String getStr1(){
        return str1;
    }
    public int getStr1length(){
        return str1.length();
    }
    @Override
    public String toString() {
        String superClassName = "________________________________________\n" +
                "super" + "\n" +
                "Строка =" + getStr1() +  "\n" +
                "Длинна строки = " +getStr1length();
        return superClassName;
    }
}
